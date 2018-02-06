package src2.tareas;

import libs.Input;

public class CifradoCesar {
	public static void main(String[] args) {
		Input.print("Mensaje inicial: ");
	    String Cadena = Input.get_string();
	    int Caracter = 0;
	    boolean Cadena_Invalida = false;
	    
	    if (Cadena != null)
	    {
	        for (int i = 0, n = Cadena.length(); i < n; i++)
	        {
	        	if (Cadena.charAt(i) >= 'a' && Cadena.charAt(i) <= 'z')
	            {
	                Cadena_Invalida = true;
	            }
	        }
	        
	        if(!Cadena_Invalida) {
		        Input.print("Mensaje cifrado: ");
	        	for (int i = 0, n = Cadena.length(); i < n; i++)
		        {
		        	Caracter = (int) Cadena.charAt(i);
		        	if((Caracter + 13)>90){
		        		int NewChar = (Caracter + 13) - 26;
		        		Input.print((char) NewChar);	
		        	}
		        	else
		        		Input.print((char) (Caracter + 13));
		        }
	        }
	        else
	        	Input.print("Cadena Invalida, ingresa solo Mayusculas");
	    }	   
	}
}
