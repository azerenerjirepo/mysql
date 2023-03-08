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

//    public DmsDocumentService(DmsDocumentrRepo dmsDocumentrRepo) {
//        this.dmsDocumentrRepo = dmsDocumentrRepo;
//    }


//    public List<DmsDocuments> getAllTestTablesWithLimit() {
//        return dmsDocumentrRepo.findAll(PageRequest.of(0, 200000, Sort.by("ID").descending())).getContent();
//
//    }


    public DmsDocumentService(DmsDocumentrRepo dmsDocumentrRepo) {
        this.dmsDocumentrRepo = dmsDocumentrRepo;
    }

    public List<DmsDocuments> getAllTestTablesWithLimit(int from, int to, String order) {

        Sort sort = Sort.by("ID").ascending();
        if ("desc".equals(order)) {
            sort = Sort.by("ID").descending();
        }
        else  if ("asc".equals(order)) {
            sort = Sort.by("ID").ascending();
        }
        return dmsDocumentrRepo.findAll(PageRequest.of(from, to, sort)).getContent();
//        return dmsDocumentrRepo.findAll(PageRequest.of(from, to, Sort.by("ID").ascending())).getContent();

    }
}