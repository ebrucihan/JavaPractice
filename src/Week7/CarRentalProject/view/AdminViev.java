package Week7.CarRentalProject.view;

import Week7.CarRentalProject.business.BookManager;
import Week7.CarRentalProject.business.BrandManager;
import Week7.CarRentalProject.business.CarManager;
import Week7.CarRentalProject.business.ModelManager;
import Week7.CarRentalProject.core.ComboItem;
import Week7.CarRentalProject.core.Helper;
import Week7.CarRentalProject.entity.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class AdminViev extends Layout {
    private JPanel container;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JTabbedPane tab_menu;
    private JButton btn_logout;
    private JPanel pnl_brand;
    private JScrollPane scrl_brand;
    private JTable tbl_brand;
    private JPanel pnl_model;
    private JPanel pnl_hire;
    private JScrollPane scrl_model;
    private JTable tbl_model;
    private JButton btn_search;
    private JComboBox <ComboItem >cmb_brand_search;
    private JComboBox<Model.Type> cmb_type_search;
    private JComboBox <Model.Fuel>cmb_fuel_search;
    private JComboBox <Model.Gear> cmb_gear_search;
    private JLabel lbl_brand;
    private JLabel lbl_type;
    private JLabel lbl_fuel;
    private JLabel lbl_gear;
    private JButton btn_cncl_model;
    private JScrollPane scrl_car;
    private JTable tbl_car;
    private JPanel pnl_booking;
    private JScrollPane scrl_booking;
    private JTable tbl_booking;
    private JFormattedTextField fld_strt_date;
    private JFormattedTextField fld_fnsh_date;
    private JComboBox <Model.Gear> cmb_booking_gear;
    private JComboBox <Model.Fuel >cmb_booking_fuel;
    private JComboBox <Model.Type>cmb_booking_type;
    private JButton btn_booking_search;
    private JButton btn_cncl_booking;
    private JScrollPane scrl_hire;
    private JTable tbl_hire;
    private JComboBox <ComboItem> cmb_car_hire;
    private JButton btn_hire_clear;
    private JButton btn_hire_search;
    private User user;
    private DefaultTableModel tmdl_brand = new DefaultTableModel();
    private DefaultTableModel tmdl_model = new DefaultTableModel();
    private DefaultTableModel tmdl_car = new DefaultTableModel();
    private DefaultTableModel tmdl_booking = new DefaultTableModel();
    private DefaultTableModel tmdl_book = new DefaultTableModel();
    private BrandManager brandManager;
    private ModelManager modelManager;
    private CarManager carManager;
    private BookManager bookManager;
    private JPopupMenu brand_Menu;
    private JPopupMenu model_Menu;
    private JPopupMenu car_menu;
    private JPopupMenu booking_menu;
    private JPopupMenu book_menu;
    private Object[] col_model;
    private Object[] col_car;
    private Object[] col_book;

    public AdminViev(User user){
        this.bookManager = new BookManager();
        this.brandManager = new BrandManager();
        this.modelManager = new ModelManager();
        this.carManager = new CarManager();
        this.add(container);
        this.guiInitilaze(1000,500);
        this.user = user;
        if (this.user == null) {
            dispose();
        }

        this.lbl_welcome.setText("Hoşgeldiniz : " + this.user.getUsername());


        //General Code
        loadCompenent();

        //Brand Tab Menu
        loadBrandTable();
        loadBrandComponent();

        //Model Tab Menu
        loadModelTable(null);
        loadModelCompenent();
        loadModelFilter();

        //Car Tab Menu
        loadCarTable();
        loadCarCompenent();

        //Booking Tab Menu
        loadBookingTable(null);
        loadBookingCompenent();
        loadBookingFilter();

        //Book Tab Menu
        loadBookTable(null);
        loadBookCompenent();
        loadBookFilterCar();






        this.tbl_brand.setComponentPopupMenu(brand_Menu);
        this.tbl_model.setComponentPopupMenu(model_Menu);
        this.tbl_car.setComponentPopupMenu(car_menu);
        this.tbl_hire.setComponentPopupMenu(book_menu);



    }

    private void loadCompenent(){
        this.btn_logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginView loginView = new LoginView();
            }
        });

    }

    private void loadBookingCompenent(){
        this.tbl_booking.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selectedRow = tbl_booking.rowAtPoint(e.getPoint());
                tbl_booking.setRowSelectionInterval(selectedRow, selectedRow);
                if (SwingUtilities.isRightMouseButton(e)) {
                    booking_menu.show(tbl_booking, e.getX(), e.getY());
                }
            }
        });

        this.booking_menu = new JPopupMenu();
        this.booking_menu.add("Rezervasyon Yap").addActionListener(e ->{
            int selectCarId = this.getTableSelectedRow(this.tbl_booking,0);
            BookingView bookingView = new BookingView(
                    this.carManager.getById(selectCarId),
                    this.fld_strt_date.getText(),
                    this.fld_fnsh_date.getText()

            );
            bookingView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBookingTable(null);
                    loadBookingFilter();
                }
            });

        });
        this.tbl_booking.setComponentPopupMenu(booking_menu);

        btn_booking_search.addActionListener(e -> {
            ArrayList<Car> carList= this.carManager.searchForBooking(
                    fld_strt_date.getText(),
                    fld_fnsh_date.getText(),
                    (Model.Type) cmb_booking_type.getSelectedItem(),
                    (Model.Gear) cmb_booking_gear.getSelectedItem(),
                    (Model.Fuel) cmb_booking_fuel.getSelectedItem()

            );

            ArrayList<Object[]> carBookingRow = this.carManager.getForTable(this.col_car.length,carList);
            loadBookingTable(carBookingRow);
        });
        btn_cncl_booking.addActionListener(e -> {
            loadBookingFilter();

        });

    }

    private void loadBookCompenent(){
        this.tbl_hire.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selectedRow = tbl_hire.rowAtPoint(e.getPoint());
                tbl_hire.setRowSelectionInterval(selectedRow, selectedRow);
                if (SwingUtilities.isRightMouseButton(e)) {
                   book_menu.show(tbl_hire, e.getX(), e.getY());
                }
            }
        });
        this.book_menu = new JPopupMenu();
        this.book_menu.add("İptal Et").addActionListener(e -> {
            if (Helper.confirm("sure"));
            int selectedBookId = this.getTableSelectedRow(this.tbl_hire,0);
            if (this.bookManager.delete(selectedBookId)){
                loadBookTable(null);


            }else {
                Helper.showMsg("error");

            }


        });

        this.tbl_hire.setComponentPopupMenu(book_menu);

        btn_hire_search.addActionListener(e -> {
            ComboItem selectedCar = (ComboItem) cmb_car_hire.getSelectedItem();
            int carId = 0;
            if (selectedCar != null) {
                carId = selectedCar.getKey();
            }
            ArrayList<Book> bookListBySearch = this.bookManager.searchForTable(carId);
            ArrayList<Object[]> bookRowListBySearch = this.bookManager.getForTable(this.col_book.length, bookListBySearch);
            loadBookTable(bookRowListBySearch);
        });

        this.btn_hire_clear.addActionListener(e -> {
            loadBookFilterCar();
        });



    }
    private void loadBookingTable(ArrayList<Object[]> carList) {
        Object[] col_booking_list = {"ID", "Marka", "Model", "Plaka", "Renk", "KM", "Yıl", "Tip", "Yakıt Türü", "Vites"};
        createTable(this.tmdl_booking, this.tbl_booking,col_booking_list,carList);
    }


    private void loadBookTable(ArrayList<Object[]> bookList){
        col_book = new Object[] {"ID","Plaka","Araç Marka","Araç Model","Müşteri","Telefon","Mail","T.C.","Başlangıç Tarihi","Bitiş Tarihi","Fiyat"};
        if (bookList == null) {
            bookList = this.bookManager.getForTable(col_book.length,this.bookManager.findAll());
        }
        createTable(this.tmdl_book,this.tbl_hire,col_book,bookList);
    }

    public void loadBookingFilter(){
        this.cmb_booking_type.setModel(new DefaultComboBoxModel<>(Model.Type.values()));
        this.cmb_booking_type.setSelectedItem(null);
        this.cmb_booking_gear.setModel(new DefaultComboBoxModel<>(Model.Gear.values()));
        this.cmb_booking_gear.setSelectedItem(null);
        this.cmb_booking_fuel.setModel(new DefaultComboBoxModel<>(Model.Fuel.values()));
        this.cmb_booking_fuel.setSelectedItem(null);
    }

    public void loadBookFilterCar(){
        this.cmb_car_hire.removeAllItems();
        for (Car car : carManager.findAll()) {
            cmb_car_hire.addItem(new ComboItem(car.getId(),car.getPlate()));
        }

       this.cmb_car_hire.setSelectedItem(null);



    }


    public void loadModelFilter(){
        this.cmb_type_search.setModel(new DefaultComboBoxModel<>(Model.Type.values()));
        this.cmb_type_search.setSelectedItem(null);
        this.cmb_gear_search.setModel(new DefaultComboBoxModel<>(Model.Gear.values()));
        this.cmb_gear_search.setSelectedItem(null);
        this.cmb_fuel_search.setModel(new DefaultComboBoxModel<>(Model.Fuel.values()));
        this.cmb_fuel_search.setSelectedItem(null);
        loadModelFilterBrand();

    }


    public void loadModelFilterBrand(){
        this.cmb_brand_search.removeAllItems();
        for (Brand obj : brandManager.findAll()) {
            this.cmb_brand_search.addItem(new ComboItem(obj.getId(),obj.getName()));
        }
        this.cmb_brand_search.setSelectedItem(null);
    }

    private void loadCarCompenent(){
        this.tbl_car.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selectedRow = tbl_car.rowAtPoint(e.getPoint());
                tbl_car.setRowSelectionInterval(selectedRow, selectedRow);
                if (SwingUtilities.isRightMouseButton(e)) {
                    car_menu.show(tbl_car, e.getX(), e.getY());
                }
            }
        });

        this.car_menu = new JPopupMenu();
        this.car_menu.add("Yeni").addActionListener(e -> {
            CarView carView = new CarView(new Car());
            carView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadCarTable();

                }
            });
        });
        this.car_menu.add("Güncelle").addActionListener(e -> {
            int selectCarId = this.getTableSelectedRow(tbl_car,0);
            CarView carView = new CarView(this.carManager.getById(selectCarId));
            carView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadCarTable();

                }
            });

        });

        this.car_menu.add("Sil").addActionListener(e -> {
            if (Helper.confirm("sure")){
                int selectCarId = this.getTableSelectedRow(tbl_car,0);
                if (this.carManager.delete(selectCarId)){
                    Helper.showMsg("done");
                    loadCarTable();

                }else {
                    Helper.showMsg("error");
                }
            }


        });
        this.tbl_car.setComponentPopupMenu(car_menu);


    }


    public void loadCarTable(){
         col_car = new Object[] {"ID", "Marka", "Model", "Plaka", "Renk", "KM", "Yıl", "Tip", "Yakıt Türü", "Vites"};
        ArrayList<Object[]> carList = this.carManager.getForTable(col_car.length, this.carManager.findAll());
       createTable(this.tmdl_car,this.tbl_car,col_car,carList);

    }



    public void loadModelCompenent(){
        this.tbl_model.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selectedRow = tbl_model.rowAtPoint(e.getPoint());
                tbl_model.setRowSelectionInterval(selectedRow, selectedRow);
                if (SwingUtilities.isRightMouseButton(e)) {
                    model_Menu.show(tbl_model, e.getX(), e.getY());
                }
            }
        });

        this.model_Menu = new JPopupMenu();
        this.model_Menu.add("Yeni").addActionListener(e -> {
            ModelView modelView = new ModelView(new Model());
            modelView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadModelTable(null);
                }
            });

        });
        this.model_Menu.add("Güncelle").addActionListener(e -> {
            int selectModelId = this.getTableSelectedRow(tbl_model,0);
            ModelView modelView = new ModelView(this.modelManager.getById(selectModelId));
            modelView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadModelTable(null);
                    loadCarTable();
                    loadBookTable(null);
                }
            });

        });

        this.model_Menu.add("Sil").addActionListener(e -> {
            if (Helper.confirm("sure")){
                int selectModelId = this.getTableSelectedRow(tbl_model,0);
                if (this.modelManager.delete(selectModelId)){
                    Helper.showMsg("done");
                    loadModelTable(null);
                    loadCarTable();
                }else {
                    Helper.showMsg("error");
                }
            }
        });

        this.tbl_model.setComponentPopupMenu(model_Menu);

        this.btn_search.addActionListener(e -> {
           ComboItem selectedBrand = (ComboItem) this.cmb_brand_search.getSelectedItem();
           int brandId = 0;
           if (selectedBrand != null){
               brandId = selectedBrand.getKey();
           }
            ArrayList<Model> modelListBySearch = this.modelManager.searchForTable(
                   brandId,
                   (Model.Fuel) cmb_fuel_search.getSelectedItem(),
                   (Model.Gear) cmb_gear_search.getSelectedItem(),
                   (Model.Type) cmb_type_search.getSelectedItem()

           );

            ArrayList<Object[]> modelRowListBySearch = this.modelManager.getForTable(this.col_model.length,modelListBySearch);
            loadModelTable(modelRowListBySearch);

        });

        this.btn_cncl_model.addActionListener(e -> {
            this.cmb_type_search.setSelectedItem(null);
            this.cmb_gear_search.setSelectedItem(null);
            this.cmb_fuel_search.setSelectedItem(null);
            this.cmb_brand_search.setSelectedItem(null);
            loadModelTable(null);

        });
    }

    public void loadModelTable(ArrayList<Object[]> modelList){
        this.col_model = new Object[]{"Model ID" , "Marka" , "Model Adı" , "Tip" , "Yıl" , "Yakıt Türü" , "Vites"};
        if (modelList == null) {
            modelList = this.modelManager.getForTable(this.col_model.length,this.modelManager.findAll());
        }
        createTable(this.tmdl_model, this.tbl_model, col_model, modelList);

    }

    public void loadBrandComponent(){
        this.tbl_brand.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selectedRow = tbl_brand.rowAtPoint(e.getPoint());
                tbl_brand.setRowSelectionInterval(selectedRow, selectedRow);
                if (SwingUtilities.isRightMouseButton(e)) {
                    brand_Menu.show(tbl_brand, e.getX(), e.getY());
                }
            }
        });

        this.brand_Menu = new JPopupMenu();
        this.brand_Menu.add("Yeni").addActionListener(e -> {
            BrandView brandView = new BrandView(null);
            brandView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                    loadModelTable(null);
                    loadModelFilterBrand();

                }
            });
        });
        this.brand_Menu.add("Güncelle").addActionListener(e -> {
            int selectBrandId = this.getTableSelectedRow(tbl_brand,0);
            BrandView brandView = new BrandView(this.brandManager.getById(selectBrandId));
            brandView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                    loadModelTable(null);
                    loadModelFilterBrand();
                    loadCarTable();
                    loadBookTable(null);
                }
            });

        });

        this.brand_Menu.add("Sil").addActionListener(e -> {
            if (Helper.confirm("sure")){
                int selectBrandId = this.getTableSelectedRow(tbl_brand,0);
                if (this.brandManager.delete(selectBrandId)){
                    Helper.showMsg("done");
                    loadBrandTable();
                    loadModelTable(null);
                    loadModelFilterBrand();
                    loadCarTable();
                }else {
                    Helper.showMsg("error");
                }
            }


        });
        this.tbl_brand.setComponentPopupMenu(brand_Menu);


    }
    public void loadBrandTable() {
        Object[] col_brand = {"Marka ID" , "Marka Adı"};
        ArrayList<Object[]> brandList = this.brandManager.getForTable(col_brand.length);
        this.createTable(this.tmdl_brand,this.tbl_brand,col_brand,brandList);

     }

    private void createUIComponents() throws ParseException {
        this.fld_strt_date = new JFormattedTextField(new MaskFormatter("##/##/####"));
        this.fld_strt_date.setText("10/10/2023");
        this.fld_fnsh_date = new JFormattedTextField(new MaskFormatter("##/##/####"));
        this.fld_fnsh_date.setText("16/10/2023");

    }

}

