package com.trendyol.order.api.service;

import com.trendyol.order.api.common.exception.BusinessException;
import com.trendyol.order.api.dto.OrderDto;
import com.trendyol.order.api.model.Orders;
import com.trendyol.order.api.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    @Transactional
    public void saveOrder(OrderDto orderDto) {

        var order = Orders.builder()
                .category(orderDto.getCategory())
                .price(orderDto.getPrice())
                .productCode(orderDto.getProductCode())
                .productName(orderDto.getProductName())
                .quantity(orderDto.getQuantity())
                .sellerName(orderDto.getSellerName())
                .status(orderDto.getStatus())
                .userName(orderDto.getUserName())
                .build();

        orderRepository.save(order);

    }

    @Transactional
    public void updateOrderStatus(Long orderId, OrderDto orderDto) {
        var orderOptional = orderRepository.findById(orderId);
        if (orderOptional.isEmpty()) {
            throw new BusinessException("Order not found");
        }

        var order = orderOptional.get();
        order.update(orderDto);
        orderRepository.save(order);
    }


}
