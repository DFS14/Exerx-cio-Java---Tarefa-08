package tarefa08;

public class Exe07 {
public static void main(String[] args) {

	int n = 15; 
	int primeiroTermo = 1;
	int segundoTermo = 1;

	System.out.println("Série de Fibonacci até o décimo quinto termo:");

	for (int i = 1; i <= n; ++i) 
	
	{
		System.out.print(primeiroTermo + ", ");
		int proximoTermo = primeiroTermo + segundoTermo;
		primeiroTermo = segundoTermo;
		segundoTermo = proximoTermo;
	}
	
	
	    }
	}