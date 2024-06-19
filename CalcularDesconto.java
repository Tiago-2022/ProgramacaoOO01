/*
Calculadora de Desconto

Desenvolva uma classe que utilize a classe Scanner para receber o valor de um produto e uma porcentagem de desconto. Calcule e exiba o valor do desconto e o preço final do produto após aplicar o desconto.
Calculadora de ITBI

*/

import java.util.Scanner;
public class CalcularDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double percentual = scanner.nextDouble();

        double desconto = valorProduto * (percentual / 100);

        double valorFinal = valorProduto - desconto;

        System.out.println("Valor do desconto: " + desconto);

        System.out.println("Valor Final: " + valorFinal);

        scanner.close();
    }

}