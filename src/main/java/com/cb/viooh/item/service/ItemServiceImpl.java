package com.cb.viooh.item.service;

import com.cb.viooh.item.entity.Item;
import com.cb.viooh.item.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    ItemRepository itemRepository;
    @Override
    public List<Item> getAllArticles() {
        return itemRepository.findAll();
    }
}
