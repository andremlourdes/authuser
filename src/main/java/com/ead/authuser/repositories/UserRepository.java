package com.ead.authuser.repositories;

import com.ead.authuser.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {

    Boolean existsByUserName(String username);
    Boolean existsByEmail(String email);

    void delete(UserModel userModel);

    UserModel save(UserModel userModels);

    List<UserModel> findAll();
}