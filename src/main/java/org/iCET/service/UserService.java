package org.iCET.service;

import org.iCET.dto.User;
import org.iCET.entity.UserEntity;

import java.util.List;

public interface UserService {
    void addUser(User user);
    boolean deleteUser(Long id);
    List<UserEntity> getUser();

}
