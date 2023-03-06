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
    private int ORGANIZATIONID;
    private int DEPARTMENTSECTIONiD;
    private int SALARYCOMMONAMOUNT;
    private int OFFICEID;
    private int TABELNO;
    private String SURNAME;
    private String FATHERNAME;
    private String BIRTHDAY;
    private String BIRTHPLACE;
    private char Gender;
    private int MARTIALSTATUS;
    private String MARTIALSTATUSNAME;
    private int PARTYAFFILIATIONID;
    private String PARTYAFFILIATIONNAME;
    private int NATIONALITYID;
    private String NATIONALITYNAME;
    private String HOMEPHONES;
    private String MOBILEPHONES;
    private String ASSIGNDATE;
    private int DERECE;
    private String PASSPORTSERIAL;
    private int PASSPORTNUMBER;
    private String PASSPORTISSUEDDATE;
    private String PASSPORTISSUEDBY;
    private int PASSPORTEXPIREDATE;
    private String REGIONNAME;
    private int REGIONID;
    private int SCIENTIFICDEGREE;
    private int ISDELETED;
    private String SOCIALCARDNUMBER;
    private String SCIENTIFICDEGREETEXT;
    private String PROFESSIONTEXT;







}
