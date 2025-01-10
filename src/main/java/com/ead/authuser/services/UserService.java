package com.ead.authuser.services;

import com.ead.authuser.models.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<UserModel> findAll();

    <optional> optional findById(UUID userId);

    void deleteUser(UserModel userModel);

    void saveUser(UserModel userModels);

    boolean existsByUserName(String username);

    Boolean existsByEmail(String email);

    UserModel updateUser(UserModel userModel);


    Page<UserModel> findAll(Pageable pageable);
}
