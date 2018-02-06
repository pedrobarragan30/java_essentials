package src1.tareas;

import libs.Input;

public class MarioFacil {
	public static void main(String[] args) {
		Input.print("De que altura sera la piramide: ");
		int Altura = Input.get_int();
		int Nivel = 0;
		int Elementos;
		
		for(Nivel = Altura; Nivel >= 1; Nivel--) {
			for(Elementos = 0;Elementos < Altura + 1;Elementos++) {
				if(Elementos < Nivel - 1) {
					Input.print(" ");
				}
				else {
					Input.print("#");
				}
			}
			Input.print("\n");
		}		
	}
}