package com.arfront.designpattern.principle.compositionaggregation;


public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
