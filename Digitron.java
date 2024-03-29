package kalkulator;

import java.util.Scanner;

public class Digitron {
	public static double sabiranje(double a, double b) {
		return a+b; 
	}
	public static double oduzimanje(double a, double b) {
		return a-b;
	}
	public static double mnozenje(double a,double b) {
		return a*b;
	}
	public static double deljenje(double a, double b) {
		if(b==0) {
			System.err.println("Ne smemo deliti nulom!");
			return a;
		}
		
		return a/b;
	}
	public static double stepenovanje(double n, int stepen) {
	    for(int i=2;i<=stepen;i++)
	    	n *= n;
	    return n;
	}
	public static int faktorijel(int n) {
		int rezultat = 1;
		for(int i=1; i<=n; i++)
			rezultat *= i;
		return rezultat;
	}
	public static void stampaj_meni() {
		System.out.println("Komande:\r\n" + 
			"-1) Izlaz iz programa\r\n" + 
			" 0) Reset\n" + 
			" 1) Saberi [double]\n" + 
			" 2) Oduzmi [double]\n" + 
			" 3) Pomnozi [double]\n" + 
			" 4) Podeli [double != 0]\n" + 
			" 5) Digni na stepen [int]\n" + 
			" 6) Faktorijel \n" + 
			"99) Ispis komandnog menija"
		);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dobrodo�li u 'konzolni kalkulator 9000'!");
		System.out.println("----------------------------------------");
		stampaj_meni();
		
		double rezultat = 0;
		int komanda = 0;
		while(komanda >= 0) { 
			System.out.println("---------------------------------");
			System.out.println("trenutna vrednost " + rezultat);
			System.out.print  ("komanda [arg]: ");
			komanda = sc.nextInt();
			
			switch(komanda) {
				case -1: break;
				case  0: rezultat = 0;break;
				case  1: rezultat = sabiranje(rezultat,sc.nextDouble()); break;
				case  2: rezultat = oduzimanje(rezultat,sc.nextDouble()); break;
				case  3: rezultat = mnozenje(rezultat,sc.nextDouble()); break;
				case  4: rezultat = deljenje(rezultat,sc.nextDouble()); break;
				case  5: rezultat = stepenovanje(rezultat,sc.nextInt()); break;
				case  6: rezultat = faktorijel((int) rezultat); break;
				case 99: stampaj_meni(); break;
				default: System.err.println("Gre�ka, nepostoje�a komanda!");
			}
		}

	}
}

