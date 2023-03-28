package com.example.LMS.controller;

import com.example.LMS.model.ShelfModel;
import com.example.LMS.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ShelfController {
    @Autowired
    ShelfService shelfService;
    @PostMapping("/saveShelf")
    public ShelfModel saveShelf(@RequestBody ShelfModel shelfModel) {
        return shelfService.shelf(shelfModel);
    }

}
