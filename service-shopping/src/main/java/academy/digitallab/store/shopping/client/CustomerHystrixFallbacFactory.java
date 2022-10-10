package academy.digitallab.store.shopping.client;

import academy.digitallab.store.shopping.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerHystrixFallbacFactory implements CustomerClient{

    /**
     * Clase plan B en el caso de que el microservicio de Customer falle
     * @param id
     * @return
     */
    @Override
    public ResponseEntity<Customer> getCustomer(long id) {
        Customer customer = Customer.builder()
                .firstName("none")
                .lastName("none")
                .email("none")
                .photoUrl("none")
                .build();
        return ResponseEntity.ok(customer);
    }
}
