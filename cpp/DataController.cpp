#pragma once
#include <iostream>
#include <string>
#include <list>
#include "Table.cpp"
#include "Shirt.cpp" // Include the Shirt class header file

using namespace std;

class DataController
{
private:
    list<Shirt> container; // container for all the data

public:

    DataController() {
        // empty constructor, container will be initialized as an empty list
    }

    // getter and setter for container

    list<Shirt>& getContainer() {
        return this->container;
    }

    void setContainer(list<Shirt>& container) {
        this->container = container;
    }

    // searching a specific data using id
    list<Shirt>::iterator searchByID(string id) {

        bool found = false;
        list<Shirt>::iterator it = this->container.begin();    // iterator to find
        list<Shirt>::iterator it_found = it;   // iterator copy to store found data
        while (found != true && it != this->container.end()) {
            if (it->getId() == id) {
                found = true;
                it_found = it;  // store found data location
            }
            it++;
        }

        if (found) {
            return it_found;    // return found data location
        }
        else {
            return this->container.end(); // else return .end() to indicate data wasn't found
        }
    }

    void createData() {

        // temp variables for inputs
        string tempId, tempName, tempBrand, tempSize, tempMaterial, tempGender, tempColor, tempSleeveType;
        double tempPrice;

        cout << "Please give attributes for new data:\n";
        cout << "ID : ";
        cin >> tempId;
        cout << "Name : ";
        cin >> tempName;
        cout << "Brand : ";
        cin >> tempBrand;
        cout << "Price : ";
        cin >> tempPrice;
        cout << "Size : ";
        cin >> tempSize;
        cout << "Material : ";
        cin >> tempMaterial;
        cout << "Gender : ";
        cin >> tempGender;
        cout << "Color : ";
        cin >> tempColor;
        cout << "Sleeve Type : ";
        cin >> tempSleeveType;

        // instantiate a Shirt object with inputted values
        Shirt new_data(tempId, tempName, tempBrand, tempPrice, tempSize, tempMaterial, tempGender, tempColor, tempSleeveType);

        // push back new data to container
        this->container.push_back(new_data);

        cout << "Data has been successfully created!\n";
    }

    void modifyData() {

        string target_id;
        cout << "Please select data to modify by ID\n";
        cin >> target_id;
        list<Shirt>::iterator target = searchByID(target_id);
        if (target == this->container.end()) {
            cout << "Data was not found!\n";
            return;
        }

        string tempName, tempBrand, tempSize, tempMaterial, tempGender, tempColor, tempSleeveType;
        double tempPrice;

        cout << "Data found. Please enter new data\n";
        cout << "Name : ";
        cin >> tempName;
        cout << "Brand : ";
        cin >> tempBrand;
        cout << "Price : ";
        cin >> tempPrice;
        cout << "Size : ";
        cin >> tempSize;
        cout << "Material : ";
        cin >> tempMaterial;
        cout << "Gender : ";
        cin >> tempGender;
        cout << "Color : ";
        cin >> tempColor;
        cout << "Sleeve Type : ";
        cin >> tempSleeveType;

        target->setName(tempName);
        target->setBrand(tempBrand);
        target->setPrice(tempPrice);
        target->setSize(tempSize);
        target->setMaterial(tempMaterial);
        target->setGender(tempGender);
        target->setColor(tempColor);
        target->setSleeveType(tempSleeveType);

        cout << "Data successfully modified!\n";

    }

    void deleteData() {

        string target_id;
        cout << "Please select data to modify by ID\n";
        cin >> target_id;

        list<Shirt>::iterator target = searchByID(target_id);
        char del_confirm_input;


        if (target == this->container.end()) {
            cout << "Data was not found!\n";
            return;
        }

        cout << "Data has been found:\n";

        // deletion confirmation
        cout << target->getId() << " | " << target->getName() << "\n\nConfirm to delete?(y/n)\n";
        cin >> del_confirm_input;
        if (del_confirm_input == 'y') {
            this->container.erase(target);
            cout << "Data has successfully been deleted\n";
        }
        else {
            cout << "Canceled data deletion\n";
        }
    }


    void showAll() {
        Table table;

        // Create data vector
        std::vector<std::vector<std::string>> data;

        // Header row
        data.push_back({"Product ID", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type"});

        // Iterate through container to populate data
        for (const auto& shirt : container) {
            data.push_back({
                shirt.getId(),
                shirt.getName(),
                shirt.getBrand(),
                std::to_string(shirt.getPrice()), // Convert price to string
                shirt.getSize(),
                shirt.getMaterial(),
                shirt.getGender(),
                shirt.getColor(),
                shirt.getSleeveType()
            });
        }

        // Call createRows method
        table.createRows(data.size(), data[0].size(), data);
    }

    // destructor
    ~DataController() {

    }

};
