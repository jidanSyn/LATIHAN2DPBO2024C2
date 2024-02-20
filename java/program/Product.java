// enkapsulasi kelas product
public class Product {

    private String idProduct;
    private String name;
    private String brand;
    private int price;

    // empty constructor agar bisa membuat child class nanti tanpa langsung set attribut Product
    public Product() {
        
    }

    // constructor langsung dengan attribut
    public Product(String idProduct, String name, String brand, int price) {
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // getters & setters
    
    public String getIdProduct() {
        return this.idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
