package com.vti.testing.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
public class UserAddress {
    @EmbeddedId // đánh dấu khoá kết hợp
    private UserAddressId id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    @MapsId("userId")
    private User user;
    @ManyToOne
    @JoinColumn(name = "address_id")
    @MapsId("addressId")
    private Address address;
    @Column(name = "registered_at")
    @Temporal(TemporalType.TIMESTAMP) // DATETIME
    @CreationTimestamp // DEFAULT NOW()
    private Date registeredAt;

    public UserAddressId getId() {
        return id;
    }

    public void setId(UserAddressId id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Date registeredAt) {
        this.registeredAt = registeredAt;
    }
}
