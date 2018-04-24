package server;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class Server {

    public static MySQLServiceStockImpl handler;

    public static MySQLServiceStock.Processor processor;

    public static void main(String [] args) {
        try {
            handler = new MySQLServiceStockImpl();
            processor = new MySQLServiceStock.Processor(handler);

            Runnable simple = new Runnable() {
                public void run() {
                    simple(processor);
                }
            };

            new Thread(simple).start();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public static void simple(MySQLServiceStock.Processor processor) {
        try {
            TServerTransport serverTransport = new TServerSocket(9090);
            TServer server = new TSimpleServer(new Args(serverTransport).processor(processor));

            System.out.println("Starting the simple server...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


