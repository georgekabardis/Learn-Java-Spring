package com.oss.webbackend.controller;

import com.oss.webbackend.dto.ItemDto;
import com.oss.webbackend.model.Items;
import com.oss.webbackend.service.ItemSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.rmi.ServerException;
import java.util.Optional;


@RestController
public class ItemController {

    @Autowired
    ItemSevice itemSevice;

    @GetMapping("/item/{itemVal}")
    @ResponseBody
    public ItemDto itemById(@PathVariable String itemVal) {
        ItemDto item = itemSevice.getItemById(itemVal);
        return item;
    }


    @PutMapping("/item/{id}/update")
    public ResponseEntity<Items> updateItem(@PathVariable String id, @RequestBody ItemDto requestDto) throws ServerException {
        Items item = itemSevice.getItemById02(id);
        item.setDescr(requestDto.getDescr());
        Items itemRes = itemSevice.saveItem(item);
        if(itemRes == null)
            throw new ServerException("Item description not updated!");
        else
            return new ResponseEntity<>(itemRes, HttpStatus.GONE);
    }


}
