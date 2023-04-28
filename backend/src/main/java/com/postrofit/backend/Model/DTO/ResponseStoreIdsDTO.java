package com.postrofit.backend.Model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class ResponseStoreIdsDTO {
    List<Long> storeIds;
}
