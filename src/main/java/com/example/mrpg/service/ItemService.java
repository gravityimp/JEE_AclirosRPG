package com.example.mrpg.service;

import com.example.mrpg.converters.ItemMapper;
import com.example.mrpg.dtos.ItemDTO;
import com.example.mrpg.model.base.Item;
import com.example.mrpg.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    public List<ItemDTO> getAllItems() {
        return itemRepository.findAllItems();
    }

    public Item getItemById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
