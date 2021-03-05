

package com.example.estore.repository;

        import com.example.estore.entity.order_details;
        import org.springframework.data.jpa.repository.JpaRepository;

        import javax.persistence.EntityManager;
        import javax.persistence.PersistenceContext;

public interface orderDetailsRepository extends JpaRepository<order_details, Integer> {



}
