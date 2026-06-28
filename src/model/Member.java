package model;

public class Member extends User {

    public Member(int id, String name) {
        super(id, name);
    }

    public void ShowDashBoard() {
        System.out.println("Member Dashboard");
    }
}
