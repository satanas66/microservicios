package academy.digitallab.store.shopping.client;

import academy.digitallab.store.shopping.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="service-customer", fallback = CustomerHystrixFallbacFactory.class)
//@RequestMapping("/customers")
public interface CustomerClient {

    @GetMapping(value = "/customers/{id}")
    ResponseEntity<Customer> getCustomer(@PathVariable("id") long id);
}
