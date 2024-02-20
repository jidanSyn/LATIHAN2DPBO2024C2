
public class Shirt extends Clothing {

    private String color, sleeveType;

    


    public Shirt(String idProduct, String name, String brand, int price, String size, String material, String gender,
            String color, String sleeveType) {
        super(idProduct, name, brand, price, size, material, gender);
        this.color = color;
        this.sleeveType = sleeveType;
    }

    public Shirt(String color, String sleeveType) {
        this.color = color;
        this.sleeveType = sleeveType;
    }

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
