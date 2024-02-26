#include <iostream>
#include <string>
#include "Clothing.cpp"

class Shirt : public Clothing {
private:
    std::string color;
    std::string sleeveType;

public:
    // Constructor
    Shirt(const std::string& id = "", const std::string& name = "", const std::string& brand = "",
          double price = 0.0, const std::string& size = "", const std::string& material = "",
          const std::string& gender = "", const std::string& color = "", const std::string& sleeveType = "")
        : Clothing(id, name, brand, price, size, material, gender), color(color), sleeveType(sleeveType) {}

    // Getter methods
    std::string getColor() const { return color; }
    std::string getSleeveType() const { return sleeveType; }

    // Setter methods
    void setColor(const std::string& newColor) { color = newColor; }
    void setSleeveType(const std::string& newSleeveType) { sleeveType = newSleeveType; }
};
