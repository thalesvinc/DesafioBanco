package desafiosDio;

import java.util.Scanner;

public class Desafio_viratempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int graus = sc.nextInt();
            if (graus < 90 | graus == 360) System.out.println("Bom Dia!!");
            else if (graus < 180) System.out.println("Boa Tarde!!");
            else if (graus < 270) System.out.println("Boa Noite!!");
            else System.out.println("De Madrugada!!");
        }
    }
}


