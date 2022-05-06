package com.example.javafx_maven2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class MyAccountController {

    @FXML
    private Button buttonGetReceipt;

    @FXML
    private Button buttonLogout;

    @FXML
    private Button buttonNewLoan;

    @FXML
    private Button buttonReturnLoan;

    @FXML
    private TableView<?> currentLoans;

    @FXML
    private TableView<?> searchResultsTableView;

    @FXML
    void printReceipt(ActionEvent event) {

    }

    @FXML
    void setCurrentViewSearchBook(ActionEvent event) {

    }

    @FXML
    void setNewLoan(ActionEvent event) {

    }

    @FXML
    void updateLoanCopyStatus(ActionEvent event) {

    }

}
