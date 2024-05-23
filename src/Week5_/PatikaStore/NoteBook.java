package Week5_.PatikaStore;

public class NoteBook {

    String productName;
    String brand;
    int ID;
    String price;
    int storage;
    double screen;
    int ram;

    public NoteBook(int ID ,String productName,String price, String brand, int storage, double screen, int ram) {
        this.productName = productName;
        this.brand = brand;
        this.ID = ID;
        this.price = price;
        this.storage = storage;
        this.screen = screen;
        this.ram = ram;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString(){
        return String.format("| %-2d | %-29s | %-9s | %-8s | %-5d GB | %-6.1f inç | %-2d GB        |",ID,productName,price,brand,storage,screen,ram);
    }
}
