import db.DBHelper;
import models.Borrower;

public class Runner {

    public static void main(String[] args) {


        Borrower borrower1 = new Borrower("Emil", book1);
        Borrower borrower2 = new Borrower("Digory", book2);
        Borrower borrower3 = new Borrower("Pat", book3);

        DBHelper.save(borrower1);
        DBHelper.save(borrower2);
        DBHelper.save(borrower3);

        DBHelper.getAll
    }
}