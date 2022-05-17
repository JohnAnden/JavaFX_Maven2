package com.example.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.example.Controllers.DbConnection.getConnection;

public class AdministrationController {

    @FXML
    private TextField isbnTextField;

    @FXML
    private TextField authorFNameTextField;

    @FXML
    private TextField authorLNameTextField;

    @FXML
    private TextField bookCategoryTextField;

    @FXML
    private TextField bookTitleTextField;

    @FXML
    private TextField bookYearTextField;

    @FXML
    private TextField dvdActorFNameTextField;

    @FXML
    private TextField dvdActorLNameTextField;

    @FXML
    private TextField dvdCategoryTextField;

    @FXML
    private TextField dvdIdTextField;

    @FXML
    private TextField dvdTitleTextField;

    @FXML
    private TextField dvdYearTextField;

    @FXML
    private TableView<?> overdueLoansTableView1;

    @FXML
    private TableView<?> searchResultsTableView;

    @FXML
    void addBookToDb(ActionEvent event) {
        addBookToDatabase();

    }

    @FXML
    void addDvdToDb(ActionEvent event) {
        addDvdToDatabase();
    }

    @FXML
    void getOverdueLoans(ActionEvent event) {

    }

    @FXML
    void removeBookFromDb(ActionEvent event) {
        removeBookFromDatabase();
    }

    @FXML
    void removeDvdFromDb(ActionEvent event) {
        removeDvdFromDatabase();
    }

    @FXML
    void setCurrentViewSearchBook(ActionEvent event) {

    }

    private PreparedStatement insertNewBookIntoBook;
    private PreparedStatement insertNewBookIntoAuthorship;
    private PreparedStatement insertNewBookIntoAuthor;

    private PreparedStatement removeBookFromBook;
    private PreparedStatement removeBookFromAuthorship;
    private PreparedStatement removeBookFromAuthor;

    private PreparedStatement insertNewDvdIntoDvd;
    private PreparedStatement insertNewDvdIntoDvdActorship;
    private PreparedStatement insertNewDvdIntoActor;

