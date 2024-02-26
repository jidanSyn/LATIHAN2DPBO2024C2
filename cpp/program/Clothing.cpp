#include <iostream>
#include <string>
#include "Product.cpp"

class Clothing : public Product {
private:
    std::string size;
    std::string material;
    std::string gender;

public:
    // Constructor
    Clothing(const std::string& id = "", const std::string& name = "", const std::string& brand = "",
             double price = 0.0, const std::string& size = "", const std::string& material = "",
             const std::string& gender = "")
        : Product(id, name, brand, price), size(size), material(material), gender(gender) {}

    // Getter methods
    std::string getSize() const { return size; }
    std::string getMaterial() const { return material; }
    std::string getGender() const { return gender; }

    // Setter methods
    void setSize(const std::string& newSize) { size = newSize; }
    void setMaterial(const std::string& newMaterial) { material = newMaterial; }
    void setGender(const std::string& newGender) { gender = newGender; }
};
