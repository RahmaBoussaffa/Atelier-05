package com.rahma.users.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rahma.users.entities.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);
}