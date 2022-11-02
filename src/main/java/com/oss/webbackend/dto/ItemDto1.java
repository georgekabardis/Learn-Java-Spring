package com.oss.webbackend.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ItemDto1 implements Serializable {
    private final short book;
    private final String itty;
    private final String item;
    private final String descr;
    private final long item_id;
}
