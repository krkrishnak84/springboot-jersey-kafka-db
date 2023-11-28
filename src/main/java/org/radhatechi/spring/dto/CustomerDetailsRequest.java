package org.radhatechi.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetailsRequest{

    private String firstName;

    private String lastName;

    private String gender;

    private String email;
    private Long phoneNum;

    private AddressInfo address;

}
