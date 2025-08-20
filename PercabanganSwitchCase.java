import java.util.Scanner;

public class PercabanganSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan warna lampu");
        String lampu  = input.next();
        switch (lampu) {
            case "merah":
                System.out.println("anda harus berhenti");
                break;

                case "kuning":
                System.out.println("anda siap siap jalan atau berhenti");
                break;

                case "hijau":
                System.out.println("anda boleh jalan");
                break;

                default:
                System.out.println("salah ketik yaa");
                    break;
        

        }
    }
}
