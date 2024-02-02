package useDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB {

    private final String driver = "org.h2.Driver";
    private final String url = "jdbc:h2:file:~/innova_java_se";
    private final String username = "sa";
    private final String password = "sa";

    private Connection conn = null;

    public Connection connect() {
        try {
            if (conn == null) {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
                createTable();
            }
        }catch (Exception ex) {
            System.err.println("DB Connection Error: " + ex);
        }
        return conn;
    }

    private void createTable() {
        try {
            String customerSql = "create table if not exists customer\n" +
                    "(\n" +
                    "    cid      INTEGER auto_increment,\n" +
                    "    name     varchar(255),\n" +
                    "    email    varchar(255),\n" +
                    "    password varchar(255),\n" +
                    "    constraint customer_pk\n" +
                    "        primary key (cid)\n" +
                    ");";
            Statement statement = conn.createStatement();
            statement.execute(customerSql);
        }catch (Exception ex) {
            System.err.println("createTable error: " + ex);
        }
    }

    public void close() {
        try {
            if ( conn != null && !conn.isClosed() ) {
                conn.close();
            }
        }catch (Exception ex) {
            System.err.println("Close Error: " + ex);
        }
    }

}
