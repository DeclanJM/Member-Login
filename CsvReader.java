import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {
    private String filePath;
    private String delimiter;

    public CsvReader(String filePath, String delimiter) {
        this.filePath = filePath;
        this.delimiter = delimiter;
    }

    public ArrayList<User> readUsersFromCsv() throws FileNotFoundException, IOException{
        ArrayList<User> userList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                // Skip the first line if it contains headers
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                String[] values = line.split(delimiter);

                User user = new User();
                if (values.length <= 5) {
                    user.setName(values[0]);
                    user.setBond(values[1]);
                    user.setPhoneNumber(values[2]);
                    user.setEmail(values[3]);
                    if (values.length > 4 && !values[4].isEmpty()) {
                        user.setHoldsPosition(true);
                        user.setPosition(values[4]);
                    } else {
                        user.setHoldsPosition(false);
                        user.setPosition("None");
                    }
                }
                userList.add(user);
            }
            return userList;
        }  
    }
}
