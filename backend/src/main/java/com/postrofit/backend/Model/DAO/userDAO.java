package com.postrofit.backend.Model.DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class userDAO {

    @Id @GeneratedValue
    private long userId;
}
