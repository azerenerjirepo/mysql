package com.example.mysql;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testtable")
public class TestTableResource {

    private final TestTableService testTableService;

    public TestTableResource(TestTableService testTableService)
    {
        this.testTableService = testTableService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<TestTable>> getAllTestTables(){
        List<TestTable> testTables = testTableService.getAllTestTablesWithLimit();
        return new ResponseEntity<>(testTables, HttpStatus.OK);

    }
}
