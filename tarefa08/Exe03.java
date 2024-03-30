package tarefa08;
public class Exe03 {
public static void main(String[] args) {
	
int soma = 0;
for (int i = 1; i <= 500; i++) {
		if (i % 2 == 0) {
			soma += i;
		}
	}
	System.out.println("A soma dos valores pares de 1 até 500 é: " + soma);
}
}