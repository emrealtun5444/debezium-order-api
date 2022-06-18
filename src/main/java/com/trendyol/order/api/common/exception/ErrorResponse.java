package com.trendyol.order.api.common.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorResponse {

    private long timestamp = System.currentTimeMillis();
    private String exception;

}
