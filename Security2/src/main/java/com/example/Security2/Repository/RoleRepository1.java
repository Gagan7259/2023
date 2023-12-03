package com.example.Security2.Repository;

import com.example.Security2.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository1 extends JpaRepository<Role, Long> {
    Role findByName(String role);
}
