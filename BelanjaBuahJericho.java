import java.util.Scanner;

public class BelanjaBuahJericho {
    public static void main(String[] args) {
        int apel=12,jeruk =15;
        double hargaApel =14500, hargaJeruk=10500;
double total,bayar,kembalian;

        total=(apel*hargaApel)+ (jeruk+hargaJeruk);
System.out.println("jumlah appke yang dibeli : "+apel+"dan jeruk: "+jeruk);
System.out.println("total pembayaran"+total);
Scanner input = new Scanner (System.in);
System.out.println("masukan pembyaran : ");
bayar=input.nextDouble();
kembalian = bayar- total;
System.out.println("kembalian anda adalah"+kembalian);
    }
}
