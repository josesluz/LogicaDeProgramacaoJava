/*
Atividade para prática de Lógica de Programação em Java

José Luz - josesluz@gmail.com

*/

package calculonotas;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class CalculoNotas extends operacoes{
    
    
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
        int opcao = JOptionPane.showOptionDialog(null, 
            "Deseja realizar um novo calculo?", 
            "Calculadora", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, null, null);
            System.out.println();

        // Interpretando a escolha do usuário, em uma próxima etapa serpa implementada a opção de fazer uma nova operação
        if (opcao == JOptionPane.YES_OPTION){
          JOptionPane.showMessageDialog(null, "A opção escolhida foi SIM");
        } else {
          JOptionPane.showMessageDialog(null, "A opção escolhida foi NÃO");
        }
    }   
}