
package com.trendyol.order.api.model;

import com.trendyol.order.api.common.model.AbstractEntity;
import com.trendyol.order.api.dto.OrderDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Orders extends AbstractEntity {

    private String userName;

    private String sellerName;

    private String status;

    private String category;

    private String productCode;

    private String productName;

    private Long quantity;

    private Double price;

    public void update(OrderDto orderDto) {
        setUserName(orderDto.getUserName());
        setSellerName(orderDto.getSellerName());
        setStatus(orderDto.getStatus());
        setCategory(orderDto.getCategory());
        setProductCode(orderDto.getProductCode());
        setProductName(orderDto.getProductName());
        setQuantity(orderDto.getQuantity());
        setPrice(orderDto.getPrice());
    }


}
