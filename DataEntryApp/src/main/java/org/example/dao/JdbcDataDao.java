package org.example.dao;


import org.example.model.Data;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class JdbcDataDao implements DataDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcDataDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Data> findall() {
        List<Data> users = new ArrayList<>();
        String sql = "SELECT * from user_data";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()){
            Data user = mapRowToUser(results);
            users.add(user);
        }
        return users;
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
