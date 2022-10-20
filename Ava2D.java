import java.util.Scanner;

public class Ava2D{

    public static void main(String[] args) {
        
        try(Scanner read = new Scanner(System.in)){

            System.out.print("Digite o valor:");
                double valor = read.nextDouble();

                System.out.print("Digite a taxa:");
                    double taxa  = read.nextDouble();

                    System.out.print("Digite o tempo:");
                        int tempo = read.nextInt();

                        double prestacao = valor =(valor*taxa/100)*tempo;

                System.out.print("Ovalor da prestação é de:" + "R$" + prestacao);
        }
    }
}