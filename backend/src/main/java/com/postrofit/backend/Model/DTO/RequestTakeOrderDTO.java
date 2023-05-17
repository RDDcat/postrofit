package com.postrofit.backend.Model.DTO;

import com.postrofit.backend.Model.DAO.OrderDAO;
import com.postrofit.backend.Model.DAO.UserDAO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestTakeOrderDTO {
    long orderId;
    long userId;

    public RequestTakeOrderDTO(OrderDAO orderDAO, UserDAO userDAO) {
        this.orderId = orderDAO.getOrderId();
        this.userId = userDAO.getUserId();

    }
}
