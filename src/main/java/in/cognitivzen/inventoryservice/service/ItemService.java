package in.cognitivzen.inventoryservice.service;

import java.util.List;

import in.cognitivzen.inventoryservice.entity.Items;
import in.cognitivzen.inventoryservice.entity.ItemsSupplied;

public interface ItemService {
    List<Items> getAllItems();
    List<ItemsSupplied> getByItem(String item);
}
