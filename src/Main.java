import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar= scan.nextDouble();

        if (tutar > 0 && tutar<1000) {
            kdvOran=0.18;
        }else {
            kdvOran=0.8;
        }

        kdvTutar=tutar*kdvOran;
        kdvliTutar=tutar+kdvTutar;

        System.out.println("KDV'siz Tutar : "+tutar);
        System.out.println("KDV Oranı : "+kdvOran);
        System.out.println("KDV Tutarı: "+kdvTutar);
        System.out.println("KDV'li Tutar : "+kdvliTutar);



    }
}
