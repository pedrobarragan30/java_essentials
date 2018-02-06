package src1.tareas;

import libs.Input;

public class MarioDificil {
	public static void main(String[] args) {
		Input.print("De que altura sera la piramide: ");
		int Altura = Input.get_int();
		int Nivel = 0;
		int Elementos;
		
		for(Nivel = Altura; Nivel >= 1; Nivel--) {
			for(Elementos = 0;Elementos < Altura;Elementos++) {
				if(Elementos < Nivel-1) {
					Input.print(" ");
				}
				else {
					Input.print("#");
				}
			}
			Input.print("  ");
			for(int Elementos2 = Elementos;Elementos2 >= 1;Elementos2--) {
				if(Elementos2 < Nivel) {
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