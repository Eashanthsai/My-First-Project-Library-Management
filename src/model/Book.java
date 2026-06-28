package model;

public class Book {
    
    private int id;
    private String title;
    private String author;
    private boolean Issued;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.Issued = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    
    public void issueBook(){

        Issued=true;

    }



    public void returnBook(){

        Issued=false;

    }



    public void display(){

        System.out.println(
        id+" | "+
        title+" | "+
        author+
        " | Issued : "+
        Issued);

    }

}
