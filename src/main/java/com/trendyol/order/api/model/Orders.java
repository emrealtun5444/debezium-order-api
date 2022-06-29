
package com.trendyol.order.api.model;

import com.trendyol.order.api.common.model.AbstractEntity;
import com.trendyol.order.api.dto.OrderUpdateStateDto;
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

    public void update(OrderUpdateStateDto orderDto) {
        setStatus(orderDto.getStatus());
    }


}
