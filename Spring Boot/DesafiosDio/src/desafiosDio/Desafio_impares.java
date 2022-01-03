package desafiosDio;/*Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles*/


import java.util.Scanner;


public class Desafio_impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int maior, menor;
        int soma = 0;
        int i=0;

        if (x > y) {
            maior = x;
            menor = y;
        } else {
            menor = x;
            maior = y;
        }
        if (menor%2!=0)
            menor=menor+1;

        for (i = menor; i < maior; i++) {
            if (i % 2 != 0)
            soma = soma + i;
        }
        System.out.println(soma);
    }
}




