package com.oss.webbackend.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ItemDto implements Serializable {
    private final Integer idBook;
    private final String idItty;
    private final String idItem;
    private final String descr;
    private final Long itemId;
}
