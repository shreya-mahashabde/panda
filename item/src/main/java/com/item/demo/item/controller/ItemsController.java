package com.item.demo.item.controller;


import com.item.demo.item.exception.ResourceNotFoundException;
import com.item.demo.item.model.Items;
import com.item.demo.item.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import java.util.List;

@RestController
public class ItemsController {
    @Autowired
    ItemsService itemsService;

    @GetMapping("/item")
    public ResponseEntity<List<Items>> getItems() {
        List<Items> list = itemsService.getAllItems();
        return new ResponseEntity<List<Items>>(list, HttpStatus.OK);
    }

    @GetMapping("/item/{id}")
    public ResponseEntity<Items> itemsById(@PathVariable("id") Long id) throws ResourceNotFoundException {
        Items items = itemsService.getItemById(id);
        return new ResponseEntity<Items>(items, HttpStatus.OK);
    }

    @PostMapping(value = "/item/create")
    public HttpStatus createItems(@RequestBody Items items) throws ResourceNotFoundException {
        itemsService.createItems(items);
        return HttpStatus.OK;
    }

    @PutMapping("/item/create/{id}")
    public ResponseEntity<Items> updateItems(@PathVariable(value = "id") Long id, @RequestBody Items items)
            throws ResourceNotFoundException {
        Items updated = itemsService.updateItemms(id, items);
        return new ResponseEntity<Items>(updated, HttpStatus.OK);
    }

    @DeleteMapping("/item/{id}")
    public HttpStatus deleteItemsById(@PathVariable("id") Long id)
            throws ResourceNotFoundException {
        itemsService.deleteItems(id);
        return HttpStatus.OK;
    }


}
