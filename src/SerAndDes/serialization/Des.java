package SerAndDes.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Des {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    User user = null;

    FileInputStream fileIn = new FileInputStream("e:\\javadoc\\employee.ser");
    ObjectInputStream in = new ObjectInputStream(fileIn);

    // user = (User) in.readObject();
    user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
