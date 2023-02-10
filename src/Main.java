import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "./";
        String file = "datos.txt";

        String path_ext = path + file;

        try {
            Fichero.write(path, file);
            Fichero.read(path_ext);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}