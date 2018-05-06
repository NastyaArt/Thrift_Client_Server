package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import server.Responsible;

public class ResponsibleEdit {

    public TextField codeAdd;
    public TextField fioAdd;
    public TextField phoneAdd;

    public TextField codeDel;

    private Client client;

    @FXML
    public void initialize() {

    }

    public void Add(ActionEvent actionEvent) {
        int code = Integer.parseInt(codeAdd.getText());
        String fio = fioAdd.getText();
        String phone = phoneAdd.getText();

        Responsible resp = new Responsible(code, fio, phone);
        client.addResponsible(resp);
    }

    public void Delete(ActionEvent actionEvent) {
        client.delResponsible(Integer.parseInt(codeDel.getText()));
    }

    public void Edit(ActionEvent actionEvent) {
    }

    public void setClient(Client cl){
        client = cl;
    }
}
