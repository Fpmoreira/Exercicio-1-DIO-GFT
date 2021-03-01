

import java.util.Scanner;

public class testeOneFor {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        int number, somar = 0;

        for (; somar <= 300;){
            System.out.println("Digite um número: ");
            number = enter.nextInt();

            if (number < 0){
                System.out.println("Números negativos não são permitidos");
            }else{
                somar = number + somar;
            }

        }

        System.out.println("O Somatório soi " + somar);

    }

}