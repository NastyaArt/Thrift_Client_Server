package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import server.Distribution;

public class DistributionEdit {

    public TextField codeAdd;
    public TextField codeCabinetAdd;
    public TextField codeEquipmentAdd;
    public TextField numberAdd;
    public TextField dateAdd;

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

        Distribution dist = new Distribution(Integer.parseInt(code), Integer.parseInt(codeCabinet),Integer.parseInt(codeEquipment),Integer.parseInt(number), date);
        client.addDistribution(dist);
    }

    public void Delete(ActionEvent actionEvent) {
        client.delDistribution(Integer.parseInt(codeDel.getText()));
    }

    public void Edit(ActionEvent actionEvent) {
    }

    public void setClient(Client cl){
        client = cl;
    }
}
