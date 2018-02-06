package src2.tareas;

import libs.Input;

public class InicialesDificil {
	public static void main(String[] args) {
		Input.print("Escribe tu nombre: ");
		String Cadena = Input.get_string();
		//String Cadena = "          TEst  test  MIN  nim   go   ";
		Cadena = Cadena.trim();

		Cadena = Cadena.replaceAll("\\s{2,}", " ");	

		for (String Elemento: Cadena.split(" ")) {
			if(Elemento.charAt(0) >= 'a' && Elemento.charAt(0) <= 'z') {
				Input.print((char) (Elemento.charAt(0) - 32));				
			}
			else
				Input.print(Elemento.charAt(0));
		}
	}
}