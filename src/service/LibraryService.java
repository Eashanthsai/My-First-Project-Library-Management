package service;

import exception.*;
import java.util.ArrayList;
import model.*;

public class LibraryService {


    ArrayList<Book> books = new ArrayList<>();

    ArrayList<Member> members = new ArrayList<>();



    public void addBook(Book b){

        books.add(b);

    }



    public void showBooks(){

        for(Book b : books){

            b.display();

        }

    }



    public void addMember(Member m){

        members.add(m);

    }



    public void issueBook(int id) 
    throws BookNotFoundException, BookAlreadyIssuedException {


        for(Book b : books){


            if(b.getId() == id){


                if(!b.issueBook()){


                    throw new BookAlreadyIssuedException(
                    "Book already issued");


                }


                System.out.println("Book issued");

                return;


            }

        }


        throw new BookNotFoundException(
        "Book not found");


    }




    public void returnBook(int id) 
    throws BookNotFoundException {


        for(Book b : books){


            if(b.getId() == id){


                b.returnBook();


                System.out.println("Book returned");

                return;


            }

        }


        throw new BookNotFoundException(
        "Book not found");


    }


}