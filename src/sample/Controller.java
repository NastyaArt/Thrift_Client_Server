package sample;

import javafx.fxml.FXML;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    public TableView<Equipment> tableEquipment;
    public TableView<Cabinet> tableCabinet;
    public TableView<Responsible> tableResponsible;
    public TableView<Distribution> tableDistribution;
    public TableView<Writeoff> tableWriteoff;

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

        ObservableList<Equipment> dataEquipment = FXCollections.observableArrayList(listEquipment);
        tableEquipment.setItems(dataEquipment);
        ObservableList<Cabinet> dataCabinet = FXCollections.observableArrayList(listCabinet);
        tableCabinet.setItems(dataCabinet);
        ObservableList<Responsible> dataResponsible = FXCollections.observableArrayList(listResponsible);
        tableResponsible.setItems(dataResponsible);
        ObservableList<Distribution> dataDistribution = FXCollections.observableArrayList(listDistribution);
        tableDistribution.setItems(dataDistribution);
        ObservableList<Writeoff> dataWriteoff = FXCollections.observableArrayList(listWriteoff);
        tableWriteoff.setItems(dataWriteoff);

    }

    public void Add(ActionEvent actionEvent) {
        
    }

    public void Delete(ActionEvent actionEvent) {
    }

    public void Edit(ActionEvent actionEvent) {
    }

    public void exit() {
        client.close();
    }
}
