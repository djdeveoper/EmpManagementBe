package com.dj.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dj.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long >{

}
