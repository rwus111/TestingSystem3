package com.vti.testing.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserDTO {
    private int id;
    private String username;
    @JsonProperty("addresses")
    private List<UserAddressDTO> userAddresses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<UserAddressDTO> getUserAddresses() {
        return userAddresses;
    }

    public void setUserAddresses(List<UserAddressDTO> userAddresses) {
        this.userAddresses = userAddresses;
    }

    public static class UserAddressDTO{
        @JsonProperty("street")
        private String addressStreet;
        @JsonProperty("city")
        private String addressCity;

        public String getAddressStreet() {
            return addressStreet;
        }

        public void setAddressStreet(String addressStreet) {
            this.addressStreet = addressStreet;
        }

        public String getAddressCity() {
            return addressCity;
        }

        public void setAddressCity(String addressCity) {
            this.addressCity = addressCity;
        }
    }
}
