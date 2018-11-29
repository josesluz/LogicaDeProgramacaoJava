/*
Atividade para prática de Lógica de Programação em Java
José Luz - josesluz@gmail.com
*/

package calculonotas;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;   

public class CalculoNotas {
    
    public static void main(String[] args) {

        //Entrada de dados de Nome, disciplina e notas        
        entrada e1 = new entrada();
                
        //Converte casas decimais (Arredondamento)
        //DecimalFormat df = new DecimalFormat("0.#");
        //String dx = df.format(e1.media);
        //double dxx = Double.parseDouble(dx);
        
        //Exibe a média via OPtionPane
        JOptionPane.showMessageDialog(null, "A média de "+e1.aluno+" na disciplina "+e1.disciplina+" é: "+e1.media);
        // Condição para aprovação do aluno, se for nota igual ou maior que 6 o aluno está aprovado
        if (e1.media >= 6){
                JOptionPane.showMessageDialog(null, "O aluno está aprovado");
        } else {
                JOptionPane.showMessageDialog(null, "O aluno está reprovado");
            }

        //Interpretando a escolha do usuário, opção para fazer uma nova operação
        int opcao = JOptionPane.showOptionDialog(null, 
            "Deseja realizar um novo calculo?", 
            "Calculadora", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, 
            null, null, null);
                
        //Enquanto a escolha for SIM, repetirá a entrada de dados
        while (opcao == JOptionPane.YES_OPTION){
        entrada e2 = new entrada();
        
        //Exibe a média via OPtionPane
        JOptionPane.showMessageDialog(null, "A média de "+e2.aluno+" na disciplina "+e2.disciplina+" é: "+e2.media);        
        
        if (e2.media >= 6){
                JOptionPane.showMessageDialog(null, "O aluno está aprovado");
        } else {
                JOptionPane.showMessageDialog(null, "O aluno está reprovado");
            }
        int opcao1 = JOptionPane.showOptionDialog(null, 
            "Deseja realizar um novo calculo?", 
            "Calculadora", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, null, null);
        }
    }
}