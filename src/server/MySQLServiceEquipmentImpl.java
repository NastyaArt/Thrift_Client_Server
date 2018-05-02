package server;

import org.apache.thrift.TException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class MySQLServiceEquipmentImpl implements MySQLServiceEquipment.Iface {

    private String url = "jdbc:mysql://localhost:3306/equipment?autoReconnect=true&useSSL=false";
    private String user = "root";
    private String password = "root";

    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    @Override
    public List<Equipment> getEquipment() throws TException {
        List<Equipment> list = new ArrayList<Equipment>();

        String query = "select * from equipment";
        sendSelectRequest(query);
        try {
            while (rs.next()) {
                int code = rs.getInt("code");
                String category = rs.getString("category");
                String name = rs.getString("name");
                int cost = rs.getInt("cost");
                String producer = rs.getString("producer");
                String receiptDate = rs.getString("receiptDate");

                list.add(new Equipment(code, category, name, cost, producer, receiptDate));
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeConnection();
        }

        return list;
    }

    @Override
    public List<Cabinet> getCabinet() throws TException {
        List<Cabinet> list = new ArrayList<Cabinet>();

        String query = "select * from cabinet";
        sendSelectRequest(query);
        try {
            while (rs.next()) {
                int code = rs.getInt("code");
                String name = rs.getString("name");
                int codeResponsible = rs.getInt("codeResponsible");

                list.add(new Cabinet(code, name, codeResponsible));
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeConnection();
        }

        return list;
    }

    @Override
    public List<Responsible> getResponsible() throws TException {
        List<Responsible> list = new ArrayList<Responsible>();

        String query = "select * from responsible";
        sendSelectRequest(query);
        try {
            while (rs.next()) {
                int code = rs.getInt("code");
                String fio = rs.getString("fio");
                String phone = rs.getString("phone");

                list.add(new Responsible(code, fio, phone));
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeConnection();
        }

        return list;
    }

    @Override
    public java.util.List<Distribution> getDistribution() throws TException {
        List<Distribution> list = new ArrayList<Distribution>();

        String query = "select * from distribution";
        sendSelectRequest(query);
        try {
            while (rs.next()) {
                int code = rs.getInt("code");
                int codeCabinet = rs.getInt("codeCabinet");
                int codeEquipment = rs.getInt("codeEquipment");
                int number = rs.getInt("number");
                String date = rs.getString("date");

                list.add(new Distribution(code, codeCabinet, codeEquipment, number, date));
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeConnection();
        }

        return list;
    }

    @Override
    public java.util.List<Writeoff> getWriteoff() throws TException {
        List<Writeoff> list = new ArrayList<Writeoff>();

        String query = "select * from writeoff";
        sendSelectRequest(query);
        try {
            while (rs.next()) {
                int code = rs.getInt("code");
                int codeCabinet = rs.getInt("codeCabinet");
                int codeEquipment = rs.getInt("codeEquipment");
                int number = rs.getInt("number");
                String date = rs.getString("date");
                String cause = rs.getString("cause");

                list.add(new Writeoff(code, codeCabinet, codeEquipment, number, date, cause));
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeConnection();
        }


        return list;
    }

    @Override
    public void addEquipment(Equipment equipment) throws TException {
    }

    @Override
    public void addCabinet(Cabinet cabinet) throws TException {
    }

    @Override
    public void addResponsible(Responsible responsible) throws TException {
    }

    @Override
    public void addDistribution(Distribution distribution) throws TException {
    }

    @Override
    public void addWriteoff(Writeoff writeoff) throws TException {
    }

    @Override
    public void delEquipment(Equipment equipment) throws TException {
    }

    @Override
    public void delCabinet(Cabinet cabinet) throws TException {
    }

    @Override
    public void delResponsible(Responsible responsible) throws TException {
    }

    @Override
    public void delDistribution(Distribution distribution) throws TException {
    }

    @Override
    public void delWriteoff(Writeoff writeoff) throws TException {
    }

    @Override
    public void editEquipment(Equipment equipment) throws TException {
    }

    @Override
    public void editCabinet(Cabinet cabinet) throws TException {
    }

    @Override
    public void editResponsible(Responsible responsible) throws TException {
    }

    @Override
    public void editDistribution(Distribution distribution) throws TException {
    }

    @Override
    public void editWriteoff(Writeoff writeoff) throws TException {
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

    private void sendRequest(String query) {
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            stmt.executeQuery(query);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            closeConnection();
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
