package com.example.mysql.employee;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private Long ID;
    private String NAME;
    private String Registratedplace;
    private String ORGANIZATIONID;
    private String DEPARTMENTSECTIONiD;
    private String SALARYCOMMONAMOUNT;
    private String OFFICEID;
    private String TABELNO;
    private String SURNAME;
    private String FATHERNAME;
    private String BIRTHDAY;
    private String BIRTHPLACE;
    private String Gender;
    private String MARTIALSTATUS;
    private String MARTIALSTATUSNAME;
    private String PARTYAFFILIATIONID;
    private String PARTYAFFILIATIONNAME;
    private String NATIONALITYID;
    private String NATIONALITYNAME;
    private String HOMEPHONES;
    private String MOBILEPHONES;
    private String ASSIGNDATE;
    private String DERECE;
    private String PASSPORTSERIAL;
    private String PASSPORTNUMBER;
    private String PASSPORTISSUEDDATE;
    private String PASSPORTISSUEDBY;
    private String PASSPORTEXPIREDATE;
    private String REGIONNAME;
    private String REGIONID;
    private String SCIENTIFICDEGREE;
    private String ISDELETED;
    private String SOCIALCARDNUMBER;
    private String SCIENTIFICDEGREETEXT;
    private String PROFESSIONTEXT;







}
