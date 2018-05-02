package sample;

import server.Equipment;
import server.MySQLServiceEquipment;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import java.util.List;
import java.util.ArrayList;

public class Client {
    private MySQLServiceEquipment.Client client;
    private TTransport transport;

    public void connect(){
        try {
            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new  TBinaryProtocol(transport);
            client = new MySQLServiceEquipment.Client(protocol);

            System.out.println("Connection established");
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public List<Equipment> getEquipment()
    {
        List<Equipment> list = new ArrayList<Equipment>();
        try{
            list = client.getEquipment();
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


