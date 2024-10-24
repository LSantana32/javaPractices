import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
    /*
    * Hago la conexion con la base de datos
    * Creo la sentencia
    * Ejecuto la query
    * Recorro el resultado con next pro
    * */

        try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost/hello_mysql", "root", "9124");
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery("SELECT user_id FROM users")) {
            while (rs.next()) {
                System.out.println(rs.getInt("user_id"));
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }}


//        Para asegurarse que el driver de JDBC está cargado

//        DriverManager.drivers().forEach(
//                driver -> System.out.println(driver.toString())
//        );
//
//        for (Driver driver : DriverManager.drivers().toList()) {
//            System.out.println(driver.toString());
//        }