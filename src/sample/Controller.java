package sample;

import javafx.fxml.FXML;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import server.Inventory;

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
    }

    public void Add(ActionEvent actionEvent) {
        List<Inventory> list = client.getInventory();
        btnAdd.setText(list.get(1).getName());
//        int x = client.multiple(6,9);
//        btnAdd.setText(Integer.toString(x));
    }

    public void Delete(ActionEvent actionEvent) {
    }

    public void Edit(ActionEvent actionEvent) {
    }

    public void exit() {
        client.close();
    }
}
