package org.radhatechi.spring.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AddressInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String street;
    private String state;
    private String city;
    private Integer zip;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public AddressInfo(String street, String state, String city, Integer zip) {
        this.street = street;
        this.state = state;
        this.city = city;
        this.zip = zip;
    }

}
