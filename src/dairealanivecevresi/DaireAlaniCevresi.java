package dairealanivecevresi;

import java.util.Scanner;

public class DaireAlaniCevresi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double r,a;
		double pi = 3.14;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Yarı çapı giriniz: ");
		r = scan.nextDouble();
		
		System.out.print("Merkez açısı ölçüsü giriniz: ");
		a = scan.nextDouble();
		
		double sonuc = (pi * (r*r) * a)/360;
		
		System.out.println("Alan:"+ sonuc);
		
	}

}
