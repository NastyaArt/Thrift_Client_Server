package sample;

import server.Equipment;
import server.Cabinet;
import server.Responsible;
import server.Distribution;
import server.Writeoff;
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

    public List<Cabinet> getCabinet()
    {
        List<Cabinet> list = new ArrayList<Cabinet>();
        try{
            list = client.getCabinet();
        } catch (TException x) {
            x.printStackTrace();
        }
        return list;
    }

    public List<Responsible> getResponsible()
    {
        List<Responsible> list = new ArrayList<Responsible>();
        try{
            list = client.getResponsible();
        } catch (TException x) {
            x.printStackTrace();
        }
        return list;
    }

    public List<Distribution> getDistribution()
    {
        List<Distribution> list = new ArrayList<Distribution>();
        try{
            list = client.getDistribution();
        } catch (TException x) {
            x.printStackTrace();
        }
        return list;
    }

    public List<Writeoff> getWriteoff()
    {
        List<Writeoff> list = new ArrayList<Writeoff>();
        try{
            list = client.getWriteoff();
        } catch (TException x) {
            x.printStackTrace();
        }
        return list;
    }

    public void addEquipment(Equipment eq)
    {
        try{
            client.addEquipment(eq);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void addCabinet(Cabinet cab)
    {
        try{
            client.addCabinet(cab);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void addResponsible(Responsible resp)
    {
        try{
            client.addResponsible(resp);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void addDistribution(Distribution dist)
    {
        try{
            client.addDistribution(dist);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void addWriteoff(Writeoff wr)
    {
        try{
            client.addWriteoff(wr);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void delEquipment(int code)
    {
        try{
            client.delEquipment(code);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void delCabinet(int code)
    {
        try{
            client.delCabinet(code);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void delResponsible(int code)
    {
        try{
            client.delResponsible(code);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void delDistribution(int code)
    {
        try{
            client.delDistribution(code);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void delWriteoff(int code)
    {
        try{
            client.delWriteoff(code);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void editEquipment(Equipment eq)
    {
        try{
            client.editEquipment(eq);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void editCabinet(Cabinet cab)
    {
        try{
            client.editCabinet(cab);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void editResponsible(Responsible resp)
    {
        try{
            client.editResponsible(resp);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void editDistribution(Distribution dist)
    {
        try{
            client.editDistribution(dist);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void editWriteoff(Writeoff wr)
    {
        try{
            client.editWriteoff(wr);
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    public void close(){
        transport.close();
        System.out.println("Connection closed");
    }
}


