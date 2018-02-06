package src1.tareas;

import libs.Input;

public class Botellas_Agua {
	public static void main(String[] args) {
		Input.print("Cuantos duras en la ducha? ");
		System.out.println("");
		Input.print("Minutos: ");
		int Total_de_Minutos = Input.get_int();

		
		System.out.println("");
		System.out.println("");
		
		Input.print("En botellas de agua esto seria... ");
		System.out.println("");
		Input.print("Botella: "+ (Total_de_Minutos * 12));
	}
}