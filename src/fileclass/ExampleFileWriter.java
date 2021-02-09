package fileclass;

import java.io.FileWriter;
import java.io.IOException;

public class ExampleFileWriter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("lol.txt");
            writer.write("Roses are red \nVilets are blue \nBooty");
            writer.append("\n(A test)");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
