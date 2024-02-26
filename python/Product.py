class Product:

    def __init__(self, id = "", name = "", brand = "", price = 0):
        self.__id = id
        self.__name = name
        self.__brand = brand
        self.__price = price

    def getId(self):
        return self.__id
    
    def getName(self):
        return self.__name
    
    def getBrand(self):
        return self.__brand
    
    def getPrice(self):
        return self.__price
    
    def setId(self, id):
        self.__id = id

    def setName(self, name):
        self.__name = name

    def setBrand(self, brand):
        self.__brand = brand

    def setPrice(self, price):
        self.__price = price


    

    

    