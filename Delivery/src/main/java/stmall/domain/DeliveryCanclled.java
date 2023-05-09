package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCanclled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String productId;
    private Integer qty;
    private String productName;
    private String status;

    public DeliveryCanclled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCanclled() {
        super();
    }
}
