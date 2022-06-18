package com.trendyol.order.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private String userName;

    private String sellerName;

    private String status;

    private String category;

    private String productCode;

    private String productName;

    private Long quantity;

    private Double price;

}
