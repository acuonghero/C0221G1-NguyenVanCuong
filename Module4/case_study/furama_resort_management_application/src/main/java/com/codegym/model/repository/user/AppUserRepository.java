package com.codegym.model.repository.user;

import com.codegym.model.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Long> {

    AppUser findByUserName(String   userName);

}