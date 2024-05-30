package org.example.service.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class BeanInfo {
    private String name;
    private String brand;
    private Address address;
}
