#include <iostream>
#include <string>

class Product {
    private:
        std::string id;
        std::string name;
        std::string brand;
        int price;

    public:
        // Constructor
        Product(const std::string& id = "", const std::string& name = "", const std::string& brand = "", int price = 0.0) 
            : id(id), name(name), brand(brand), price(price) {}

        // Getter methods
        std::string getId() const { return id; }
        std::string getName() const { return name; }
        std::string getBrand() const { return brand; }
        int getPrice() const { return price; }

        // Setter methods
        void setId(const std::string& newId) { id = newId; }
        void setName(const std::string& newName) { name = newName; }
        void setBrand(const std::string& newBrand) { brand = newBrand; }
        void setPrice(int newPrice) { price = newPrice; }
};