    private PreparedStatement removeDvdFromDvd;
    private PreparedStatement removeDvdFromDvdActorship;
    private PreparedStatement removeDvdFromActor;

public int addBookToDatabase() {

    try {
        insertNewBookIntoBook = getConnection().prepareStatement("INSERT INTO Books " +
                "(isbn, bookTitle, year, bookCategory)" +
                "VALUES (?, ?, ?, ?)");

        insertNewBookIntoBook.setString(1, isbnTextField.getText());
        insertNewBookIntoBook.setString(2, bookTitleTextField.getText());
        insertNewBookIntoBook.setString(3, bookYearTextField.getText());
        insertNewBookIntoBook.setString(4, bookCategoryTextField.getText());
                return insertNewBookIntoBook.executeUpdate();

        }catch (SQLException sqlException) {
        sqlException.printStackTrace();
        System.exit(1);

        try{

            insertNewBookIntoAuthorship = getConnection().prepareStatement("INSERT INTO BookAuthorship" +
                    "(bookAuthorship, isbn, authorId)" +
                    "VALUES (?, ?, ?)");

            insertNewBookIntoAuthorship.setInt(1, Integer.parseInt("authorshipId"));
            insertNewBookIntoAuthorship.setString(2, isbnTextField.getText());
            insertNewBookIntoAuthorship.setInt(3, Integer.parseInt("authorId"));
            return insertNewBookIntoAuthorship.executeUpdate();

            }catch (SQLException sqlException2) {
                sqlException.printStackTrace();
                System.exit(1);

        try{
            insertNewBookIntoAuthor = getConnection().prepareStatement("INSERT INTO Author" +
                    "(authorId, lName, fName, authorRank)" +
                    "VALUES (?, ?, ?, ?)");

            insertNewBookIntoAuthor.setInt(1, Integer.parseInt("authorId"));
            insertNewBookIntoAuthor.setString(2, authorLNameTextField.getText());
            insertNewBookIntoAuthor.setString(3, authorFNameTextField.getText());
            insertNewBookIntoAuthor.setString(4, "authorRank");
            return insertNewBookIntoAuthor.executeUpdate();

    } catch (SQLException sqlException3) {
        sqlException.printStackTrace();
        System.exit(1);

    }
    return 0;
}
    }}

public int removeBookFromDatabase() {

    try {
        removeBookFromBook = getConnection().prepareStatement("DELETE FROM Book" +
                "(isbn, bookTitle, year, bookCategory)" +
                "VALUES (?, ?, ?, ?)");

        removeBookFromBook.setString(1, isbnTextField.getText());
        removeBookFromBook.setString(2, bookTitleTextField.getText());
        removeBookFromBook.setString(3, bookYearTextField.getText());
        removeBookFromBook.setString(4, bookCategoryTextField.getText());
            return removeBookFromAuthor.executeUpdate();

    } catch (SQLException sqlException4) {
        sqlException4.printStackTrace();
        System.exit(1);
    }

    try {
        removeBookFromAuthorship = getConnection().prepareStatement("DELETE FROM BookAuthorship" +
                "(bookAuthorship, isbn, authorId)" +
                "VALUES (?, ?, ?)");

        removeBookFromAuthorship.setString(1, "authorshipId");
        removeBookFromAuthorship.setString(2, isbnTextField.getText());
        removeBookFromAuthorship.setInt(3, Integer.parseInt("authorId"));
            return removeBookFromAuthorship.executeUpdate();

    } catch (SQLException sqlException5) {
        sqlException5.printStackTrace();
        System.exit(1);
    }
    try {
        removeBookFromAuthor = getConnection().prepareStatement("DELETE FROM Author" +
                "(authorId, fName, lName, authorRank)" +
                "VALUES (?,?,?,?)");

        removeBookFromAuthor.setInt(1, Integer.parseInt("authorId"));
        removeBookFromAuthor.setString(2, authorLNameTextField.getText());
        removeBookFromAuthor.setString(3, authorFNameTextField.getText());
        removeBookFromAuthor.setString(4, "authorRank");
            return removeBookFromAuthor.executeUpdate();

    } catch (SQLException sqlException6) {
        sqlException6.printStackTrace();
        System.exit(1);
    }
    return 0;

}

public int addDvdToDatabase() {

    try {
        insertNewDvdIntoDvd = getConnection().prepareStatement("INSERT INTO DVD" +
                "(dvdId, dvdTitle, year, dvdCategory)" +
                "VALUES (?, ?, ?, ?)");

        insertNewDvdIntoDvd.setString(1, dvdIdTextField.getText());
        insertNewDvdIntoDvd.setString(2, dvdTitleTextField.getText());
        insertNewDvdIntoDvd.setString(3, dvdYearTextField.getText());
        insertNewDvdIntoDvd.setString(4, dvdCategoryTextField.getText());
        return insertNewDvdIntoDvd.executeUpdate();

    } catch (SQLException sqlException7) {
        sqlException7.printStackTrace();
        System.exit(1);
    }

    try {
        insertNewDvdIntoDvdActorship = getConnection().prepareStatement("INSERT INTO dvdActorship" +
                "(dvdActorship, dvdId, ActorId)" +
                "VALUES (?, ?, ?)");

        insertNewDvdIntoDvdActorship.setString(1, "dvdActorship");
        insertNewDvdIntoDvdActorship.setInt(2, Integer.parseInt("dvdIdTextField"));
        insertNewDvdIntoDvdActorship.setInt(3, Integer.parseInt("dvdActorId"));
        return insertNewDvdIntoDvdActorship.executeUpdate();

    } catch (SQLException sqlException8) {
        sqlException8.printStackTrace();
        System.exit(1);
    }

    try {
        insertNewDvdIntoActor = getConnection().prepareStatement("INSERT INTO Actor" +
                "(actorId, lName, fName, actorRank)" +
                "VALUES (?, ?, ?, ?)");
        insertNewDvdIntoActor.setInt(1, Integer.parseInt("actorid"));
        insertNewDvdIntoActor.setString(2, dvdActorLNameTextField.getText());
        insertNewDvdIntoActor.setString(3, dvdActorFNameTextField.getText());
        insertNewDvdIntoActor.setString(4, "actorRank");
        return insertNewDvdIntoActor.executeUpdate();

    } catch (SQLException sqlException9) {
        sqlException9.printStackTrace();
        System.exit(1);
    }
    return 0;
}

public int removeDvdFromDatabase(){
    try{
        removeDvdFromDvd = getConnection().prepareStatement("DELETE FROM Dvd" +
            "(dvdId, dvdTitle, year, dvdCategory)" +
            "VALUES (?, ?, ?, ?)");
    removeDvdFromDvd.setInt(1, Integer.parseInt("dvdId"));
    removeDvdFromDvd.setString(2, dvdTitleTextField.getText());
    removeDvdFromDvd.setString(3, dvdYearTextField.getText());
    removeDvdFromDvd.setString(4, dvdCategoryTextField.getText());
    return removeDvdFromDvd.executeUpdate();

 }catch (SQLException sqlException10){
    sqlException10.printStackTrace();
    System.exit(1);
 }
    try {
        removeDvdFromDvdActorship = getConnection().prepareStatement("DELETE FROM DvdActorship" +
                "(dvdActorshipId, dvdId, actorId)" +
                "VALUES (?, ?, ?)");
        removeDvdFromDvdActorship.setInt(1, Integer.parseInt("dvdActorshipId"));
        removeDvdFromDvdActorship.setInt(2, Integer.parseInt("dvdId"));
        removeDvdFromDvdActorship.setInt(3, Integer.parseInt("actorId"));
        return removeBookFromAuthorship.executeUpdate();

    }catch (SQLException sqlException11){
        sqlException11.printStackTrace();
        System.exit(1);
    }
    try {
        removeDvdFromActor = getConnection().prepareStatement("DELETE FROM Actor" +
                "(actorId, lName, fName, actorRank)" +
                "VALUES (?, ?, ?, ?)");
        removeDvdFromActor.setInt(1, Integer.parseInt("actorId"));
        removeDvdFromActor.setString(2, dvdActorLNameTextField.getText());
        removeDvdFromActor.setString(3, dvdActorFNameTextField.getText());
        removeDvdFromActor.setString(4, "actorRank");
        return removeDvdFromActor.executeUpdate();


    }catch (SQLException sqlException12){
        sqlException12.printStackTrace();
        System.exit(1);
    }

return 0;
}
}


