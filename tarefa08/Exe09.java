package tarefa08;
import java.util.Scanner;
public class Exe09 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
int totalNumeros = 10;
float soma = 0;

System.out.println("Digite 10 valores numéricos:");

for (int i = 1; i <= totalNumeros; i++) 
{
System.out.print("Número " + i + ": ");
soma += scanner.nextFloat(); 
}
	

float media = soma / totalNumeros;
	
System.out.printf("Somatório: %.2f\n", soma);
System.out.printf("Média aritmética: %.2f\n", media);

	scanner.close();
	
	}
}
