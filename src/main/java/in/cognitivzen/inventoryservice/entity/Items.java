package in.cognitivzen.inventoryservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Items {
    @Id
    @GeneratedValue
    private Integer itemId;
    private String itemName;
}
