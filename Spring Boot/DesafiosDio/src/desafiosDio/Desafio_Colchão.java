package desafiosDio;

import java.util.Scanner;

public class Desafio_Colchão {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, h, l, maiorcolchao, segundomaior;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        h = sc.nextInt();
        l = sc.nextInt();
        maiorcolchao = 0;
        segundomaior = 0;

        if (a > b && a > c) {
            maiorcolchao = a;
        } else if (b > a && b > c) {
            maiorcolchao = b;
        } else {
            maiorcolchao = c;


        }
        if (a < maiorcolchao && a > b | a > c)
            segundomaior = a;
        else if (b < maiorcolchao && b > a | b > c)
            segundomaior = b;
        else
            segundomaior = c;


        if (maiorcolchao >= h && segundomaior <= l)
            System.out.println("S");
        else if (maiorcolchao >= l && segundomaior <= h)
            System.out.println("S");
        else {
            System.out.println("N");

        }
    }
}

