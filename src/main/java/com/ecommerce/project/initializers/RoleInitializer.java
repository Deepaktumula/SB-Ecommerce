package com.ecommerce.project.initializers;

import com.ecommerce.project.model.AppRole;
import com.ecommerce.project.model.Role;
import com.ecommerce.project.repositories.RoleRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleInitializer {

    @Autowired
    private RoleRepository roleRepository;

    @PostConstruct
    public void init() {
        if (!roleRepository.existsByRoleName(AppRole.ROLE_USER)) {
            Role role = new Role();
            role.setRoleName(AppRole.ROLE_USER);
            roleRepository.save(role);
        }

        if (!roleRepository.existsByRoleName(AppRole.ROLE_ADMIN)) {
            Role role = new Role();
            role.setRoleName(AppRole.ROLE_ADMIN);
            roleRepository.save(role);
        }

        if (!roleRepository.existsByRoleName(AppRole.ROLE_SELLER)) {
            Role role = new Role();
            role.setRoleName(AppRole.ROLE_SELLER);
            roleRepository.save(role);
        }
    }
}

