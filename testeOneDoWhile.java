package testeone;

import java.util.Scanner;

public class testeOneDoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, soma = 0;

        do {
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();

            if (numero < 0){
                System.out.println("Números negativos não são permitidos");
            }else if (soma <= 300){
                soma = numero + soma;
            }
        }while (soma <= 300);

        System.out.println("O Somatório soi " + soma);

    }

}