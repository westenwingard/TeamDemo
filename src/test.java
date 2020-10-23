import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class test {

    public static void main(String[] args) throws FileNotFoundException {
        //Users test = Users.getInstance();
        //test.addUser("one", "1", true);
        //test.addUser("two", "2", false);
        System.out.println(new File(".").getAbsoluteFile());
    }
}
