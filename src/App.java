import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
     
        double h, pesoMulher, pesoHomem;
     
        System.out.print("Digite a sua Altura: ");
        h = entrada.nextDouble();
     
        pesoMulher = (62.1 * h) - 44.7;
        System.out.println("Peso ideal para mulher: "+ pesoMulher);
    
        pesoHomem = (72.7 * h) - 58;
        System.out.println("Peso ideal para Homens: "+ pesoHomem);
        
        entrada.close();
    }   
}