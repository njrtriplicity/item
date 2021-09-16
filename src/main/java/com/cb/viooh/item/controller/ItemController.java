package com.cb.viooh.item.controller;

import com.cb.viooh.item.entity.Item;
import com.cb.viooh.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping
    public ResponseEntity<List<Item>> getItems() {
        List<Item> items = itemService.getAllArticles();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
}
