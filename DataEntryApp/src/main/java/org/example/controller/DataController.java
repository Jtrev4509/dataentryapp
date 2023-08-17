package org.example.controller;

import org.example.dao.DataDao;
import org.example.model.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@CrossOrigin
public class DataController {

    private final DataDao dataDao;

    public DataController(DataDao dataDao) {
        this.dataDao = dataDao;
    }

    @RequestMapping(path = "/usersList", method = RequestMethod.GET)
    public List<Data> listAllData () { return dataDao.findall();}

    @RequestMapping(path = "/usersList", method = RequestMethod.POST)
    public void createUserData(@RequestBody Data data) {
        dataDao.createDataEntry(data.getName(), data.getAge(), data.getTitle(), data.getHometown());
    }
    }

