package in.cognitivzen.inventoryservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Suppliers {
    @Id
    @GeneratedValue
    private Integer supplierId;
    private String supplierName;
    private String address;   
}
