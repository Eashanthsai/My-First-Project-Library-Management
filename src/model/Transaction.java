package model;

import java.time.LocalDate;


public class Transaction {


    private int bookId;
    private int memberId;
    private LocalDate issueDate;
    private LocalDate returnDate;



    public Transaction(int bookId,int memberId){

        this.bookId=bookId;
        this.memberId=memberId;

        issueDate=LocalDate.now();

    }



    public void returnBook(){

        returnDate=LocalDate.now();

    }



    public LocalDate getIssueDate(){

        return issueDate;

    }


    public LocalDate getReturnDate(){

        return returnDate;

    }


}