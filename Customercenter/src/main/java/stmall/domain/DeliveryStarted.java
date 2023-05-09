package stmall.domain;

import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String deloveryId;
    private String productId;
    private Long orderId;
    private Integer qty;
    private String productName;
    private String status;
}
