package src2.tareas;

import libs.Input;

public class InicialesFacil {
	public static void main(String[] args) {
		Input.print("Escribe tu nombre: ");
		String Cadena = Input.get_string();
		
		for (String Elemento: Cadena.split(" ")) {
			Input.print(Elemento.charAt(0));
		}
	}
}