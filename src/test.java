public class test {

    public static void main(String[] args) {
        Users test = Users.getInstance();
        test.addUser("one", "1", true);
        test.addUser("two", "2", false);
    }
}
