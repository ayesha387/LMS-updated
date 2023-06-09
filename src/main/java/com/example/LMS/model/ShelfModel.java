package com.example.LMS.model;

import com.example.LMS.entity.Shelf;
import lombok.Data;
import org.springframework.stereotype.Component;
@Component
@Data
public class ShelfModel {
    private Long id;
    private String name;
    public Shelf disassemble(){
        Shelf shelf = new Shelf();
        shelf.setId(this.id);
        shelf.setName(this.name);
        return shelf;
    }
    public ShelfModel assemble(Shelf shelf) {
        ShelfModel shelfModel = new ShelfModel();
        shelfModel.setId(shelf.getId());
        shelfModel.setName(shelf.getName());
        return shelfModel;
    }
}
