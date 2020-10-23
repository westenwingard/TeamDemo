import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class test {

    public static void main(String[] args) throws FileNotFoundException {
        Users test = Users.getInstance();
        test.addUser("three", "3", true);
        System.out.println(test.toString());
    }
}
