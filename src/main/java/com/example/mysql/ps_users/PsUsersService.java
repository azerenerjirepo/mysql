package com.example.mysql.ps_users;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PsUsersService {
    private final PsUsersRepo PsUsersRepo;

    public PsUsersService(PsUsersRepo ps_UsersRepo){
        this.PsUsersRepo = ps_UsersRepo;
    }



    public List<PsUsers> getAllTestTablesLimit() {
        return PsUsersRepo.findAll(PageRequest.of(0, 45, Sort.by("ID").descending())).getContent();
    }
}
