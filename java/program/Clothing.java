// kelas Clothing memiliki inheritance dari product
public class Clothing extends Product{
    

    private String size;
    private String material;
    private String gender;

    // empty constructor
    public Clothing() {

    }

    // constructor dengan set attribute
    public Clothing(String size, String material, String gender) {
        this.size = size;
        this.material = material;
        this.gender = gender;
    }
    
    // constructor dengan set attribute kelas clothing dan attribute kelas parent (Product)
    public Clothing(String idProduct, String name, String brand, int price, String size, String material,
            String gender) {
        super(idProduct, name, brand, price);   // memanggil constructor superclass/parent
        this.size = size;
        this.material = material;
        this.gender = gender;
    }
    // getters & setters
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    

}
