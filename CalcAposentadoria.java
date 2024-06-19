/*

Elabore uma classe que receba idade, sexo e anos de contribuição de uma pessoa. 
Determine se ela já pode se aposentar ou quantos anos faltam para isso, baseado nas regras de aposentadoria por idade ou por tempo de contribuição.


*/

import java.util.Scanner;
public class CalcAposentadoria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite seu sexo:\n");
        System.out.print("Obs..[1] Para Maculino e [2] para feminino... \n \n");
        int sexo = scanner.nextInt();

        System.out.print("Digite o tempo de contribuição \n\n");
        int contribui = scanner.nextInt();

        if (sexo == 2) {

            if ((idade >= 62) && (contribui >= 15)) {

                System.out.print("Parabens, você Já pode se aposentar.\n");
            } else {

                System.out.print("Que pena, Ainda você não pode se aposentar.\n \n");
            }
        } else if (sexo == 1) {

            if ((idade >= 65) && (contribui >= 15)) {

                System.out.print("Parabens, você Já pode se aposentar.\n\n");
            } else {

                System.out.print("Que pena, ainda você não pode se aposentar.\n\n");
            }
        }

        scanner.close();
    }

}