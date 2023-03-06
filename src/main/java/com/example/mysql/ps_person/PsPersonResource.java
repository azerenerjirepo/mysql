package com.example.mysql.ps_person;


import  org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/erppro")
public class PsPersonResource {

    private final PsPersonService psPersonService;

    public PsPersonResource(PsPersonService pspersonService){
        this.psPersonService = pspersonService;

    }

    @GetMapping("/ps_person")
    public ResponseEntity <List<PsPerson>>PsPersonTables(){

    List<PsPerson> pspersaon =psPersonService.getAllTestTablesLimit();
        return new ResponseEntity<>(pspersaon, HttpStatus.OK);
   }
}