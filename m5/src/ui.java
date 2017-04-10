
public class ui {


		public static boolean main(int n,int[] array) {
		int num=0;
	
		boolean trobat = false;
		while (num<array.length && !trobat){
			if(n == array[num]){
				trobat = true;
				
		
		}
		else{
			num++;
		}
		
			if(trobat){
				trobat = true;
			}
			else{
				trobat = false;
			}
		}
		return trobat;
		}
}
