package src1.tareas;

import libs.Input;

public class Minimo_Monedas {
	public static void main(String args[])
	{
		Input.print("Hola! Cuanto cambio te debo?: "); 
		float Monto_cambio = Input.get_float();
		int Monto_en_Centavos = (int) (Monto_cambio * 100);
		int Total_Coins = 0;
		int Temp_Total_Coins = 0;
		
		if(Monto_en_Centavos >= 25) {
			Temp_Total_Coins = Math.round(Monto_en_Centavos/25);
			Monto_en_Centavos = Monto_en_Centavos - (Temp_Total_Coins * 25);
			Total_Coins = Total_Coins + Temp_Total_Coins;
			Temp_Total_Coins = 0;
		}
		if (Monto_en_Centavos >= 10) {
			Temp_Total_Coins= Math.round(Monto_en_Centavos/10);
			Monto_en_Centavos = Monto_en_Centavos - (Temp_Total_Coins * 10);
			Total_Coins = Total_Coins + Temp_Total_Coins;
			Temp_Total_Coins = 0;
		}
		if (Monto_en_Centavos >= 5) {
			Temp_Total_Coins= Math.round(Monto_en_Centavos/5);
			Monto_en_Centavos = Monto_en_Centavos - (Temp_Total_Coins * 5);
			Total_Coins = Total_Coins + Temp_Total_Coins;
			Temp_Total_Coins = 0;
		}
		if (Monto_en_Centavos >= 1) {
			Temp_Total_Coins= Math.round(Monto_en_Centavos/1);
			Monto_en_Centavos = Monto_en_Centavos - (Temp_Total_Coins * 1);
			Total_Coins = Total_Coins + Temp_Total_Coins;
		}
		Input.print("El total de monedas a entregar son " + Total_Coins); 		
	}
}