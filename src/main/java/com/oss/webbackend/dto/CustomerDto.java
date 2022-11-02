package com.oss.webbackend.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CustomerDto implements Serializable {

    private Long id;
    private Short book;
    private String cust;
    private String type;
    private String name;
    private String odos;
    private String arit;
    private String city;
    private String afm;
    private String fax;

}
