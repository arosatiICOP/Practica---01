
public class Ejercicios {

	public static void main(String[] args) {
		
		// Ejercicio 1
		
		String nombreCompleto;
		boolean registrado;
		long n�mero_Documento;
		byte edad;
		int matr�cula;
		short a�o;
		
		// Correci�n de errores de Ejercicio 1 + Ejercicio 2
		
		String nombre = "Agust�n";
		boolean bandera = true;
		char n�meroVivienda = 8237;
		
		// Ejercicio 3
		
		int num1 = 25; int num2 = 4;
		int num3 = 150; int num4 = 200;
		
		int resta = num1-num2; int multiplicar = num1*num2;
		int incremento = num1++; int decremento = num1--;
		
		boolean mayor = num4<num3;
		boolean menor = num4<num3;
		
		//Resultados variables Ejercicio 3
		
		System.out.println("Resultados");
		System.out.println("La resta entre "+num1+" y "+num2+"da: "+resta);
		System.out.println("La multiplicaci�n entre "+num1+" y "+num2+"da: "+multiplicar+"\n");
		System.out.println("Incremento de "+num1+" una unidad: "+incremento);
		System.out.println("Decremento de "+num1+" una unidad: "+decremento+"\n");
		System.out.println("�"+num4+" es mayor que "+num3+"? "+mayor);
		System.out.println("�"+num4+" es menor que "+num3+"? "+menor);
		
		//Ejercicio 4
		
		String nombreA= "Agust�n Rosati";
		byte edadA = 25;
		
		System.out.println("Datos ejercicio 4: Mi nombre es "+nombreA+" y tengo la edad de "+edadA+" a�os.");
	}

}
