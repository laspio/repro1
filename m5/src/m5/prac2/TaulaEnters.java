package m5.prac2;
import java.io.File;
import java.io.FileNotFoundException;

public class TaulaEnters {

	private Integer[] taula;

	/**
	 * El constructor de la classe.
	 * 
	 * @param taula �s una llista d'enters.
	 * 
	 * @exception IllegalArgumentException si la taula �s null o �s buit.
	 */
	public TaulaEnters(Integer[] taula) throws IllegalArgumentException {
		
	}
	
	/**
	 * Sumar tots els valors de la taula.
	 * 
	 * @return la suma de tots els valors.
	 */
	public int suma(){
		int resultat=0;
		for(int i = 0 ; i<taula.length;i++){
			resultat = resultat + resultat;
		}
		
		return resultat;
		
	}
	
	/**
	 * Buscar el valor m�s gran de la taula.
	 * 
	 * @return el valor m�s gran de la taula.
	 */	
	public int major(Integer[] taula){
		
		
		int resultat=0;
		for(int i = 0 ; i<taula.length;i++){
			if(taula[i]==null){
				return -1;
			}
			
			
			if(taula[i]>resultat){
				resultat = taula[i];
			}
		}
		
		return resultat;
	}
	
	/**
	 * Buscar el valor m�s petit de la taula.
	 * 
	 * @return el valor m�s petit de la taula.
	 */		
	public int menor(Integer[] taula){
	int resultat = 100000;
	
	for(int i = 0 ; i<taula.length;i++){
		if(taula[i]==null){
			return -1;
		}
		if(taula[i]<resultat){
			resultat = taula[i];
		}
	}
	
	
	return resultat;
		
	}
	
	/**
	 * Buscar la posici� del primer valor dins de la taula.
	 * 
	 * @param num �s el valor a buscar.
	 * 
	 * @return la posici� del valor trobat. En el cas de no ser trobat es retorna un -1. 
	 */	
	public int buscar(int num,Integer[] taula){
	int resultat = -1;
		for(int i = 0 ; i<taula.length;i++){
			if(taula[i]==null){
				return -1;
			}
			
			if(num==taula[i]){
				return i;
			}
		}
		
		return resultat;
	}
	
}