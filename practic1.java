
import java.util.Scanner;


public class practic1 {
      public static void main(String[]args) {
            double tutar,kdvOran=0.18,kdvOran2=0.08, kdvTutar,kdvliTutar;

            Scanner inp=new Scanner(System.in);

            System.out.print("Tutar Giriniz:");
            tutar = inp.nextDouble();
            if (tutar<=1000)
            {
                  kdvTutar = tutar * kdvOran;
                  kdvliTutar = tutar + kdvTutar;


                  System.out.println("KDV Oranı:"+kdvOran);
                  System.out.println("KDV'siz Fiyat : " + tutar);
                  System.out.println("KDV'li Fiyat: " + kdvliTutar);
                  System.out.println("KDV tutarı:  " + kdvTutar);
            }
            else if (tutar>1000)

            {
                  kdvTutar = tutar*kdvOran2;
                  kdvliTutar=tutar+kdvTutar;

                  System.out.println("KDV Oranı:"+kdvOran2);
                  System.out.println("KDV'siz Fiyat : " + tutar);
                  System.out.println("KDV'li Fiyat: " + kdvliTutar);
                  System.out.println("KDV tutarı:  " + kdvTutar);




            }




            }

            }





















