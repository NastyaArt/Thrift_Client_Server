package server;

import org.apache.thrift.TException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class MySQLServiceStockImpl implements MySQLServiceStock.Iface {

    private String url = "jdbc:mysql://localhost:3306/stock?autoReconnect=true&useSSL=false";
    private String user = "root";
    private String password = "root";

    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    @Override
    public List<Stock> getStocks() throws TException {
        List<Stock> list = new ArrayList<Stock>();
        return list;
    }

    @Override
    public List<Inventory> getInventory() throws TException {
        List<Inventory> list = new ArrayList<Inventory>();

        String query = "select * from inventory";
        sendSelectRequest(query);
        try {
            while (rs.next()) {
                int code = rs.getInt("code");
                String name = rs.getString("name");
                String type = rs.getString("type");

                list.add(new Inventory(code, name, type));
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeConnection();
        }
        return list;
    }

    @Override
    public List<Purchase> getPurchase() throws TException {
        List<Purchase> list = new ArrayList<Purchase>();
        return list;
    }

    @Override
    public java.util.List<Sales> getSales() throws TException {
        List<Sales> list = new ArrayList<Sales>();
        return list;
    }

    @Override
    public void addStock(Stock stock) throws TException {
    }

    @Override
    public void addInventory(Inventory inventory) throws TException {
    }

    @Override
    public void addPurchase(Purchase purchase) throws TException {
    }

    @Override
    public void addSales(Sales sales) throws TException {
    }

    @Override
    public void delStock(Stock stock) throws TException {
    }

    @Override
    public void delInventory(Inventory inventory) throws TException {
    }

    @Override
    public void delPurchase(Purchase purchase) throws TException {
    }

    @Override
    public void delSales(Sales sales) throws TException {
    }

    @Override
    public void editStock(Stock stock) throws TException {
    }

    @Override
    public void editInventory(Inventory inventory) throws TException {
    }

    @Override
    public void editPurchase(Purchase purchase) throws TException {
    }

    @Override
    public void editSales(Sales sales) throws TException {
    }

    private void sendSelectRequest(String query) {

        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    private void closeConnection() {
        try {
            con.close();
        } catch (SQLException se) { /*can't do anything */ }
        try {
            stmt.close();
        } catch (SQLException se) { /*can't do anything */ }
        try {
            rs.close();
        } catch (SQLException se) { /*can't do anything */ }
    }
}
