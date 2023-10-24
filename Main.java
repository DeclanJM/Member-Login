import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CsvReader csvReader = new CsvReader("Active Roster Spring 2023.csv", ",");
        try {
            ArrayList<User> userList = csvReader.readUsersFromCsv();

            System.out.print(userList.get(40).toString());
            System.out.print(userList.get(42).toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}