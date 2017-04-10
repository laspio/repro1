package m5.prac2;

import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		Integer[] taula = new Integer[10];
		Scanner sc = new Scanner(System.in);
		/*for (int i = 0; i < 10; i++) {
			System.out.println("Indrodueix un numero per emplanar el array");
			int entrada = Integer.parseInt(sc.nextLine());
			taula[i] = entrada;
		}*/
		TaulaEnters ta = new TaulaEnters(taula);
	
		if(ta.major(taula)==-1){
			System.out.println("La taula  esta buida");
			System.out.println("El valor més gran de la taula es : " + ta.major(taula));
			System.out.println("El valor més petit de la taula es :" + ta.menor(taula));
			System.out.println("Introdueix el numero que vols buscar");
			int num_busc = Integer.parseInt(sc.nextLine());
			System.out.println("El nombre esta a la posicio "+ta.buscar(num_busc,taula));
		
		}
		else{
		
		
		System.out.println("El valor més gran de la taula es : " + ta.major(taula));
		System.out.println("El valor més petit de la taula es :" + ta.menor(taula));
		System.out.println("Introdueix el numero que vols buscar");
		int num_busc = Integer.parseInt(sc.nextLine());
		System.out.println("El nombre esta a la posicio "+ta.buscar(num_busc,taula));
		}

	   sc.close();

	}

}
