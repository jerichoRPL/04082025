import java.util.Scanner;

public class BelanjaBarengJericho {
    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        System.out.println("Masukan nama barang1");
        String namaBarang1 = input.nextLine();
        System.out.println("Masukan harga barang1");
        double hargaBarang1 = input.nextDouble();
        
        

        System.out.println("Masukan nama barang2");
        String namabarang2 = input.next();
        System.out.println("Masukan harga barang2");
        double hargaBarang2 = input.nextDouble();
        
        System.out.println("namaBarang1= "+namaBarang1);
        System.out.println("hargaBarang1="+hargaBarang1);
        System.out.println("namaBarang2="+ namabarang2);
        System.out.println("hargaBarang2="+hargaBarang2);
    }
}