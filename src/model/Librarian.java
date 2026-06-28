package model;

public class Librarian extends User {

    public Librarian(int id, String name) {
        super(id, name);
    }

    public void ShowDashBoard() {
        System.out.println("Librarian Dashboard");
    }
}
