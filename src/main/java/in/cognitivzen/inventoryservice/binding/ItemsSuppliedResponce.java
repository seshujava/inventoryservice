package in.cognitivzen.inventoryservice.binding;

import lombok.Data;

@Data
public class ItemsSuppliedResponce {
	private String supplierName;
	private String itemName;
	private String quantity;
	private String price;
}
