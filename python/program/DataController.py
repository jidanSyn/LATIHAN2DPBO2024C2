from Shirt import Shirt
from Table import Table

class DataController:
    
    __container = []

    def __init__(self):
        pass


    def getContainer(self):
        return self.__container
    
    def setContainer(self, container):
        self.__container = container

    def searchByID(self, id):
        found = False
        index = 0
        while not found and index < len(self.__container):
            if(self.__container[index].getId() == id):
                found = True
            else:
                index += 1
        
        if found:
            return self.__container[index]
        else:
            return None
        
    def createData(self):
        id = ""
        name = ""
        brand = ""
        price = 0
        size = ""
        material = ""
        gender = ""
        color = ""
        sleeve_type = ""

        print("Please give attributes for new data:")
        print("ID                 : ", end='')
        id = input()
        print("Name               : ", end='')
        name = input()
        print("Brand              : ", end='')
        brand = input()
        print("Price              : ", end='')
        price = int(input())
        print("Size               : ", end='')
        size = input()
        print("Material           : ", end='')
        material = input()
        print("Gender             : ", end='')
        gender = input()
        print("Color              : ", end='')
        color = input()
        print("Sleeve Type        : ", end='')
        sleeve_type = input()


        shirt = Shirt(id, name, brand, price, size, material, gender, color, sleeve_type)

        self.__container.append(shirt)

        print("Data has been successfully created!")

    
    def modifyData(self):
        targetID = ""
        print("PLease select data to modify by ID : ", end='')
        targetID = input()
        target = self.searchByID(targetID)

        if(target is None):
            print("Data was not found!")
            return
        
        print("Data found. Please enter new data attributes")

        name = ""
        brand = ""
        price = 0
        size = ""
        material = ""
        gender = ""
        color = ""
        sleeve_type = ""

        print("Please give attrubutes for new data:")
        print("Name               : ", end='')
        name = input()
        print("Brand              : ", end='')
        brand = input()
        print("Price              : ", end='')
        price = input()
        print("Size               : ", end='')
        size = input()
        print("Material           : ", end='')
        material = input()
        print("Gender             : ", end='')
        gender = input()
        print("Color              : ", end='')
        color = input()
        print("Sleeve Type        : ", end='')
        sleeve_type = input()


        target.setName(name)
        target.setBrand(brand)
        target.setPrice(price)
        target.setSize(size)
        target.setMaterial(material)
        target.setGender(gender)
        target.setColor(color)
        target.setSleeveType(sleeve_type)

        print("Data successfully modified!")

    def deleteData(self):
        
        targetID = ""
        print("Please select data to delete by ID : ", end='')
        targetID = input()
        target = self.searchByID(targetID)

        if(target is None):
            print("Data was not found!")
            return
        
        print("Data has been found.")
        print("{}. {}".format(target.getId(), target.getName()))
        print("Confirm to delete? (y/n)")
        del_confirm = input()
        if del_confirm == 'y':
            self.__container.remove(target)
            print("Data has successfully been deleted")
        else:
            print("Cancelled data deletion")
    

    def showAll(self):
        table = Table()
        data = [["" for j in range(9)] for i in range(len(self.__container) + 1) ] # + 1 untuk diawal diisi dengan header tabel

        data[0][0] = "Product ID"
        data[0][1] = "Name"
        data[0][2] = "Brand"
        data[0][3] = "Price"
        data[0][4] = "Size"
        data[0][5] = "Material"
        data[0][6] = "Gender"
        data[0][7] = "Color"
        data[0][8] = "Sleeve Type"

        for i, shirt in enumerate(self.__container):
            data[i + 1][0] = shirt.getId()
            data[i + 1][1] = shirt.getName()
            data[i + 1][2] = shirt.getBrand()
            data[i + 1][3] = str(shirt.getPrice())  
            data[i + 1][4] = shirt.getSize()
            data[i + 1][5] = shirt.getMaterial()
            data[i + 1][6] = shirt.getGender()
            data[i + 1][7] = shirt.getColor()
            data[i + 1][8] = shirt.getSleeveType()

        table.createRows(len(self.__container) + 1, 9, data)
        print("\n")
                
