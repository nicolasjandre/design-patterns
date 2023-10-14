package com.designpatterns.designpatterns.repository;

import com.designpatterns.designpatterns.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
}
