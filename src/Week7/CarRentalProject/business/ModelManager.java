package Week7.CarRentalProject.business;

import Week7.CarRentalProject.core.Helper;
import Week7.CarRentalProject.dao.ModelDao;
import Week7.CarRentalProject.entity.Model;

import java.util.ArrayList;

public class ModelManager {
    private final ModelDao modelDao = new ModelDao();

    public Model getById(int id) {
        return this.modelDao.getById(id);
    }

    public ArrayList<Model> findAll() {
        return this.modelDao.findAll();
    }

    public ArrayList<Object[]> getForTable(int size, ArrayList<Model> modelList) {
        ArrayList<Object[]> modelObjList = new ArrayList<>();
        for (Model obj : modelList) {
            int i = 0;
            Object[] rowObject = new Object[size];
            rowObject[i++] = obj.getId();
            if (obj.getBrand() != null) {
                rowObject[i++] = obj.getBrand().getName();
            } else {
                rowObject[i++] = "Marka Bulunamadı"; // Veya başka bir hata mesajı
            }
            rowObject[i++] = obj.getName();
            rowObject[i++] = obj.getType();
            rowObject[i++] = obj.getYear();
            rowObject[i++] = obj.getFuel();
            rowObject[i++] = obj.getGear();
            modelObjList.add(rowObject);
        }

        return modelObjList;
    }

    public boolean save(Model model) {
        if (this.getById(model.getId()) != null) {
            Helper.showMsg("error");
            return false;
        }

        return this.modelDao.save(model);
    }

    public boolean update(Model model) {
        if (this.getById(model.getId()) == null) {
            Helper.showMsg(model.getName() + "ID kayıtlı model bulunamadı");
            return false;
        }
        return this.modelDao.update(model);
    }

    public boolean delete(int id) {
        if (this.getById(id) == null) {
            Helper.showMsg(id + "ID kayıtlı model bulunamadı");
            return false;
        }
        return this.modelDao.delete(id);
    }

    public ArrayList<Model> getByListBrandId(int brandId) {
        return this.modelDao.getByBrandListId(brandId);
    }

    public ArrayList<Model> searchForTable (int brandId, Model.Fuel fuel, Model.Gear gear, Model.Type type){
        String select = "SELECT * FROM public.model";
        ArrayList<String> whereList = new ArrayList<>();
        if (brandId != 0) {
            whereList.add("model_brand_id = " + brandId);

        }
        if (fuel != null){
            whereList.add("model_fuel ='" + fuel.toString() + "'");
        }
        if (gear != null){
            whereList.add("model_gear ='" + gear.toString() + "'");
        }
        if (type != null){
            whereList.add("model_type ='" + type.toString() + "'");
        }

        String whereStr = String.join(" AND ", whereList);
        String query = select;
        if (whereStr.length() > 0){
            query += " WHERE " + whereStr;
        }
        return this.modelDao.selectByQuery(query);


    }
}
