package com.example.mysql.ps_users;
import jakarta.persistence.*;
import lombok.*;
import org.apache.el.parser.BooleanNode;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ps_users")
public class PsUsers {

    @Id
    private int ID;
    private String name;
    private int menu_id;
    private String password;
    private char locked;
    private String department_id;
    private char department_authoritative;
    private char cancelled;
    private char sends_alert;





}
