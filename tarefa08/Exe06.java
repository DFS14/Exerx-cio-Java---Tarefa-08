package tarefa08;
import java.util.Scanner;
public class Exe06 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    

System.out.print("Digite a base: ");
    float base = scanner.nextFloat();
    
System.out.print("Digite o expoente: ");
    float expoente = scanner.nextFloat();
   
    float resultado = 1;

    
    for (int i = 0; i < expoente; i++) 
    {
        resultado *= base;
    }
    
System.out.println(base + "^" + expoente + " = " + resultado);
    
    
    
    scanner.close();
	}
}