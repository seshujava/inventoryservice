package in.cognitivzen.inventoryservice.repository;

import in.cognitivzen.inventoryservice.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ItemRepo extends JpaRepository<Items,Serializable> {
    Items findByItemName(String item);
}
