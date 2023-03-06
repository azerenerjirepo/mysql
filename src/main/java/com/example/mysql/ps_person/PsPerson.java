package com.example.mysql.ps_person;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ps_person")
public class PsPerson {
  @Id
    private int ID;
    private String name;
    private String surname;
    private String midname;
    private char gender;
    private String birth_date;
    private String birth_place;
    private String marital_status;
    private String birth_city;
    private String birth_country;
    private String marriage_date;
    private String marriage_document_no;
    private char foreigner;
    private String citizenship;












}
