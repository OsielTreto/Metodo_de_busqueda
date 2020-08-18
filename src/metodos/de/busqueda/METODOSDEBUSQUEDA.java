package metodos.de.busqueda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class METODOSDEBUSQUEDA {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner teclado = new Scanner(System.in);
        Vector<String> Datos = new Vector();
        String lol;
        int pos;

        /*
         Datos.add("Osiel");
         Datos.add("Marco");
         Datos.add("Miguel");
         Datos.add("Fili");
         Datos.add("Muski");
         */
        File archivo = new File("C:\\Users\\OsielAlejandro\\Downloads\\Desktop\\METODOS DE BUSQUEDA\\LEER\\archivo.in");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        while (br.readLine() != null) {

            Datos.add(br.readLine());
        }
        System.out.println("TERMINO");
        /* for (int i = 0; i < Datos.size(); i++) {
         System.out.println(Datos+"\n");
         }
         */

        try {
            lol = teclado.next();
            for (int i = 0; i < Datos.size(); i++) {
                if (lol.equalsIgnoreCase(Datos.get(i))) {
                    p("ENCONTRADO "
                            + "\nPOSICIÓN: " + i + "\n");
                    pos = i;
                }
            }
        } catch (Exception a) {
            p("YA FUISTE");
        }

    }

    public static void p(String s) {
        System.out.println(s);
    }

}
