// kelas shirt memiliki inheritance dari kelas clothing
public class Shirt extends Clothing {

    private String color, sleeveType;


    // constructor langsung set semua attribute yang dimiliki kelas Shirt, termasuk attribute2 warisan dari Clothing dan Product
    public Shirt(String idProduct, String name, String brand, int price, String size, String material, String gender,
            String color, String sleeveType) {
        super(idProduct, name, brand, price, size, material, gender);
        this.color = color;
        this.sleeveType = sleeveType;
    }

    // constructor set attribute shirt saja
    public Shirt(String color, String sleeveType) {
        this.color = color;
        this.sleeveType = sleeveType;
    }

    // getters & setters
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSleeveType() {
        return sleeveType;
    }

    public void setSleeveType(String sleeveType) {
        this.sleeveType = sleeveType;
    }

    
    
}
