/*

Crie uma classe que utilize a JOptionPane para entrada de dados. Receba o valor de transação de um imóvel, o valor venal e a porcentagem do imposto ITBI.
Calcule o imposto com base no maior valor entre o valor de transação e o valor venal.
 
 */

import java.util.Scanner;
public class imovel {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor, venal, porcentagem;

        int total, ve2, porcTotal;

        // recebe o valor do imovel

        System.out.println("Digite o valor da transação do imóvel:\n");
        valor = teclado.nextInt();

        // recebe o valor venal

        System.out.println("Digite o valor venal:\n");

        ve2 = (venal / 100) * valor;


        venal = teclado.nextInt();

        // recebe a porcentagem

        System.out.println("Digite o valor da porcentagem do imposto ITBI:\n");
        porcentagem = teclado.nextInt();

        porcTotal = (porcentagem / 100) * valor;


        total = porcTotal + ve2;


        System.out.println("Valor de porcentagem em cima do imposto eh:", total)



    }
}