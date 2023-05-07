package com.geekster.EmployeeAddressApplication.repository;


import com.geekster.EmployeeAddressApplication.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}

