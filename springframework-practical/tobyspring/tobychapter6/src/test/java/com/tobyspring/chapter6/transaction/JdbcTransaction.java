package com.tobyspring.chapter6.transaction;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcTransaction {

    @Test
    public void 일반적인_DRIVER로_직접_가져오는_방법() throws SQLException {
//        Driver load = new Driver();
//        Connection connect = load.connect("", null);
//        Statement statement = connect.createStatement();
//        statement.execute("insert into person value(이름, 나이)");
//        statement.close();
//        connect.commit();
    }

}
