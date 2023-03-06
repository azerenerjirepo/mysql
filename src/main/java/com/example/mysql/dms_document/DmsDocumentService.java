package com.example.mysql.dms_document;

import com.example.mysql.employee.Employee;
import com.example.mysql.employee.EmployeeRepo;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DmsDocumentService {
    private final DmsDocumentrRepo dmsDocumentrRepo;

    public DmsDocumentService(DmsDocumentrRepo dmsDocumentrRepo) {
        this.dmsDocumentrRepo = dmsDocumentrRepo;
    }


    public List<DmsDocuments> getAllTestTablesWithLimit() {
        return dmsDocumentrRepo.findAll(PageRequest.of(0, 50, Sort.by("ID").descending())).getContent();

    }
}