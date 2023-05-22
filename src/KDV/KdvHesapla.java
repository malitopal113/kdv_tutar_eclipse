package KDV;

import java.util.Scanner;

public class KdvHesapla {

	public static void main(String[] args) {
		System.out.println("Kdv Hesaplama");
        Scanner inp = new Scanner(System.in);

        
        System.out.print("KDV'siz Fiyat: ");

        double fiyat, kdvOran, kdvFiyat, kdvTutar;
        
        fiyat = inp.nextDouble();
        
        kdvOran = fiyat > 1000 ? 0.08 : 0.18 ;
        
        System.out.println("Kdv Oranı: " + kdvOran );

        kdvFiyat = fiyat + (fiyat * kdvOran);

        System.out.println("KDV'li Fiyat: " + kdvFiyat);

        kdvTutar = kdvFiyat - fiyat;
        

        System.out.println("KDV Tutarı: " + String.format("%.2f", kdvTutar));


	}

}
