import java.util.Scanner;

public class Ava2C{

    public static void main(String[] args) {
        
        try(Scanner read = new Scanner(System.in)){

            System.out.print("Didigite o tempo gasto durante a viagem:");
                int tempo = read.nextInt();

                System.out.print("Digite a velocidade media durante a viagem:");
                    int velocidade = read.nextInt();

                    double distancia = (tempo * velocidade);
                    double litros_usados = distancia/12;

                    System.out.println("velocidade media: " + velocidade);
                        System.out.println("tempo gasto: " + tempo + "horas");
                            System.out.println("distancia: " + distancia + "km");
                                System.out.println("qauntidade de litros_usados: " + litros_usados);
        }
    }
}