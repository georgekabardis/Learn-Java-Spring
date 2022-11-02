package com.oss.webbackend.repository;

import com.oss.webbackend.model.Items;
import com.oss.webbackend.model.ItemsKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface ItemsRepository extends JpaRepository<Items, ItemsKey> {

    @Query(value = "SELECT * FROM Items i WHERE i.book = 1 AND i.itty = 1 AND i.item = ?1", nativeQuery = true)
    Items findItemById02(String itemVal);
}