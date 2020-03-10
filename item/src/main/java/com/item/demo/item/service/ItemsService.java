package com.item.demo.item.service;

import com.item.demo.item.exception.ResourceNotFoundException;
import com.item.demo.item.model.Items;
import com.item.demo.item.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ItemsService {
    @Autowired
    ItemsRepository itemsRepository;

    public List<Items> getAllItems() {
        return itemsRepository.findAll();
    }

    public Items getItemById(Long id) throws ResourceNotFoundException {
        Items items = itemsRepository.findById(id).get();
        return items;
    }


    public HttpStatus createItems(Items items) {
        itemsRepository.save(items);
        return HttpStatus.OK;
    }


    public Items updateItemms(Long id, Items item) {
        Items items = itemsRepository.findById(id).get();
        items.setPrice(item.getPrice());
        items.setName(item.getName());
        Items updatedItems = itemsRepository.save(items);
        return updatedItems;
    }

    public HttpStatus deleteItems(Long id) throws ResourceNotFoundException {
        Items items = itemsRepository.findById(id).get();
        if (items != null) {
            itemsRepository.delete(items);
            return HttpStatus.OK;
        } else {
            throw new ResourceNotFoundException("Items", "id", id);
        }
    }

}
