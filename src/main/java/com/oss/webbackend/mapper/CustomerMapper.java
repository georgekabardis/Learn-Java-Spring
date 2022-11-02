package com.oss.webbackend.mapper;

import com.oss.webbackend.dto.CustomerDto;
import com.oss.webbackend.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

//@org.mapstruct.Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE,
//        componentModel = "spring")
@Mapper(componentModel = "spring")

public interface CustomerMapper {
    @Mapping(target = "cmacco", source = "id")
    Customer customerDtoToCustomer(CustomerDto customerDto);
    @Mapping(target = "id", source = "cmacco")
    CustomerDto customerToCustomerDto(Customer customer);
    List<CustomerDto> toCustomerDtos(List<Customer> customers);


//    @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
//    void updateCustomerFromCustomerDto(CustomerDto customerDto,
//                                       @org.mapstruct.MappingTarget Customer customer);
}
