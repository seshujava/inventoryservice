package in.cognitivzen.inventoryservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class ItemsSupplied {
    @Id
    @GeneratedValue
    private Integer suppliedId;
    private Integer supplierId;
	private Integer itemId;
    private String quantity;
    private Integer price;
}
