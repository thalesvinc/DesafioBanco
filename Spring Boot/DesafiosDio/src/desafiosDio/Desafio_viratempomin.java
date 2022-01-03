package desafiosDio;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;


public class Desafio_viratempomin {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            double graus = leitor.nextDouble();

            if (graus <= 360) {
                if (graus < 90 | graus == 360) System.out.println("Bom Dia!!");
                else if (graus < 180) System.out.println("Boa Tarde!!");
                else if (graus < 270) System.out.println("Boa Noite!!");
                else System.out.println("De Madrugada!!");
            }

            Double horas = (graus * 15.0) + 6.0;
            Double minutos =0.0;
            Double segundos =0.0;

            System.out.println(horas);

            minutos =(horas - horas.intValue()) * 60;
            System.out.println(minutos);
            segundos =(minutos - minutos.intValue()) * 60;

            if (segundos > 59) {
                segundos = 0.0;
                minutos += 1.0;
            }
            if (horas > 24.0&&horas<25) {
                horas = 0.0;
            }


            System.out.printf("%02d:%02d:%02d%n", horas.intValue(), minutos.intValue(), segundos.intValue());
        }
    }
}




