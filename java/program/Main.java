import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        int inputSelection = -1;    // variabel untuk kontrol menu
        Scanner scanner = new Scanner(System.in);   // scanner utk input user
        DataController dataController = new DataController();   // instansiasi data controller
        boolean exceptionCaught;    // variabel utk pengecekan apakah ada error

        // set wadah untuk data dummy
        ArrayList<Shirt> container = new ArrayList<>();
        // isi wadah dengan data - data
        Shirt temp = new Shirt("asdf1", "White T-shirt", "Uniqlo", 170000, "M", "Cotton", "Unisex", "White", "Long-sleeve");
        container.add(temp);
        temp = new Shirt("asdf2", "Aiaia", "Uniqlo", 180000, "S", "Cotton", "Unisex", "Maroon", "Short-sleeve");
        container.add(temp);
        temp = new Shirt("asdf3", "Aiaia", "Uniqlo", 170000, "M", "Cotton", "Unisex", "White", "Long-sleeve");
        container.add(temp);

        // set container data controller dengan yang sudah diisi
        dataController.setContainer(container);

        // loop program
        do {
            exceptionCaught = false;
            // membersihkan CLI
            System.out.print("\033[H\033[2J");  
            System.out.flush(); // pastikan sisa buffer output terbuang

            // message
            System.out.println("Welcome to Product Database System!");
            // prompt pemilihan menu
            System.out.println("What will you do? Select 1:\n 1. Create a new data\n 2. Modify an existing data\n 3. Delete a data\n 4. Show table of all existing data\n 0. End program\n");

            // ambil & cek pilihan menu
            try {
                inputSelection = scanner.nextInt();
            } catch(Exception e){
                // bila user mengisi bukan integer
                System.err.println("The input is not an integer!");
                exceptionCaught = true;
            }

            // lanjut proses jika ? eh ini perlu g ya? kek bisa dibuang if ny
            if(!exceptionCaught) {
                
                // switch case untuk pemilihan menu
                switch(inputSelection) {
                    case 0: // jika end program
                        System.out.println("See you next time!");
                        break;
                    case 1: // jika create data, panggil method pembuatan data dari data controller
                        dataController.createData();
                        break;
                    case 2: // jika modifikasi data, panggil method modifikasi data dari data controller
                        dataController.modifyData();
                        break;
                    case 3: // jika menghapus data, panggil method penghapusan data dari data controller
                        dataController.deleteData();
                        break;
                    case 4: // jika memperlihatkan data, panggil method tampilan data dari data controller
                        dataController.showAll();
                        break;
                    default:    // default jika tidak ada dalam pilihan menu
                        System.err.println("Invalid option!");
                        break;
                }
            }

            // jika bukan end program, pause program sampai input enter agar tampilan tidak langsung hilang
            if(inputSelection != 0) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
                scanner.nextLine();
            }


        } while (inputSelection != 0);

        scanner.close();
    }
}