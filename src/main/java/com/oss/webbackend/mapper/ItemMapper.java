package com.oss.webbackend.mapper;

import com.oss.webbackend.dto.ItemDto;
import com.oss.webbackend.model.Items;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ItemMapper {
    @Mapping(source = "idBook", target = "id.book")
    @Mapping(source = "idItty", target = "id.itty")
    @Mapping(source = "idItem", target = "id.item")
    Items itemsDtoToItems(ItemDto itemsDto);

    @InheritInverseConfiguration(name = "itemsDtoToItems")
    ItemDto itemsToItemsDto(Items items);

    @InheritConfiguration(name = "itemsDtoToItems")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateItemsFromItemsDto(ItemDto itemsDto, @MappingTarget Items items);
}
