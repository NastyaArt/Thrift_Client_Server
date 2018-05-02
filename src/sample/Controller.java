package sample;

import javafx.fxml.FXML;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import server.Equipment;
import server.Cabinet;
import server.Responsible;
import server.Distribution;
import server.Writeoff;

import java.util.List;

public class Controller {
    public Button btnAdd;
    public Button btnDel;
    public Button btnEdit;
    private Client client;

    @FXML
    public void initialize() {
        client = new Client();
        client.connect();
        List<Equipment> listEquipment = client.getEquipment();
        List<Cabinet> listCabinet = client.getCabinet();
        List<Responsible> listResponsible = client.getResponsible();
        List<Distribution> listDistribution = client.getDistribution();
        List<Writeoff> listWriteoff = client.getWriteoff();
    }

    public void Add(ActionEvent actionEvent) {
        List<Equipment> list = client.getEquipment();
        btnAdd.setText(list.get(1).getName());
    }

    public void Delete(ActionEvent actionEvent) {
    }

    public void Edit(ActionEvent actionEvent) {
    }

    public void exit() {
        client.close();
    }
}
