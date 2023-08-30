package com.study.orderservice.dto;

import lombok.Builder;
import lombok.Data;


/* 실제 디비에 저장될 값 */
@Data
@Builder
public class Payload {

    private String order_id;
    private String user_id;
    private String product_id;
    private int qty;
    private int unit_price;
    private int total_price;

}
