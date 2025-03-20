package com.vti.testing.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AddressDTO {
    private int id;
    private String street;
    private String city;
    @JsonProperty("users")
    private List<UserAddressDTO> userAddresses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<UserAddressDTO> getUserAddresses() {
        return userAddresses;
    }

    public void setUserAddresses(List<UserAddressDTO> userAddresses) {
        this.userAddresses = userAddresses;
    }

    public static class UserAddressDTO{
        @JsonProperty("id")
        private int userId;
        @JsonProperty("username")
        private String userUsername;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUserUsername() {
            return userUsername;
        }

        public void setUserUsername(String userUsername) {
            this.userUsername = userUsername;
        }
    }
}
