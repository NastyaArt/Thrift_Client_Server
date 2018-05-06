package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import server.Cabinet;

public class CabinetEdit {

    public TextField codeAdd;
    public TextField nameAdd;
    public TextField codeResponsibleAdd;

    public TextField codeDel;

    private Client client;

    @FXML
    public void initialize() {

    }

    public void Add(ActionEvent actionEvent) {
        int code = Integer.parseInt(codeAdd.getText());
        String name = nameAdd.getText();
        int codeResponsible = Integer.parseInt(codeResponsibleAdd.getText());
        Cabinet cab = new Cabinet(code, name, codeResponsible);
        client.addCabinet(cab);
    }

    public void Delete(ActionEvent actionEvent) {
        client.delCabinet(Integer.parseInt(codeDel.getText()));
    }

    public void Edit(ActionEvent actionEvent) {
    }

    public void setClient(Client cl){
        client = cl;
    }
}
