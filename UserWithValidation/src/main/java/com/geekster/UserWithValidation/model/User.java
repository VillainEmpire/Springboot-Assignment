package com.geekster.UserWithValidation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User_table")
public class User {
    @Id

    private Integer user_id;
    private String user_name;

    private String date_of_birth;
    private String email;
    private String phone_number;
    private Date date ;
    private Timestamp time;


}
