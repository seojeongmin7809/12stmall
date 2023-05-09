package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String deloveryId;
    private String productId;
    private Long orderId;
    private Integer qty;
    private String productName;
    private String status;
}