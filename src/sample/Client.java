package sample;

import server.Inventory;
import server.MySQLServiceStock;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import java.util.List;
import java.util.ArrayList;

public class Client {
    private MySQLServiceStock.Client client;
    private TTransport transport;

    public void connect(){
        try {
            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new  TBinaryProtocol(transport);
            client = new MySQLServiceStock.Client(protocol);

            System.out.println("Connection established");
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public List<Inventory> getInventory()
    {
        List<Inventory> list = new ArrayList<Inventory>();
        try{
            list = client.getInventory();
        } catch (TException x) {
            x.printStackTrace();
        }
        return list;
    }

    public void close(){
        transport.close();
        System.out.println("Connection closed");
    }
}


