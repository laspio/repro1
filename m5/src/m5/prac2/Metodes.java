package m5.prac2;

import java.util.Scanner;

public class Metodes {

	static int comptadorDeParells(int llargada) {
		int i = 0;
		int countParells=0;
		while(i<llargada){
			if(i%2==0){
				countParells = countParells +1;
			}
			i++;
		}
		return countParells;
	}
	
	
	
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix el numero que vols que s'en generin : ");
		int llargada =  Integer.parseInt(sc.nextLine());

		System.out.println(comptadorDeParells(150)); 
	
		   
	}
	



}


