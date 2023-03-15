package com.elvan.bank.repository;

import com.elvan.bank.model.Cities;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CitiesRepository extends CrudRepository<Cities, Long> {
}
