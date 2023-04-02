package com.postrofit.backend.Model.DTO;

import lombok.Data;

@Data
public class RequestHistoryDetailDTO {
    long storeId;
    long orderId;
    long deliveryId;

}
