package ra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.model.Customer;
@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

}
