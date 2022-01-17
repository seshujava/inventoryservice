package in.cognitivzen.inventoryservice.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.cognitivzen.inventoryservice.entity.ItemsSupplied;

@Repository
public interface ItemsSuppliedRepo extends JpaRepository<ItemsSupplied,Serializable>{
	/* @Query(value = "SELECT in.cognitivzen.inventoryservice.binding.ItemsSuppliedResponce(s.supplier_name, i.item_name, sd.quantity, sd.price) FROM building.items_supplied sd \r\n"
			+ "Left join items i ON sd.item_id=i.item_id\r\n"
			+ "Left join suppliers s ON sd.supplier_id=s.supplier_id where sd.item_id=:item", 
			  nativeQuery = true) */
	/*
	 * @Query("SELECT in.cognitivzen.inventoryservice.binding.ItemsSuppliedResponce(s.supplierName, i.itemName, sd.quantity, sd.price) FROM ItemsSupplied sd \r\n"
	 * + "Left join Items i ON sd.itemId=i.itemId")
	 */
    List<ItemsSupplied> findByItemId(Integer item);
}
