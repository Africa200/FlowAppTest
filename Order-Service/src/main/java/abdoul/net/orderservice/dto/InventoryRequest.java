package abdoul.net.orderservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoryRequest {
    private String productName;
    private Integer quantity;
}
