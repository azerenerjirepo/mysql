package com.example.mysql;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestTableService {
    private final TestTableRepo testTableRepo;

    public TestTableService(TestTableRepo testTableRepo){
        this.testTableRepo = testTableRepo;
    }



    public List<TestTable> getAllTestTablesWithLimit() {
        return testTableRepo.findAll(PageRequest.of(0, 50, Sort.by("ID").descending())).getContent();
    }

}
