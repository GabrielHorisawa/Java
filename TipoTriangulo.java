import java.util.Scanner;

public class TipoTriangulo{

    static Scanner src = new Scanner(System.in);

        public static void main(String[] args){

            int ladoA, ladoB, ladoC;
                String tipo = "";

                System.out.print("Digite o lado A do Triângulo: ");
                    ladoA = src.nextInt();

                    System.out.print("Digite o lado B do Triângulo: ");
                        ladoB = src.nextInt();

                        System.out.println("Digite o lado C do Triângulo:");
                            ladoC = src.nextInt();

        if (ladoA >= (ladoB + ladoC) || ladoB >= (ladoA + ladoC) || ladoC >= (ladoB + ladoA)) {

            System.out.println("A figura não é um triângulo");}   
            
            else if ((ladoA == ladoB && ladoA != ladoC) || (ladoA == ladoC && ladoA != ladoB) || (ladoB == ladoC && ladoC != ladoA)) {
                tipo = "O tipo do triângulo é Isósceles!";

                    } else if ((ladoA == ladoB && ladoB == ladoC)) {
                         tipo = "O tipo de triângulo é equilátero!";

                        } else if ((ladoC != ladoB && ladoB != ladoA)) {
                            tipo = "O tipo de triângulo é escaleno!";
                        }

                             String saida;
                                saida = String.format("%s", tipo);

                                System.out.println(saida);
        }
}