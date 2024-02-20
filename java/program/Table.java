import java.util.Arrays;

// kelas tabel
public class Table {

    private int rows;
    private int cols;

    Table() {

    }

    // getters & setters

    public int getRows() {
        return this.rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return this.cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    // pembuatan baris - baris, menerima input jumlah baris dan kolom, juga 2d array string yang akan menjadi konten tabel
    public void createRows(int rows, int cols, String data[][]) {
        
        int[] maxLen = new int[cols];   // int array untuk menampung panjang string terpanjang untuk setiap kolom

        Arrays.fill(maxLen, 0); // set ke 0 semuanya dahulu

        // cari untuk setiap kolomnya
        for(int i = 0; i < cols; i++) {
            // cek semua barisnya
            for(int j = 0; j < rows; j++) {
                // cek apakah panjang data ke-i di kolom tsb lebih panjang dari yg terpanjang sekarang, jika iya set sbg max
                maxLen[i] = Math.max(maxLen[i], data[j][i].length());
            }
        }

        // baseline panjang pemisah baris (dari spasi (' ') dan pipa ('|') yang ada di kepala tabel)
        int separatorLength = 28;

        // lalu ditambahkan dengan semua panjang string terpanjang setiap kolom
        for(int num : maxLen) {
            separatorLength += num;
        }

        // bangkitkan string separator menggunakan format sebagai berikut
        String separator = String.format("%-" + separatorLength + "s", "").replace(' ', '-');

        // loop untuk semua baris
        for(int i = 0; i < rows; i++) {

            System.out.println(separator); // pisah baris

            // keluarkan semua kolom dan isinya
            for(int j = 0; j < cols; j++) {
                System.out.printf("| %-" + maxLen[j] + "s ", data[i][j]);
            }
            // tutup baris
            System.out.println("|");
        }
        // pisah baris terakhir
        System.out.println(separator);


    }
    

}
