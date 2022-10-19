import java.util.Scanner;

public class Ava2A{

    public static void main(String[] args) {
        
       try(Scanner read = new Scanner(System.in)){

            System.out.print("Digite a temperatura em Celsius:");
                int Celsius = read.nextInt();
                    int Fahrenheit = (9* Celsius + 160)/5;

                    System.out.print(Celsius + "ºC em Fahrenheit é:" + Fahrenheit + "ºF");
        }
    }

}