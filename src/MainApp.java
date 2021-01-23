import model.Bug;

public class MainApp {

    public static void main(String[] args) {
        Bug bug1 = new Bug("It is not possible to log in", "johnny.snowmail@com", 10);

        bug1.showAllData();

        bug1.setBugDescription("Wrong");
        bug1.setEmail("johnnytesetergmail.com");
        bug1.setBugPriority(111);

    }
}