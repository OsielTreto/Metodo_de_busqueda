package metodos.de.busqueda;

import java.util.*;

public class BUSQUEDA {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int contador = 0, i, j, posicioni, posicionj, nl;
        String sala1[][] = new String[10][10];

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                sala1[i][j] = (i) + "," + (j);

            }
        }

        System.out.println("CUANTOS LUGARES VA A COMPRAR");
        nl = teclado.nextInt();
        System.out.println("ELIGA LOS ASIENTOS");
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print("[" + sala1[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }

        while (contador != nl) {
            System.out.println("\nEscriba la posicion en el orden que se muestre");
            posicioni = teclado.nextInt();
            posicionj = teclado.nextInt();
            if (sala1[posicioni][posicionj] != "OCU") {
                sala1[posicioni][posicionj] = "OCU";
                contador++;
            } else {
                System.out.println("ASIENTO OCUPADO");
            }
        }
        System.out.println("SALA 1:");
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print("[" + sala1[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }

    }

}
