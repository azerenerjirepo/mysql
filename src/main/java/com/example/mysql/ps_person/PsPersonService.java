package com.example.mysql.ps_person;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PsPersonService {
    private final PsPersonRepo PsPersonRepo;

    public PsPersonService(PsPersonRepo psPersonRepo) {
        this.PsPersonRepo = psPersonRepo;
    }

        public List<PsPerson> getAllTestTablesLimit() {
            return PsPersonRepo.findAll(PageRequest.of(0, 55, Sort.by("ID").descending())).getContent();

    }
}