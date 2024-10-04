package abdoul.net.orderservice.event;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class OrderPlaceEvent {
    private String ordernumber;
    private String email;
}
