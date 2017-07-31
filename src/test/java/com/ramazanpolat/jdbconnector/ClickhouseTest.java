package com.ramazanpolat.jdbconnector;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Ignore;
import org.junit.Test;

public class ClickhouseTest {

    @Test
    public void ConstructorTest1() throws SQLException{
        //JDBConnector dbcon = new JDBConnector(DBType.DB2, "192.168.101.130", "50000", "LOCALDB2", "Administrator", "qwe123");
        JDBConnector dbcon = new JDBConnector("ru.yandex.clickhouse.ClickHouseDriver","jdbc:clickhouse://192.168.101.141:8123/default");
        System.out.println("JDBConnector created.");
        Connection con = dbcon.getConnection();
        assertEquals(false, con.isClosed());
        System.out.println("connection is open.");
        con.close();
        assertEquals(true, con.isClosed());
        System.out.println("connection is closed.");
    }

    @Test
    public void getTablesTest() throws SQLException{
        JDBConnector dbcon = new JDBConnector("ru.yandex.clickhouse.ClickHouseDriver","jdbc:clickhouse://192.168.101.141:8123/default");
        System.out.println("JDBConnector created.");
    }
}
