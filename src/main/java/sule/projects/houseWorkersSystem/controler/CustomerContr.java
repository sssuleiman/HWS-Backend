//package sule.projects.houseWorkersSystem.controler;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import sule.projects.houseWorkersSystem.modal.Customer;
//import sule.projects.houseWorkersSystem.service.CustomerService;
//
//import java.util.List;
//
//
//@RestController
//@RequestMapping("/customer")
//public class CustomerContr {
//
//    private final CustomerService customerService;
//
//    public CustomerContr(CustomerService customerService) {
//        this.customerService = customerService;
//    }
//
//    @GetMapping("/all")
//    public ResponseEntity<List<Customer>> getAllCustomers(){
//        List<Customer> customer=customerService.findAllCustomers();
//        return new ResponseEntity<>(customer, HttpStatus.OK);
//    }
//
//    @GetMapping("/find/{id}")
//    public ResponseEntity<Customer> GetCustomerById(@PathVariable("id") Long id){
//        Customer customer=customerService.findCustomerById (id);
//        return new ResponseEntity<>(customer, HttpStatus.OK);
//    }
//    @PostMapping("/add")
//    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
//        Customer newCustomer = customerService.addCustomer(customer);
//        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/update")
//    public ResponseEntity<Customer> updateCustomer (@RequestBody Customer customer){
//        Customer updateCustomer = customerService.updateCustomer(customer);
//        return new ResponseEntity<>(updateCustomer, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deleteCustomer (@PathVariable("id") Long id){
//        customerService.deleteCustomer(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//}
