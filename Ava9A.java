import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ava9A{
    public static void  menu(){
        String menu = "MENU", strItem = "";
        menu += "\n1 Digite o valor \n2 Sair";
        String nome = "";
        int vetor = 0, cont = 0;
        double media = 0, saldo = 0;
        char ItemMenu;

        do{
            strItem = JOptionPane.showInputDialog(null, menu);
            ItemMenu = strItem.charAt(0);

            switch(ItemMenu){
                case '1':
                    vetor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os Valores:" ));
                        double valor[] = new double[vetor];

                        for(int n = 0; n < vetor; n++){
                            valor[n] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor:"));
                            saldo += valor[n];
                        }

                        cont += vetor;
                        media = saldo / cont;

                        nome = JOptionPane.showInputDialog(null, "Digite o seu nome:");

                        JOptionPane.showMessageDialog(null, "Valores Digitados: " + "\n" + Arrays.toString(valor));

                        break;

                        case '2':
                        JOptionPane.showMessageDialog(null, "Quantidade de valores digitados: "
                                + cont
                                + "\n Saldo: " + saldo
                                + "\n Média: " + media
                                + "\n Nome: " + nome);
    
                        break;
    
                    case '3':
                        JOptionPane.showMessageDialog(null, "Programa finalizado!");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operação inválida!");
 
            }
        }while(true);
        
    }
    public static void main(String[] args) {
        menu(); 
    }
}