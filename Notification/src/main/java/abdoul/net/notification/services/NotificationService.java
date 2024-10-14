package abdoul.net.notification.services;

import abdoul.net.notification.event.OrderPlaceEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationService {
    private EmailService emailService;

    @KafkaListener(topics = "order-place",groupId = "Notification")
    public void listen(OrderPlaceEvent placeEvent) {

        log.info("Order place event received: {}", placeEvent);
        log.info("Sending email to: {}", placeEvent.getEmail());
        //customer message
//        String message = String.format("Order placed successfully. Your order number is %s", placeEvent.getOrdernumber());
//        emailService.sendEmail(placeEvent.getEmail(), "Order placed", message);
        log.info("email sending process {}",placeEvent.getEmail());
    }
}
