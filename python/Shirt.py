from Clothing import Clothing

class Shirt(Clothing):

    def __init__(self,id = "", name = "", brand = "", price = 0, size = "", material = "", gender = "", color = "", sleeve_type = ""):
        super().__init__(id, name, brand, price, size, material, gender)
        self.__color = color
        self.__sleeve_type = sleeve_type
    
    def getColor(self):
        return self.__color
    
    def getSleeveType(self):
        return self.__sleeve_type
    
    def setColor(self, color):
        self.__color = color

    def setSleeveType(self, sleeve_type):
        self.__sleeve_type = sleeve_type



    

    

    