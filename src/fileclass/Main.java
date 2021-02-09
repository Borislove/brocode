package fileclass;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // file = An abstract representation of file and directory pathnames
        File file = new File("secret_message.txt"); //в папке проекта
        if (file.exists()) {
            System.out.println("That file exist!");
            System.out.println(file.getPath()); //название файла
            System.out.println(file.getAbsolutePath()); //путь где находится файл
            System.out.println(file.isFile());
         //   file.delete();
        } else {
            System.out.println("That file doesn't exist:");
        }
    }
}
