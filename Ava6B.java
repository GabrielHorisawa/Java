import javax.swing.JOptionPane;

public class Ava6B{
    public static void controle(){
        String nome = JOptionPane.showInputDialog(null, "Digite o Nome:");
        String msg;
        String idade = JOptionPane.showInputDialog(null, "Digite a Idade:");
        double n = Double.parseDouble(idade);
        int nm = (int)n; //conversão de double pra int//

        if (nm <= 10) {
           msg = nome + " você deverá pagar R$ 30";
        }

        else if(nm > 10 && nm <=29){
          msg = nome + " você deverá pagar R$ 60";
        }

        else if(nm > 29 && nm <=45){
           msg = nome + " você deverá pagar R$ 120";
        }

        else if(nm > 45 && nm <=59){
          msg = nome + " você deverá pagar R$ 150";
        }

        else if(nm > 59 && nm <=65){
          msg = nome + " você deverá pagar R$ 250";
        }

        else{
       msg = nome + " você deverá pagar R$ 400";
        }

        JOptionPane.showMessageDialog(null, msg);
    }

    public static void main(String[] args) {
        controle();
    }
}