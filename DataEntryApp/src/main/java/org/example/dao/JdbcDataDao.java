package org.example.dao;


import org.example.model.Data;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcDataDao implements DataDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcDataDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Data> findall() {
        List<Data> users = new ArrayList<>();
        String sql = "SELECT user_name, user_age, user_title, user_hometown from user_data";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()){
            Data user = mapRowToUser(results);
            users.add(user);
        }
        return users;
    }

    @Override
    public void createDataEntry(String username, int age, String title, String hometown){
        String sql = "INSERT INTO user_data (user_name, user_age, user_title, user_hometown) " +
                "VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, username, age, title, hometown);
    }



    private Data mapRowToUser(SqlRowSet rs) {
        Data user = new Data();
        user.setName(rs.getString("user_name"));
        user.setAge(rs.getInt("user_age"));
        user.setTitle(rs.getString("user_title"));
        user.setHometown(rs.getString("user_hometown"));
        return user;
    }
}
