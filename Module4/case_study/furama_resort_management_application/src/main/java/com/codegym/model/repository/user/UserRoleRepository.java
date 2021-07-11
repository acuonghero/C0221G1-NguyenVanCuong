package com.codegym.model.repository.user;

import com.codegym.model.entity.AppUser;
import com.codegym.model.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    List<UserRole>  findByAppUser(AppUser appUser);
}
