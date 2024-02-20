import java.util.Scanner;
import java.util.ArrayList;


public class DataController {

    // wadah data
    private ArrayList<Shirt> container = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);


    public DataController() {

    }

    public DataController(ArrayList<Shirt> src) {
        this.container = src;
    }

    public ArrayList<Shirt> getContainer() {
        return this.container;
    }

    public void setContainer(ArrayList<Shirt> container) {
        this.container = container;
    }

    // method mencari data dari wadah berdasarkan id
    public Shirt searchById(String id) {
        for(Shirt obj : this.container) {
            if(obj.getIdProduct().equals(id)) {
                return obj;
            }
        }
        return null;
    }

    // menambah data ke wadah
    public void createData() {
        String id, name, brand, size, material, gender, color, sleeveType;
        int price;

        // ambil input attribute attribute dari user
        System.out.println("\nPlease give attributes for new data:");
        System.out.print("Product ID  : ");
        id = sc.next();
        sc.nextLine();
        System.out.print("Name        : ");
        name = sc.nextLine();
        System.out.print("Brand       : ");
        brand = sc.nextLine();
        System.out.print("Price       : ");
        price = sc.nextInt();
        sc.nextLine();
        System.out.print("Size        : ");
        size = sc.nextLine();
        System.out.print("Material    : ");
        material = sc.nextLine();
        System.out.print("Gender      : ");
        gender = sc.nextLine();
        System.out.print("Color       : ");
        color = sc.nextLine();
        System.out.print("Sleeve Type :");
        sleeveType = sc.nextLine();

        // instansiasi objek dengan attribut yang sudah diberikan
        Shirt temp = new Shirt(id, name, brand, price, size, material, gender, color, sleeveType);
        // sambungkan objek ke wadah
        this.container.add(temp);

        System.out.println("Data has been successfully created!");
        

    }

    public void modifyData() {
        String targetID;
        // minta id data yang ingin di modifikasi
        System.out.print("\nPlease select data to modify by ID : ");
        targetID = sc.next();

        // cari datanya & cek apakah ditemukan
        Shirt target = this.searchById(targetID);
        if(target == null) {
            System.err.println("Data was not found!");  // jika tidak ditemukan, keluar dari method modifikasi
            return; 
        }

        // jika ditemukan data, lanjut minta attribut attribut baru untuk data yang dipilih
        System.out.println("\nData found. Please enter new data attributes");
        sc.nextLine();

        int price;
        String name, brand, size, material, gender, color, sleeveType;

        System.out.print("Name        : ");
        name = sc.nextLine();
        System.out.print("Brand       : ");
        brand = sc.nextLine();
        System.out.print("Price       : ");
        price = sc.nextInt();
        System.out.print("Size        : ");
        size = sc.nextLine();
        System.out.print("Material    : ");
        material = sc.nextLine();
        System.out.print("Gender      : ");
        gender = sc.nextLine();
        System.out.print("Color       : ");
        color = sc.nextLine();
        System.out.print("Sleeve Type :");
        sleeveType = sc.nextLine();

        // ubah attribut data
        target.setName(name);
        target.setBrand(brand);
        target.setPrice(price);
        target.setSize(size);
        target.setMaterial(material);
        target.setGender(gender);
        target.setColor(color);
        target.setSleeveType(sleeveType);

        System.out.println("Data successfully modified!");

    }

    public void deleteData() {
        // cari data berdasarkan id
        String targetID;
        System.out.print("\nPlease select data to delete by ID : ");
        targetID = sc.next();

        // cari dan cek apakah ditemukan
        Shirt target = this.searchById(targetID);
        if(target == null) {
            System.err.println("Data was not found!");  // jika tidak ditemukan maka keluar dari method
            return;
        }

        // jika ditemukan datanya

        System.out.println("Data has been found.");
        // menampilkan nama data yg ditemukan 
        System.out.println(target.getIdProduct() + ". " + target.getName());
        // konfirmasi penghapusan data
        System.out.println("Confirm to delete? (y/n)");

        char del_confirm = sc.next().charAt(0);
        // cek apakah dikonfirmasi atau tdk
        if(del_confirm == 'y') {
            this.container.remove(target); // hapus data
        } else {
            // penghapusan dibatalkan
            System.out.println("Cancelled data deletion\n");
        }
        
        
    }
    
    public void showAll() {
        Table table = new Table();  // instansiasi sebuah tabel
        int numRows = this.container.size();    // cek berapa baris yang akan dibutuhkan berdasarkan ukuran wadah data
        
        String[][] data = new String[numRows + 1][9];   // buat 2d array string baris data (+1 untuk kepala tabel)* jumlah kolom
        
        // set baris pertama untuk kepala tabel nya
        data[0][0] = "Product ID";
        data[0][1] = "Name";
        data[0][2] = "Brand";
        data[0][3] = "Price";
        data[0][4] = "Size";
        data[0][5] = "Material";
        data[0][6] = "Gender";
        data[0][7] = "Color";
        data[0][8] = "Sleeve Type";




        // ambil value string dari setiap attribut semua data dan disimpan ke 2d string
        for (int i = 0; i < numRows; i++) {
            Shirt Shirt = container.get(i);
            data[i + 1][0] = Shirt.getIdProduct();
            data[i + 1][1] = Shirt.getName();
            data[i + 1][2] = Shirt.getBrand();
            data[i + 1][3] = Integer.toString(Shirt.getPrice());    // konversi integer ke string
            data[i + 1][4] = Shirt.getSize();
            data[i + 1][5] = Shirt.getMaterial();
            data[i + 1][6] = Shirt.getGender();
            data[i + 1][7] = Shirt.getColor();
            data[i + 1][8] = Shirt.getSleeveType();



        }

        // panggil fungsi pembuatan baris tabel
        table.createRows(numRows + 1, 9, data);
        
    }

}
