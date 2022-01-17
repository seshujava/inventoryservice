package in.cognitivzen.inventoryservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import in.cognitivzen.inventoryservice.entity.Items;
import in.cognitivzen.inventoryservice.entity.ItemsSupplied;
import in.cognitivzen.inventoryservice.exceptions.MyResourceNotFoundException;
import in.cognitivzen.inventoryservice.repository.ItemRepo;
import in.cognitivzen.inventoryservice.repository.ItemsSuppliedRepo;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	ItemRepo itemRepo;
	@Autowired
	ItemsSuppliedRepo itemsSuppliedRepo;

	public List<Items> getAllItems(){
		return itemRepo.findAll();
	}

	public List<ItemsSupplied> getByItem(String item){
		Items items=itemRepo.findByItemName(item);
		if(items != null){ 
			List<ItemsSupplied> findByItemId = itemsSuppliedRepo.findByItemId(items.getItemId());
			if(!CollectionUtils.isEmpty(findByItemId)) {
				return findByItemId;
			}else {
				throw new MyResourceNotFoundException("Invalid Item");
			}
		}else {
			return null;
		}
	}

	public Optional<Items> getItemById(Integer itemId) throws RuntimeException{
		if(itemRepo.existsById(itemId)) {
			return itemRepo.findById(itemId);
		}else {
			throw new MyResourceNotFoundException("Invalid Item ID");
		}
	}

}
