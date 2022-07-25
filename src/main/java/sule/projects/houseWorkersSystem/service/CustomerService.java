//package sule.projects.houseWorkersSystem.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import sule.projects.houseWorkersSystem.exception.UserNotFoundException;
//import sule.projects.houseWorkersSystem.modal.Customer;
//import sule.projects.houseWorkersSystem.repository.CustomerRepo;
//
//import java.util.List;
//
//public class CustomerService {
//    private final CustomerRepo customerRepo;
//
//    @Autowired
//    public CustomerService(CustomerRepo customerRepo) {
//        this.customerRepo = customerRepo;
//    }
//
//    public Customer addCustomer(Customer customer){
////        customer.setCustomerCode (UUID.randomUUID().toString());
//        return customerRepo.save(customer);
//    }
//
//    public List<Customer> findAllCustomers(){
//        return customerRepo.findAll();
//    }
//
//    public Customer updateCustomer(Customer customer){
//        return customerRepo.save(customer);
//    }
//
//    public Customer findCustomerById(Long id){
////        return customerRepo.findById(id).orElseThrow(() -> new NoSuchElementException("user with id = " + id + "not present"));
//        return customerRepo.findCustomerById(id).orElseThrow(() -> new UserNotFoundException("user with id = " + id + "not present"));
//    }
//
//    public void deleteCustomer(Long id){
//        customerRepo.deleteById(id);
//    }
//}
