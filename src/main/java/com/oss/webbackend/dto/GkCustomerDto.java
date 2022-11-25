package com.oss.webbackend.dto;


import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class GkCustomerDto implements Serializable{

    private ParamsErpAA  paramsErpAA;

    private List<CustomerDto> customerDtoList;

}
