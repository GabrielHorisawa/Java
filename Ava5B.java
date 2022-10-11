import java.util.Scanner;

public class Ava5B {
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            
        int n1, n2, n3;

        System.out.print("Digite o valor 1:");
            n1 = read.nextInt();

            System.out.print("Digite o valor 2:");
                n2 = read.nextInt();

                System.out.print("Digite o valor 3:");
                    n3 = read.nextInt();

        if(n1 > n2){
            System.out.print("n1 é maior");
        }
            else if(n2 > n3){
                System.out.print("n2 é maior");
            }
                else if(n3 > n1){
                    System.out.print("n3 é maior");
                }
        }

    }
}
