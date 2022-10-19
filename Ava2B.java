import java.util.Scanner;

public class Ava2B{

    public static void main(String[] args) {
        final double PI = 3.14;

            try(Scanner read = new Scanner(System.in)){
                
                System.out.print("Didigite a altura da lata:");
                    double altura  = read.nextDouble();

                    System.out.print("Digite o raio da lata:");
                        double raio = read.nextDouble();

                        double volume = PI*Math.pow(raio, 2) * altura;

                        System.out.print("O volume da lata de óleo é:" + volume);
            }
    }
}