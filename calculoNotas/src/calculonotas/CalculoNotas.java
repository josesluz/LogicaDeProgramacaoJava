package calculonotas;

import javax.swing.JOptionPane;

public class CalculoNotas {

    
    public static void main(String[] args) {

        //Solicita os atributos via JOptionPane para as variaveis xS e yS para realização do calculo.
        String xS = JOptionPane.showInputDialog(null, "Digite o valor de X :");
        String yS = JOptionPane.showInputDialog(null, "Digite o valor de Y :");
        
        //COnverte os valores recebidos em string para o formato double
        double x = Double.parseDouble(xS);
        double y = Double.parseDouble(yS);

        //Realiza calculos da média com os valores já recebido em double.
        double media = ((x+y)/2);

        //Exibe a média via OPtionPane
        JOptionPane.showMessageDialog(null, "O valor do calculo é igual a: " +media);
    }
    
}