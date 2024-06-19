/*Desenvolva uma classe que peça ao usuário um número e apresente a tabuada deste número de 1 a 10, utilizando um loop para gerar os resultados.*/

import java.io.IOException;
import java.util.Scanner;

public class Tabuada 
{
    public static void main(String[] args) throws IOException 
    {
        int entrada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar um número: ");
        entrada = scanner.nextInt();

        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println(resultado);   
            multiplicador++;
        }
    }
}