package src3.tareas;

import java.util.Arrays;

import libs.Input;

public class FindDificil {

	public static void main(String[] args) {
		int nums[] = {11195,49145,6315,57046,37834,51498,45363,24167,57272,48830,29232,23181,48006,17053,25840,50907,55380,37734,46893,5439,29872,7205,35732,25604,37262,62853,56866,10694,18055,17063,60561,28568,51738,8363,5387,61645,1676,10106,25046,10140,34690,57465,28220,17295,20551,50468,7037,50531,46215,14328,49924,26982,42521,60945,32926,45052,28579,39865,37785,41459,30371,41434,9063,62964,9461,29273,21271,62428,23473,26096,6637,62592,64527,37746,56748,9822,59582,42680,4185,62586,63324,51481,52767,37437,18519,63081,37976,28629,24604,60516,1880,50388,47389,38729,27911,42083,48939,4523,3492,50745};
		int nums_ord[] = {1676,1880,3492,4185,4523,5387,5439,6315,6637,7037,7205,8363,9063,9461,9822,10106,10140,10694,11195,14328,17053,17063,17295,18055,18519,20551,21271,23181,23473,24167,24604,25046,25604,25840,26096,26982,27911,28220,28568,28579,28629,29232,29273,29872,30371,32926,34690,35732,37262,37437,37734,37746,37785,37834,37976,38729,39865,41434,41459,42083,42521,42680,45052,45363,46215,46893,47389,48006,48830,48939,49145,49924,50388,50468,50531,50745,50907,51481,51498,51738,52767,55380,56748,56866,57046,57272,57465,59582,60516,60561,60945,61645,62428,62586,62592,62853,62964,63081,63324,64527};
		int counter = 0;
		int numero;
		int array_front;
		int array_middle;
		int array_back;
		boolean Found = false;
		
		Input.print("El arreglo base es: \n");
		Input.print(Arrays.toString(nums));
		
		Input.print("\nDame un numero: ");
		numero = Input.get_int();
		
		array_front = 1;
		array_back = nums_ord.length;
		
		do {
			array_middle = (int) ((array_back-array_front)/2);
			array_middle = array_front + array_middle;
			
			if(numero==nums_ord[array_middle]){
				Found = true;
				break;
			}
			if(numero>nums_ord[array_middle]){
				array_front = array_middle;
			}
			if(numero<nums_ord[array_middle]){
				array_back = array_middle;
			}
			counter++;
		} while (!Found);
		

		if(Found)
			Input.print("El numero esta en el arreglo base, se encontro en la iteracion " + (counter+1));
		else
			Input.print("El numero no esta en el arreglo base");
	}
}
