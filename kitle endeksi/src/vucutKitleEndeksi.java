import java.util.Scanner;
public class vucutKitleEndeksi {

    public static void main(String[] args) {
        //Kilo (kg) / Boy(m) * Boy(m)
//Çıktısı
//Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
//Lütfen kilonuzu giriniz : 105
//Vücut Kitle İndeksiniz : 35.49215792320173

        double kilo,boy,kitleendeksi;
        Scanner inp=new Scanner(System.in);
        System.out.print("LÜTFEN KİLONUZU GİRİNİZ:");
        kilo= inp.nextDouble();
        System.out.print("LÜTFEN BOYUNUZU GİRİNİZ(metre cinsinden örn:1,72):");
        boy= inp.nextDouble();

        kitleendeksi=kilo/(boy*boy);
        System.out.println("VÜCUT KİTLE ENDEKSİNİZ:"+kitleendeksi);
    }


}
