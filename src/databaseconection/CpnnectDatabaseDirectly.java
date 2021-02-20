package databaseconection;


import java.sql.*;
import java.util.ArrayList;

public class CpnnectDatabaseDirectly {


    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/practice_java?serverTimezone=UTC";
        String userName = "root";
        String password = "Lisa1995";

        Connection connection = null;
        Statement statement = null;


        Movie gravity = new Movie(3, "Gravity", "ScienceFiction");
        Movie whiteHouse = new Movie(4, "WhiteHouse", "Fiction");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(gravity);
        movies.add(whiteHouse);

        try {


            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();

            for (Movie mv : movies) {
                String query = "insert into movie (id,name,Genre)" + "values(" + mv.getId() + ",'" + mv.getName() + "',+'" + mv.getGenre() + "')";
                statement.execute(query);
            }


        } catch (SQLException sq) {
            sq.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }
    }
}






