package m5.ex21;

import java.util.Scanner;
import m5.prac2.*;


public class main {

	public static void main(String[] args) {
		String curs = "daw";
		curs = curs.replace('w', 'm');
		if(curs.equals("dam")){
			System.out.println("Tu est�s fent DAM!");
		} else {
			System.out.println("Tu est�s fent DAW!");			
		}

	}

}
