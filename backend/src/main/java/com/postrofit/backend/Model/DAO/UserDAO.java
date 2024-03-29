package com.postrofit.backend.Model.DAO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDAO {

    @Id
    private long userId;
    String userName;
}
