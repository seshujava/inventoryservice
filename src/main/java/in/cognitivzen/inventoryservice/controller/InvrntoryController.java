package in.cognitivzen.inventoryservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.cognitivzen.inventoryservice.constants.InventoryConstants;
import in.cognitivzen.inventoryservice.entity.Items;
import in.cognitivzen.inventoryservice.entity.ItemsSupplied;
import in.cognitivzen.inventoryservice.exceptions.MyResourceNotFoundException;
import in.cognitivzen.inventoryservice.service.ItemServiceImpl;

@RestController
public class InvrntoryController {

    @Autowired
    ItemServiceImpl itemService;

    @GetMapping("/items")
    public ResponseEntity<List<Items>> itemsList() throws MyResourceNotFoundException {
        List<Items> itemList=itemService.getAllItems();
        if (!ObjectUtils.isEmpty(itemList)) {
            return ResponseEntity.ok(itemList);
        } else {
            throw new MyResourceNotFoundException(InventoryConstants.ITEM_NOT_FOUND);
        }
    }
    
    @GetMapping("/items/{itemId}")
    public ResponseEntity<Optional<Items>> itemsList(@PathVariable Integer itemId) throws MyResourceNotFoundException {
        Optional<Items> itemList=itemService.getItemById(itemId);
            return ResponseEntity.ok(itemList);
    }

    @GetMapping("/suppliedItems/{itemName}")
    public ResponseEntity<List<ItemsSupplied>> suppliedItemsList(@PathVariable String itemName) throws MyResourceNotFoundException{
        List<ItemsSupplied> suppliedItems=itemService.getByItem(itemName);
        if (!ObjectUtils.isEmpty(suppliedItems)) {
            return ResponseEntity.ok(suppliedItems);
        } else {
            throw new MyResourceNotFoundException(InventoryConstants.SUPPLIED_ITEM_NOT_FOUND);
        }
    }
}
