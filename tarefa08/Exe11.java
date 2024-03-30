package tarefa08;
import java.util.Scanner;
public class Exe11 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
  
int areaTotal = 0;
 
String continuar;//********

do {
	
System.out.print("Digite o nome do cômodo: ");
String nomeComodo = scanner.nextLine();//********


System.out.print("Digite a largura do cômodo (em metros): ");
float largura = scanner.nextFloat();

System.out.print("Digite o comprimento do cômodo (em metros): ");
float comprimento = scanner.nextFloat();
float areaComodo = largura * comprimento;


System.out.printf("A área do %s é: %.2f metros quadrados.\n", nomeComodo, areaComodo);

areaTotal += areaComodo;
scanner.nextLine();

System.out.print("Deseja calcular a área de outro cômodo? (SIM/NAO): ");
continuar = scanner.nextLine();

        
} while 
	
(continuar.equalsIgnoreCase("SIM"));
System.out.printf("A área total da residência é: %.2f metros quadrados.\n", areaTotal);
    
    scanner.close();
	}
}