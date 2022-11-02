package com.oss.webbackend.service;

import com.oss.webbackend.dto.ItemDto;
import com.oss.webbackend.mapper.ItemMapper;
import com.oss.webbackend.model.Items;
import com.oss.webbackend.model.ItemsKey;
import com.oss.webbackend.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Service
public class ItemSevice {

    @Autowired
    ItemsRepository itemRepo;

    @Autowired
    ItemMapper itemMapper;

    @PersistenceContext
    private EntityManager em;

    public Optional<Items> getItemById01(String itemStr){

        ItemsKey key = new ItemsKey();
        key.setItem(itemStr);
        key.setBook(1);
        key.setItty("1");
        return itemRepo.findById(key);

    }

    public Items getItemById02(String itemVal){
        return itemRepo.findItemById02(itemVal);
    }



    public ItemDto getItemById(String itemStr){
        ItemDto item = null;

//        ItemsKey key = new ItemsKey();
//        key.setItem(itemStr);
//        key.setBook(1);
//        key.setItty("1");
//
//        CatEjbConnectionBridge connectionBridge = new CatEjbConnectionBridge();
//        connectionBridge.setConnection(em);
//
//        try {
//            item = itemMapper.itemsToItemsDto(LcItems.ItemsSelect(connectionBridge, key, false));
//        } catch (CatException e) {
//            throw new RuntimeException(e);
//        }

        return item;
    }

    public Items saveItem(Items it){
        return itemRepo.save(it);
    }

//    public static Items ItemsSelect(CatEjbConnection connection, ItemsKey key,
//                                    boolean doDetatch)
}
