package com.vti.testing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable // class có thể kết hợp các thuộc tính làm 1 khoá
public class UserAddressId {
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Column(name = "address_id", nullable = false)
    private int addressId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
}
