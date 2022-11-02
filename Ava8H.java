import javax.swing.JOptionPane;
import java.util.*;

public class Ava8H {
    public static void menu() {
        String menu = "MENU", strItem = "";
        menu += "\n1 Digitar números \n2 Sair";
        char tecla;
        int n1, n2, n3, n4, n5, menor, maior;
        int vetor[] = new int[5];

        do {
            strItem = JOptionPane.showInputDialog(null, menu);
            tecla = strItem.charAt(0);

            switch (tecla) {
                case '1':
                    n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
                    vetor[0] = n1;
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
                    vetor[1] = n2;
                    n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número"));
                    vetor[2] = n3;
                    n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o quarto número"));
                    vetor[3] = n4;
                    n5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o último número"));
                    vetor[4] = n5;

                    Arrays.sort(vetor);
                    menor = vetor[0];
                    maior = vetor[4];
                    JOptionPane.showMessageDialog(null,
                            menor + " foi o menor número digitado e " + maior + " foi o maior número.");
                    break;

                case '2':
                    JOptionPane.showMessageDialog(null, "Programa finalizado!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (true);
    }

    public static void main(String[] args) {
        menu();
    }
}