package m5.prac2;
import java.util.Vector;

public class Pila {

	private Vector<Integer> pila;

	/**
	 * Construtor Pila
	 */
	public Pila() {
		pila = new Vector<Integer>();
	
	}

	/**
	 * M�tode que retorna si la pila cont� elements o no.
	 * 
	 * @return true, si la pila est� buida; i false, si la pila cont� algun element
	 */
	public boolean pilaBuida() {
		//definir m�tode
		return pila.isEmpty();
		
	}

	/**
	 * M�tode que perment afegir un nou element a la pila. A part d'afegir l'element
	 * augmenta la mida de la pila en una unitat.
	 * 
	 * @param o Integer que es vol afegir a la pila
	 */
	public void apilar(Integer o) {
		//definir m�tode
		pila.addElement(o);
		
	}

	
	/**
	 * M�tode que retorna l'�ltim element afegit   i  l'elimina de la pila.
	 *  
	 * @return L'�ltim element de la pila. Si la pila est� buida, retorna null.
	 */
	public Integer desapilar() {
		
		//definir m�tode
		
		if(pila.isEmpty()){
			return null;
		}
		else{
			int  posicio =pila.size()-1;
			int  element = pila.elementAt(posicio);
			pila.removeElementAt(posicio);
			return element;
		
		
		}
	}

	/**
	 * M�tode que ens indica el nombre d'elements que hi ha a la pila
	 * 
	 * @return nombre d'elements de la pila
	 */
	public int getNumElements() {
		return pila.size();
		
	}

	

}