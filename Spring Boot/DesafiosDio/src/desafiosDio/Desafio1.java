package desafiosDio;

import java.util.Scanner;


public class Desafio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = 0;

            for (int i = x; i <= y; i++) {
                if (i % 2 != 0) {

                    soma = soma + i;
                }

                System.out.println(soma);
                sc.close();
            }}}

