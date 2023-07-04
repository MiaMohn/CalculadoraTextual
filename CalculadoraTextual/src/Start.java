/*
 * @author Maria Gaio a.k.a. Mia Mohn
 */

import java.util.Scanner;

public class Start {
	
	//Funciones
	
	public static float suma(float n1,float n2)
	{
		float resultado = 0.0f;
		
		resultado = n1 + n2;
		
		return resultado;
	}
	
	public static float resta(float n1,float n2)
	{
		float resultado = 0.0f;
		
		resultado = n1 - n2;
		
		return resultado;
	}
	
	public static float multiplicacion(float n1,float n2)
	{
		float resultado = 0.0f;
		
		resultado = n1 * n2;
		
		return resultado;
	}
	
	public static float division(float n1,float n2)
	{
		float resultado = 0.0f;
		
		if(n2 == 0)
		{
			return (-1.0f);
		}
		
		resultado = n1 / n2;
		
		return resultado;
	}
	
	public static float mayor(float n1,float n2, float n3)
	{
		if (n1 > n2 && n1 > n3)
		{
			return n1;
		}
		else if (n2 > n1 && n2 > n3)
		{
			return n2;
		}
		
		return n3;
	}
	
	public static int factorial(int n)
	{
		int i = 0;
		int resultado = n;
		
		if(n<1)
		{
			return (-1);
		}
		
		for(i=n-1; i>=1; i--)
		{
			resultado = i * resultado;
		}
		
		return resultado;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		
		//Declaración de variables
		
		int opcion = 0;
		float num1 = 0.0f;
		float num2 = 0.0f;
		float num3 = 0.0f;
		int numFactorial = 0;
		
		//Cabecera
		
		System.out.println("_____________________________");
		System.out.println("");
		System.out.println("Calculadora de Calculator S.A");
		System.out.println("_____________________________");
		System.out.println("");
		
		
		//Menú
		
		
		do
		{
			System.out.println(""); //Espacio de separacion solo por temas estéticos - UserFriendly
			
			System.out.println("Introduzca una opción del menú:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Número mayor de 3 números");
			System.out.println("6. Función Factorial");
			System.out.println("0. Salir");
		
			System.out.print("Introduzca una opción: ");
			opcion = userInput.nextInt();
			
			
			System.out.println("");	//Espacio de separacion solo por temas estéticos - UserFriendly
		
		
			switch (opcion)
			{
				case 1: //Sumar
					
					System.out.print("Introduzca el primer número flotante a sumar: ");
					num1 = userInput.nextFloat();
			
					System.out.print("Introduzca el segundo número flotante a sumar: ");
					num2 = userInput.nextFloat();
			
					System.out.println("_____________________________");
					System.out.println("");
					System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma(num1, num2));
					System.out.println("_____________________________");
					
					break;
					
			
				case 2: //Restar
					
					System.out.print("Introduzca el primer número flotante a restar: ");
					num1 = userInput.nextFloat();
			
					System.out.print("Introduzca el segundo número flotante a restar: ");
					num2 = userInput.nextFloat();
			
					System.out.println("_____________________________");
					System.out.println("");
					System.out.println("La resta de  " + num1 + " y " + num2 + " es " + resta(num1, num2));
					System.out.println("_____________________________");
					
					break;
					
			
				case 3: //Multiplicar
					
					System.out.print("Introduzca el primer número flotante a multiplicar: ");
					num1 = userInput.nextFloat();
			
					System.out.print("Introduzca el segundo número flotante a multiplicar: ");
					num2 = userInput.nextFloat();
			
					System.out.println("_____________________________");
					System.out.println("");
					System.out.println("La multiplicación de  " + num1 + " y " + num2 + " es " + multiplicacion(num1, num2));
					System.out.println("_____________________________");
					
					break;
					
			
				case 4: //Dividir
					
					System.out.print("Introduzca el primer número flotante a dividir: ");
					num1 = userInput.nextFloat();
			
					System.out.print("Introduzca el segundo número flotante a dividir: ");
					num2 = userInput.nextFloat();
					
					if (division(num1, num2) == -1.0f)
					{
						System.out.println("_____________________________");
						System.out.println("");
						System.out.println("Error division por 0");
						System.out.println("_____________________________");
					}
					
					else
					{
						System.out.println("_____________________________");
						System.out.println("");
						System.out.println("La división de  " + num1 + " y " + num2 + " es " + division(num1, num2));
						System.out.println("_____________________________");
					}
		
					break;
					
			
				case 5: //Número mayor de 3 números
					
					System.out.print("Introduzca el primer número flotante de los 3: ");
					num1 = userInput.nextFloat();
					
					System.out.print("Introduzca el segundo número flotante de los 3: ");
					num2 = userInput.nextFloat();
					
					System.out.print("Introduzca el tercer número flotante de los 3: ");
					num3 = userInput.nextFloat();
					
					System.out.println("_____________________________");
					System.out.println("");
					System.out.println("EL número " + mayor(num1, num2, num3) + " es el mayor de los 3 números.");
					System.out.println("_____________________________");
					
					break;
					
			
				case 6: //Factorial
					
					System.out.print("Introduzca un número para calcular el factorial: ");
					numFactorial = userInput.nextInt();
					
					if (factorial(numFactorial) == -1 )
					{
						System.out.println("_____________________________");
						System.out.println("");
						System.out.println("Error valor inferior a 0, introduzca un valor superior a 0");
						System.out.println("_____________________________");
					}
					else
					{
						System.out.println("_____________________________");
						System.out.println("");
						System.out.println("El factorial de " + numFactorial + " es " + factorial(numFactorial));
						System.out.println("_____________________________");
					}
					
					break;
					
					
				default: //Solo se mostrará cuando se introduzca un numero distinto del 0 al 6
					
					if (opcion != 0)
					{
						System.out.println("_____________________________");
						System.out.println("");
						System.out.println("Opción errónea");
						System.out.println("_____________________________");
					}
					
					break;
			}
			
		} while (opcion != 0);
		
		
		if (opcion == 0)
		{
			System.out.println("_____________________________");
			System.out.println("");
			System.out.println("El programa ha finalizado");
			System.out.println("_____________________________");
		}
		
	}

}
