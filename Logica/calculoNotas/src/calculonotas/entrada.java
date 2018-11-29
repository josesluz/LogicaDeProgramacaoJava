package calculonotas;

import javax.swing.JOptionPane;

/**
 *
 * @author josesluz
 */
public class entrada{

    //Solicita os atributos via JOptionPane para as variaveis xS e yS para realização do calculo.
    String aluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");
    String disciplina = JOptionPane.showInputDialog(null, "Digite o nome da disciplina: ");
    String nota1S = JOptionPane.showInputDialog(null, "Digite a Nota 1: ");
    String nota2S = JOptionPane.showInputDialog(null, "Digite o Nota 2: ");
    String nota3S = JOptionPane.showInputDialog(null, "Digite a Nota 3: ");

    //COnverte os valores recebidos em string para o formato double
    double nota1 = Double.parseDouble(nota1S);
    double nota2 = Double.parseDouble(nota2S);
    double nota3 = Double.parseDouble(nota3S);
    double media = ((nota1+nota2+nota3)/3);
}