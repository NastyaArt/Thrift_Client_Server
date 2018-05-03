package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import server.Writeoff;

public class WriteoffEdit {

    public TextField codeAdd;
    public TextField codeCabinetAdd;
    public TextField codeEquipmentAdd;
    public TextField numberAdd;
    public TextField dateAdd;
    public TextField causeAdd;

    public TextField codeDel;

    private Client client;

    @FXML
    public void initialize() {

    }

    public void Add(ActionEvent actionEvent) {
        String code = codeAdd.getText();
        String codeCabinet = codeCabinetAdd.getText();
        String codeEquipment = codeEquipmentAdd.getText();
        String number = numberAdd.getText();
        String date = dateAdd.getText();
        String cause = causeAdd.getText();

        Writeoff wr = new Writeoff(Integer.parseInt(code), Integer.parseInt(codeCabinet),Integer.parseInt(codeEquipment),Integer.parseInt(number), date, cause);
        client.addWriteoff(wr);
    }

    public void Delete(ActionEvent actionEvent) {
        client.delWriteoff(Integer.parseInt(codeDel.getText()));
    }

    public void Edit(ActionEvent actionEvent) {
    }

    public void setClient(Client cl){
        client = cl;
    }
}
