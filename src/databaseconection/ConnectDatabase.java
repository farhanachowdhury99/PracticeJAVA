package databaseconection;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Callable;

public class ConnectDatabase {

public static Connection connection=null;
public static Statement statement=null;
public static PreparedStatement preparedStatement=null;
public static ResultSet resultSet=null;
public static String filePath="../PracticeJAVA/ExtLibrary/Properties/Secret.properties";

public static Properties loadProperties(String filePath) throws IOException {
Properties properties= new Properties();
InputStream inputStream= new FileInputStream(filePath);
properties.load(inputStream);
inputStream.close();
return properties;

}

public static Connection connectToSQLDatabase() throws ClassNotFoundException, SQLException, IOException {
    Properties prop= ConnectDatabase.loadProperties(filePath);
    String driverClass= prop.getProperty("MYSQLJDBC.driver");
    String url= prop.getProperty("MYSQLJDBC.url");
    String userName= prop.getProperty("MYSQLJDBC.userName");
    String password= prop.getProperty("MYSQLJDBC.password");
    Class.forName(driverClass);
    connection=DriverManager.getConnection(url,userName,password);
    statement=connection.createStatement();
    System.out.println("Database connected");

    return connection;
}

public static void close(){

    try{
        if(resultSet!=null){
            resultSet.close();
            System.out.println("ResultSet is close");
        }
        if(connection!=null){
            connection.close();
            System.out.println("connection is close");
        }
        if(statement!=null){
            statement.close();
            System.out.println("Statement close");
        }
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
}


public static void show(ResultSet rs) {

    try {
        while (rs.next()) {
            System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

        }
        } catch(SQLException throwables){
            throwables.printStackTrace();
        }

}

    public static List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException {
    List<String> dataList= new ArrayList<>();
    while(resultSet.next()){
        String itemName=resultSet.getString(columnName);
        dataList.add(itemName);
    }
    return dataList;
    }

    public static List<String> readDatabase(String tableName, String columnName) throws SQLException {
    List<String> data= new ArrayList<>();
    try {
        ConnectDatabase.connectToSQLDatabase();
        statement=connection.createStatement();
        resultSet=statement.executeQuery("select * from "+tableName);
        data=ConnectDatabase.getResultSetData(resultSet,columnName);

        for (String dt: data){
            System.out.println(dt+" ");
        }
    } catch (IOException e) {
        e.printStackTrace();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } finally{
        connection.close();
    }
    return data;
    }


    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        ConnectDatabase.connectToSQLDatabase();
        preparedStatement=connection.prepareStatement("Select * from movie where name='Titanic'");
        resultSet=preparedStatement.executeQuery();
        ConnectDatabase.show(resultSet);

       ConnectDatabase.readDatabase("movie","Name");



    }

}
