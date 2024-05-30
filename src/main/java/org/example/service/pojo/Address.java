package org.example.service.pojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String city;
    private String province;
    private String country;
}
