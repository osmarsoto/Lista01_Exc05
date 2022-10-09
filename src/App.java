import java.util.Scanner;
public class App {
    //Faça um Programa que converta metros para centímetros.
    public static void main(String[] args) throws Exception {
        int a, cm;

        Scanner sc = new Scanner (System.in);
        System.out.print("Digite a quantitade em metros: ");
        a = sc.nextInt();

        cm = (a*100);

        System.out.print("A quantidad de centimetros é: " +cm);
        sc.close();

        

        
    }
}
