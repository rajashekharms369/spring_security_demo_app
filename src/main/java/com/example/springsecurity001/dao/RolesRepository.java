package com.example.springsecurity001.dao;

import com.example.springsecurity001.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Roles, Long> {

}
