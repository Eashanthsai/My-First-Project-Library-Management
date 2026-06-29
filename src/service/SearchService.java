package service;
import java.util.ArrayList;
import model.Book;

public class SearchService {
    public void searchByTitle( ArrayList<Book> books,  String title){

         for(Book b:books){


            if(b.getTitle().equalsIgnoreCase(title)){


                b.display();

            }

        } 
    }
 }


