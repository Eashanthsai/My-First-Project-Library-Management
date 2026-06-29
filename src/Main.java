import model.*;
import service.*;
import util.*;

public class Main {

    public static void main(String args[]){

    LibraryService service = new LibraryService();

while(true){

System.out.println("\n1.Add Book"+"\n2.Show Books"+"\n3.Add Member"+"\n4.Issue Book"+"\n5.Return Book"+"\n6.Exit");

System.out.print("Choice: ");

int choice = InputManager.getInt();

switch(choice){

    case 1:


        System.out.print("ID: ");

            int id = InputManager.getInt();
            System.out.print("Title: ");
            String title = InputManager.getString();
            System.out.print("Author: ");
            String author = InputManager.getString();
            service.addBook(new Book(id,title,author));
                break;

    case 2:
        service.showBooks();
        break;

    case 3:
        System.out.print("Member ID:");
        int mid = InputManager.getInt();
        System.out.print("Name:");

        String name = InputManager.getString();
        service.addMember(new Member(mid,name));
            break;
    case 4:

        try{

        System.out.print("Book ID:");

        int bid = InputManager.getInt();
            service.issueBook(bid);
            }
        catch(Exception e){

        System.out.println(e.getMessage());
        }
        break;

    case 5:


        try{
        System.out.print("Book ID:");
        int rid = InputManager.getInt();
            service.returnBook(rid);
        }
        catch(Exception e){
        System.out.println(e.getMessage());
        }


        break;
    case 6:

        System.exit(0);


            }
        }
    }
}