package src3.tareas;

import libs.Input;

public class BinarySearch {

	public static void main(String[] args) {
		Input.print("Dame un numero del 1 al 100: ");
		int Num_2_search = Input.get_int();
		
		int counter=0;
		int front;
		int middle;
		int back;
		boolean Found = false;
		
		front = 1;
		back = 100;
		
		do {
			middle = (int) ((back-front)/2);
			middle = front + middle;

			Input.print("Conter: "+counter+"  Front: "+front+"  Middle:"+middle+"  Back:"+back+"\n");
			
			if(Num_2_search==middle){
				Found = true;
				break;
			}
			if(Num_2_search>middle){
				front = middle;
			}
			if(Num_2_search<middle){
				back = middle;
			}
			counter++;

		} while (!Found);

		

		if(Found)
			Input.print("El numero esta en el arreglo base, se encontro en la iteracion " + (counter+1));
		else
			Input.print("El numero no esta en el arreglo base");

	}

}
