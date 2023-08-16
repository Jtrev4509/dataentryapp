package org.example.controller;

import org.example.dao.DataDao;
import org.example.model.Data;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class DataController {

    private final DataDao dataDao;

    public DataController(DataDao dataDao) {
        this.dataDao = dataDao;
    }

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List<Data> listAllData () { return dataDao.findall();}
}
