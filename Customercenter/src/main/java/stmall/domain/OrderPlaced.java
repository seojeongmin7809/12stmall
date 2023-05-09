package stmall.domain;

import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String orderId;
    private Long productId;
    private Long userId;
    private String productName;
    private Integer qty;
    private String status;
}
