import java.io.IOException;
import java.util.List;

public class User {
    private String name;
    private String bond;
    private String phoneNumber;
    private String email;
    private boolean holdsPosition;
    private String position;

    public User() {
        // Default constructor
    }

    public User(String name, String bond, String phoneNumber, String email, boolean holdsPosition, String position) {
        this.name = name;
        this.bond = bond;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.holdsPosition = holdsPosition;
        this.position = position;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getBond() {
        return bond;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public boolean isHoldsPosition() {
        return holdsPosition;
    }

    public String getPosition() {
        return position;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBond(String bond) {
        this.bond = bond;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHoldsPosition(boolean holdsPosition) {
        this.holdsPosition = holdsPosition;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString(){
        String s = "";

        s += "\n";
        s += "Member: " + name;
        s += "\nBond: " + bond;
        s += "\nPhone Number: " + phoneNumber;
        s += "\nEmail: " + email;
        s += "\nPosition: " + position;
        s += "\n ";

        return s;
    }

public static void main(String[] args) {
    User dec = new User();
    CsvReader reader = new CsvReader("Active Roster Spring 2023.csv", ",");
    try {
        List<User> users = reader.readUsersFromCsv();
        System.out.println(users.get(0).getName());
    } catch (IOException e) {
        e.printStackTrace();
        }

    }
}