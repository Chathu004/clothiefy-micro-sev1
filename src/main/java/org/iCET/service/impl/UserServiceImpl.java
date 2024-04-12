package org.iCET.service.impl;

import lombok.RequiredArgsConstructor;
import org.iCET.dto.User;
import org.iCET.entity.UserEntity;
import org.iCET.repository.UserRepository;
import org.iCET.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    final ModelMapper mapper;

    @Override
    public void addUser(User user) {
        UserEntity entity = mapper.map(user,UserEntity.class);
        repository.save(entity);
    }

    @Override
    public boolean deleteUser(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<UserEntity> getUser() {
        return (List<UserEntity>) repository.findAll();
    }
}
