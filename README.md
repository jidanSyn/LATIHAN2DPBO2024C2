# LATIHAN2DPBO2023 
## Janji
Saya Jidan Abdurahman Aufan NIM [2205422] mengerjakan soal Latihan Praktikum-2 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 

## Deskripsi Program
Program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang mengimplementasikan konsep Multi-level Inheritance  pada kelas Product, Clothing, Shirt.

## Desain Program
![image](https://github.com/jidanSyn/LATIHAN2DPBO2024C2/assets/114399924/2bed5ce9-1c0f-4818-89ee-8f4da99a2443)
## Penjelasan Desain Program :
Program terdiri dari 5* kelas (6 untuk python) yaitu Product, Clothing, Shirt, DataController dan Table (* dan ConsoleUtilities untuk python)
1. Product
   Product merupakan parent/super class yang secara general merepresentasikan suatu produk
3. Clothing
   Clothing merupakan child class dari Product yaitu 'spesialisasi' dari produk yaitu pakaian
5. Shirt
   Shirt merupakan child class dari Clothing yaitu 'spesialisasi' dari pakaian yaitu kemeja
7. DataController
   DataController merupakan class yang berfungsi untuk menampung, memanipulasi, dan menampilkan data - data yang disimpan dalam program,
   memiliki method seperti create, update, dan delete, dan juga showAll yaitu menginstansiasi Tabel untuk memperlihatkan semua data yang dimiliki
9. Table
   Table merupakan kelas untuk menampung data yang akan ditampilkan lewat standard output secara rapih
11. ConsoleUtilities
    Kelas khusus untuk python untuk mendefinisikan pembersihan console yang os-agnostic dikarenakan tidak bisa ifdef
## Dokumentasi Program
### Java, C++, Python
![image](https://github.com/jidanSyn/LATIHAN2DPBO2024C2/assets/114399924/2aeae896-73a2-4948-9cd9-51022c788c54)
# 
![image](https://github.com/jidanSyn/LATIHAN2DPBO2024C2/assets/114399924/2306e7b1-2fb2-4016-af14-ad1b92e6190b)
## Compile & Run Program
C++: dalam directory program
```console
g++ *.cpp && ./a.out
```

Java: dalam directory program
```console
javac *.java && java Main
```

Python: dalam directory program
```console
pyinstaller --onefile *.py
```

PHP: dalam directory program
```console
php -S localhost:9999 -t .
```
lalu buka dalam browser http://localhost:9999

