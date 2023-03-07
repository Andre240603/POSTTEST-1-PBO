
package coffee;
import java.io.IOException;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class MenuUtama {
     static String option, admin;
    static Scanner input = new Scanner(System.in);
    static Coffee cfe = new Coffee();//OBJEK
    static ArrayList<Coffee> BrgList;//ARRAYLIST
    
    public static void menu () throws IOException{
        Boolean ulang,ulang2;
        System.out.println("\tWELCOME\n");
        ulang = true;
        while (ulang) {
            menuAwal();
            switch (option) {
                case "1":
                ulang2=true;
                while(ulang2){
                menuKedua();
                    switch (admin){
                        case "1":
                            cfe.tambahBarang();
                            break;
                        case "2":
                            cfe.tampilBarang();
                            break;
                        case "3":
                            cfe.ubahBarang(BrgList);
                            break;
                        case "4":
                            cfe.hapusBarang();
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                            break;
                    }
                }
                break;
                case "2":
                    System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                    System.exit(0);

                default:
                System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                break;
            }
        } 
    }
    public static String menuKedua (){
        System.out.println();
        System.out.println("Pilih Menu");
        System.out.println("1. Tambah Barang");
        System.out.println("2. Tampilkan Barang");
        System.out.println("3. Edit Barang");
        System.out.println("4. Hapus Barang");
        System.out.println("5. Kembali ke Menu Awal");
        System.out.println("6. Exit Program");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    
    public static String menuAwal (){
      System.out.println();
      System.out.println("Pendataan Coffee Shop Tok Aba");
      System.out.println("1. Barang Coffee Shop");
      System.out.println("2. Exit Program");
      System.out.print("Masukan Pilihan menu : ");
      option = input.nextLine();
      return option;
    }


    public static void main(String[] args) throws IOException  {
       menu();
    }
    
}
