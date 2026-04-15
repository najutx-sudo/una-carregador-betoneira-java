import java.util.Scanner;

public class SimuladorBetoneira { 
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

   double pesoAlvo = 500.0;
   double pesoAtual = 0.0;
   int ciclo = 0;

 System.out.println("Meta de peso para a betoneira:" + pesoAlvo + "kg");

 do {
    System.out.println("Digite o peso do material adicionado (kg): ");
    double pesoAdicionado = sc.nextDouble();
    pesoAtual += pesoAdicionado;
    ciclo ++;
    
    System.out.println("Peso atual na betoneira: " + pesoAtual + "kg");
 } while (pesoAtual < pesoAlvo);

 System.out.println("Ciclos realizados: " + ciclo );
 System.out.println("Peso final na betoneira: " + pesoAtual + "kg" );
 
 }
}