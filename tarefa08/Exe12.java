package tarefa08;
import java.util.Scanner;
public class Exe12 {
public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
    int maior = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;
    int valor;

System.out.println("Digite valores positivos inteiros (um valor negativo para terminar):");

    while (true) {
        valor = scanner.nextInt();

        if (valor < 0) {
            break; 
        }

        if (valor > maior) {
            maior = valor; 
        }

        if (valor < menor) {
            menor = valor; 
        }
    }

    System.out.println("O maior valor informado foi: " + maior);
    System.out.println("O menor valor informado foi: " + menor);

    scanner.close();
	}
}