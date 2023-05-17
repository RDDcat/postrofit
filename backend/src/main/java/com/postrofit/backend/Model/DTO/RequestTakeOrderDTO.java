package com.postrofit.backend.Model.DTO;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import lombok.Data;

@Data
public class RequestTakeOrderDTO {
    long orderId;
    long userId;

    public RequestTakeOrderDTO(OrderDAO orderDAO, UserDAO userDAO) {
        this.orderId = orderDAO.getOrderId();
        this.userId = userDAO.getUserId();

    }
}
