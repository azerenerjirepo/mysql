package com.example.mysql.dms_document;

import com.example.mysql.employee.Employee;
import com.example.mysql.employee.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/erppro")
public class DmsDocumentResource {

    private final DmsDocumentService dmsDocumentService;

    public DmsDocumentResource(DmsDocumentService dmsDocumentService) {
        this.dmsDocumentService = dmsDocumentService;
    }

    @GetMapping("/dmsdocuments")
    public ResponseEntity<List<DmsDocuments>> getAllDmsDocumentsTables() {
        List<DmsDocuments> dmsDocuments = dmsDocumentService.getAllTestTablesWithLimit();
        return new ResponseEntity<>(dmsDocuments, HttpStatus.OK);

    }
}