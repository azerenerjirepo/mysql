package com.example.mysql.ps_users;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/erppro")
public class PsUsersResource {

    private final PsUsersService ps_usersService;

    public PsUsersResource(PsUsersService ps_usersService){
        this.ps_usersService = ps_usersService;
    }

    @GetMapping("/ps_users")
    public ResponseEntity<List<PsUsers>> getAllPs_UsersTables() {
        List<PsUsers> ps_users = ps_usersService.getAllTestTablesLimit();
        return new ResponseEntity<>(ps_users, HttpStatus.OK);


    }
}