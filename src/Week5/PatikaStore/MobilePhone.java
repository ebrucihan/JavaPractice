package Week5.PatikaStore;

// Cep telefonu ürünlerini temsil eden sınıf
public class MobilePhone {

    int ID;
    String productName;
    String price;
    String brand;
    int storage;
    double screen;
    int camera;
    double battery;
    int ram;
    String color;

    public MobilePhone(int ID, String productName, String price, String brand, int storage, double screen, int camera, double battery, int ram, String color) {
        this.ID = ID;
        this.productName = productName;
        this.price = price;
        this.brand = brand;
        this.storage = storage;
        this.screen = screen;
        this.camera = camera;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    //Get-Set Metotları
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Cep telefonu bilgilerini formatlı bir şekilde döndüren metot
    @Override
    public String toString(){
        return String.format("| %-2d | %-30s | %-9s | %-10s | %-12s | %-8s | %-10s | %-11s | %-9s | %-8s |",ID,productName,price,brand,storage,screen,camera,battery,ram,color);
    }
}
