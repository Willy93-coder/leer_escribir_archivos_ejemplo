import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class Fichero {

    static void write (String path, String file_type) throws IOException {
        String path_ext = path + file_type;
        FileWriter wr = new FileWriter(path_ext, true);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe lo que quieras");
        String text = sc.nextLine();

        while (!text.equalsIgnoreCase("Fin")) {
            System.out.println("Cuando quieras acabar escribe 'fin'...");

            wr.write("\n" + text);
            text = sc.nextLine();
        }

        wr.flush();
        wr.close();
    }

    static void read (String path_ext)throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader(path_ext));
        String text = rd.readLine();

        if (text.equalsIgnoreCase("")) {
            System.out.println("El texto no se puede leer porque está vacío");
        }
        
        while (text != null){
            System.out.println(text);
            text = rd.readLine();
        }
        
        rd.close();
    }


}
