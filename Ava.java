import javax.swing.JOptionPane;

public class Ava{
    public static void controle(){
        String valorproduto = JOptionPane.showInputDialog(null, "Digite o valor:");
        String msg;
        double valor = Double.parseDouble(valorproduto);
        double lucro;

        if(valor > 20){
            lucro = (valor * 30)/ 100;
            valor = valor + lucro;
            msg = ("lucro de:" + valor);
        }
        else{
            lucro = (valor * 45)/ 100;
            valor = valor + lucro;
            msg =("lucro de:" + valor);
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    public static void main(String[] args) {
        controle();
    }
}