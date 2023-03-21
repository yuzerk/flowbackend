package com.flower.xin.common.param;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderParam {
    private Long id;

    private List<Long> shoppingCartIds;

    private Long shippingOrderId;

    private Long userId;

    private String userName;

    private String userPhone;

    private String customerName;

    private String customerPhone;

    private String customerAddress;

    private Long bossId;

    private Float commodityPrice;

    private Float price;

    private Long userCouponId;

    private Integer status;

    private String payOrder;

    private Integer paySuccess;

    private Integer shippingStatus;

    private Integer orderType;

    private Integer deliveryType;

    private Date payExpireAt;

    private Date customerDeliveryAt;
}
