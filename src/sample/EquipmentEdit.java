package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import server.Equipment;

public class EquipmentEdit {

    public TextField codeAdd;
    public TextField categoryAdd;
    public TextField nameAdd;
    public TextField costAdd;
    public TextField producerAdd;
    public TextField receiptDateAdd;

    public TextField codeDel;

    private Client client;

    @FXML
    public void initialize() {

    }

    public void Add(ActionEvent actionEvent) {
        String code = codeAdd.getText();
        String category = categoryAdd.getText();
        String name = nameAdd.getText();
        String cost = costAdd.getText();
        String producer = producerAdd.getText();
        String receiptDate = receiptDateAdd.getText();

        Equipment eq = new Equipment(Integer.parseInt(code), category, name, Integer.parseInt(cost), producer, receiptDate);
        client.addEquipment(eq);
    }

    public void Delete(ActionEvent actionEvent) {
        client.delEquipment(Integer.parseInt(codeDel.getText()));
    }

    public void Edit(ActionEvent actionEvent) {
    }

    public void setClient(Client cl){
        client = cl;
    }
}
