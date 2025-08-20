import java.util.Scanner;

public class TokoJerichoIfElseIF {
    public static void main(String[] args) {
        double totalbeli,diskon = 0,hargaAkhir,bayar,kembalian;

        Scanner input = new Scanner(System.in);
        System.out.println("masukan total harga pembelian");
         totalbeli = input.nextDouble();


         if (totalbeli > 500000){
            System.out.println("anda mendapat diskon 20%");
             diskon = (0.2)*totalbeli;
            } else if(totalbeli > 300000){
            
                System.out.println("anda mendapat diskon 15%");
            }else if (totalbeli > 100000){
                diskon = (0.15)*totalbeli;
            System.out.println("anda mendapat diskon 10%");
            diskon = (0.1)*totalbeli;
        }else{
            System.out.println("tidak mendapat diskon");
            diskon=0;
        }

        hargaAkhir= totalbeli - diskon;
        System.out.println("harga akhir "+hargaAkhir);
        System.out.println("masukan pembayaran ");
        bayar = input.nextDouble();
        kembalian = bayar-hargaAkhir;
        System.out.println("kembalian anda "+kembalian);

        System.out.println("terima kasih telah berbelanja di toko kami");


    
    



         




    }
}
