package com.example.LMS.model;

import com.example.LMS.entity.Shelf;
import lombok.Data;

@Data
public class BookShelfModel {

    public Shelf disassemble(){
        Shelf shelf = new Shelf();
        return shelf;
    }
    public ShelfModel assemble(Shelf shelf) {
        ShelfModel shelfModel = new ShelfModel();
        return shelfModel;
    }
}
