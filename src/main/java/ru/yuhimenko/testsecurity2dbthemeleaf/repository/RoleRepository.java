package ru.yuhimenko.testsecurity2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yuhimenko.testsecurity2dbthemeleaf.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}