package com.example.mysql;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TestTableRepo  extends JpaRepository<TestTable, Long> {

}
