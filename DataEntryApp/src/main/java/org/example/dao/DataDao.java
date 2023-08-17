package org.example.dao;

import org.example.model.Data;

import java.util.List;

public interface DataDao {

    List<Data> findall();

    void createDataEntry(String username, int age, String title, String hometown);
}
