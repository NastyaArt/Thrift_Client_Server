package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.stage.Modality;
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

    public void EditEquipment(ActionEvent actionEvent) throws Exception {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(EquipmentEdit.class.getResource("EquipmentEdit.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Equipment Edit");
        stage.setResizable(false);
        stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
        stage.show();
    }

    public void EditCabinet(ActionEvent actionEvent) throws Exception {
    }

    public void EditResponsible(ActionEvent actionEvent) throws Exception {
    }

    public void EditDistribution(ActionEvent actionEvent) throws Exception {
    }

    public void EditWriteoff(ActionEvent actionEvent) throws Exception {
    }

    public void exit() {
        client.close();
    }
}
