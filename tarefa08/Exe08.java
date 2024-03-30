package tarefa08;
public class Exe08 {
public static void main(String[] args) {

float fahrenheit;
System.out.println("Conversão de Celsius para Fahrenheit:");

for (int celsius = 10; celsius <= 100; celsius += 10) {
			
	
fahrenheit = (int)((9 * celsius + 160) / 5.0);
System.out.printf("%d°C é igual a %.1f°F\n", celsius, fahrenheit);


		}
	}
}