package org.example.dao;


import org.example.model.Data;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class JdbcDataDao implements DataDao{


    @Override
    public List<Data> findall() {
        return null;
    }
}
