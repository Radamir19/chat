package com.nurmagomedov.networkclientchat;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Date;

public class HelloController {

    @FXML
    private TextArea chatArea;

    EventHandler eventHandler;
    @FXML
    private ListView<String> clientHistory;

    @FXML
    private ListView<String> chatHistoryList;

    @FXML
    private TextField inputField;

    @FXML
    void initialize() {

    }
//    @FXML
//    void setOnKeyPressed(KeyEvent event) {
//
//    }
//    public void sendFunction() {
//        String text = this.chatArea.getText();
//        chatArea.setOnKeyPressed(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent keyEvent) {
//                if (keyEvent.getCode() == KeyCode.ENTER) {
//                    sendFunction();
//                }
//            }
//        });
//        this.chatArea.setText("");
// }
        void doSend(ActionEvent event) {
        String input = inputField.getText();
        try {
            if(input.length() == 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        chatHistoryList.getItems().add(0,String.format("Massege: %s -- was sent by --> %s",input,new Date()));

    }

}
