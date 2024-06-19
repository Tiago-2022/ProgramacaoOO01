/*
Sistema de Avaliação

Utilizando JOptionPane, desenvolva uma classe que receba as notas de duas provas e de um trabalho. Calcule e mostre a média e indique se o aluno está aprovado (média >= 6) ou reprovado.

*/

import javax.swing.JOptionPane;
public class SistemaAvaliacao {

    public static void main(String[] args) {
        int media, i, contAluno = 0;

        for (i = 0; i < 3; i++) {

            contAluno++;
            // recebe a 1º nota

            String nota1 = JOptionPane.showInputDialog(null, "Aluno " + contAluno + ", digite sua 1ª nota");

            int n1 = Integer.parseInt(nota1);

            // recebe a 2º nota

            String nota2 = JOptionPane.showInputDialog(null, "Aluno " + contAluno + ", digite sua 1ª nota");

            int n2 = Integer.parseInt(nota2);

            // recebe a 3º nota
            String nota3 = JOptionPane.showInputDialog(null, "Aluno " + contAluno + ", digite sua 1ª nota");

            int n3 = Integer.parseInt(nota3);

            // calcula a média
            media = (n1 + n2 + n3) / 3;
            JOptionPane.showMessageDialog(null, "A média do aluno " + contAluno + " é " + media);

            // mostra a nota do aluno
            if (media >= 6) {
                JOptionPane.showMessageDialog(null, "Aprovado");
            } else if (media < 6) {
                JOptionPane.showMessageDialog(null, "Reprovado");
            }
        }
    }
}