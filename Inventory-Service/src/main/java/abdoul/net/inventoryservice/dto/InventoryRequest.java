package abdoul.net.inventoryservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoryRequest {
    private String productName;
    private Integer quantity;
}
