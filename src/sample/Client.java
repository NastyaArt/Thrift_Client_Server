package sample;

import server.MultiplicationService;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;

public class Client {
    private MultiplicationService.Client client;
    private TTransport transport;

//    public static void main(String [] args){
    public void connect(){
        try {
//            TTransport transport;

            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new  TBinaryProtocol(transport);
            //MultiplicationService.Client
            client = new MultiplicationService.Client(protocol);

//            perform(client);

//            transport.close();
            System.out.println("Connection established");
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    private static void perform(MultiplicationService.Client client) throws TException
    {
            int product = client.multiply(3,5);
            System.out.println("3*5=" + product);
    }

    public int multiple(int a, int b)
    {
        int product = 0;
        try{
            product = client.multiply(a,b);
        } catch (TException x) {
            x.printStackTrace();
        }
        return product;
    }

    public void close(){
        transport.close();
        System.out.println("Connection closed");
    }
}


