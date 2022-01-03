package desafiosDio;

import java.util.Scanner;

public class DesafioParImparPosNeg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int par,impar, positivo,negativo;
        par=0;
        impar=0;
        positivo=0;
        negativo=0;

        int num1 = sc.nextInt();
        if (num1 >0)
            positivo=positivo+1;
        else if(num1 <0)
            negativo=negativo+1;

        if (num1%2==0)
            par=par+1;
        else
            impar=impar+1;

        int num2 = sc.nextInt();

        if (num2 >0)
            positivo=positivo+1;
        else if(num2<0)
            negativo=negativo+1;

        if (num2%2==0)
            par=par+1;
        else
            impar=impar+1;

        int num3 = sc.nextInt();

        if (num3 >0)
            positivo=positivo+1;
        else if (num3 <0)
            negativo=negativo+1;

        if (num3%2==0)
            par=par+1;
        else
            impar=impar+1;
        int num4 = sc.nextInt();

        if (num4 >0)
            positivo=positivo+1;
        else if (num4<0)
            negativo=negativo+1;

        if (num4%2==0)
            par=par+1;
        else
            impar=impar+1;
        int num5 = sc.nextInt();
        if (num5 >0)
            positivo=positivo+1;
        else if (num5<0)
            negativo=negativo+1;

        if (num5%2==0)
            par=par+1;
        else
            impar=impar+1;

        System.out.println(par + " par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(positivo + " positivo(s)");
        System.out.println(negativo + " negativo(s)");

    }
}
