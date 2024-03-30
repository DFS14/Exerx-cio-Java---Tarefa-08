package tarefa08;
public class Exe10 {
public static void main(String[] args) {

int soma = 0;
int contador = 0;	 
	 
for (int i = 50; i <= 70; i++)  
	
{
  if (i % 2 == 0) 
 { soma += i; contador++;}
}
     
 float media = soma / (float) contador;
 System.out.println("Soma dos valores pares: " + soma);
 System.out.println("Média aritmética dos valores pares: " + media);
 
 }
}