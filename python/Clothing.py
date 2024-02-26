from Product import Product

class Clothing(Product):

    def __init__(self,id = "", name = "", brand = "", price = 0, size = "", material = "", gender = ""):
        super().__init__(id, name, brand, price)
        self.__size = size
        self.__material = material
        self.__gender = gender

    def getSize(self):
        return self.__size
    
    def getMaterial(self):
        return self.__material
    
    def getGender(self):
        return self.__gender

    def setId(self, id):
        self.__id = id

    def setSize(self, size):
        self.__size = size

    def setMaterial(self, material):
        self.__material = material

    def setGender(self, gender):
        self.__gender = gender


    

    

    