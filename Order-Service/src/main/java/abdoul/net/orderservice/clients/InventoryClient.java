package abdoul.net.orderservice.clients;


import abdoul.net.orderservice.dto.InventoryRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "inventory", url = "http://localhost:8082")
public interface InventoryClient {
    @PostMapping(value = "/api/inventory")
    boolean isinStock(@RequestBody InventoryRequest inventoryRequest);
}
