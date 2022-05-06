package com.example.javafx_maven2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdministrationController {

    @FXML
    private TextField addActorTextField;

    @FXML
    private TextField addAuthorTextField;

    @FXML
    private TextField addIsbnTextField;

    @FXML
    private TextField addTitleTextField;

    @FXML
    private TextField addYearTextField;

    @FXML
    private Button buttonAddToDb;

    @FXML
    private Button buttonGetOverdueLoans;

    @FXML
    private Button buttonLogout;

    @FXML
    private Button buttonRemoveFromDb;

    @FXML
    private TableView<?> overdueLoansTableView1;

    @FXML
    private TableView<?> searchResultsTableView;

    @FXML
    void addItemsToDb(ActionEvent event) {

    }

    @FXML
    void getOverdueLoans(ActionEvent event) {

    }

    @FXML
    void removeItemFromDb(ActionEvent event) {

    }

    @FXML
    void setCurrentViewSearchBook(ActionEvent event) {

    }

}
