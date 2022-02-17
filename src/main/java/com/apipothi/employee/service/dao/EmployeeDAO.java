package com.apipothi.employee.service.dao;

import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
import org.springframework.stereotype.Repository;

import com.apipothi.employee.model.EmployeeDetalis;

@Repository
public class EmployeeDAO extends SimpleMongoRepository<EmployeeDetalis, Integer> {

}
