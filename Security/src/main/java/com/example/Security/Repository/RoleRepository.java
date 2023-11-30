package com.example.Security.Repository;

import com.example.Security.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String  role);
}
