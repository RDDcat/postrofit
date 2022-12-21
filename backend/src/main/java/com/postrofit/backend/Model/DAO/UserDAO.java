package com.postrofit.backend.Model.DAO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
@AllArgsConstructor
@NoArgsConstructor
public class UserDAO {

    @Id @GeneratedValue
    private long userId;
    String userName;
}
