package com.vti.testing.service;

import com.vti.testing.entity.Address;

import java.util.List;

public interface IAddressService {
    List<Address> getAllAddresses();
    Address getAddressById(int id);
}
