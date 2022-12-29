import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        double pi=3.14;
        double alan, cevre, dilim_alani, yaricap,aci;
        System.out.print("Lütfen Dairenin Yarıçapını Giriniz: ");
        yaricap=input.nextInt();
        alan=pi*(yaricap*yaricap);
        cevre=2*(pi*yaricap);
        System.out.print("Lütfen Açı Değerini Giriniz: ");
        aci= input.nextInt();
        dilim_alani=(alan*aci)/360;
        System.out.println("--------------------------------------------");
        System.out.println("Dairenin Alanı:" + alan);
        System.out.println("Dairenin Çevresi:" + cevre);
        System.out.println("Dilimin Alanı:" + dilim_alani);


    }
}