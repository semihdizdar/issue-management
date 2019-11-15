package com.semihdizdar.issuemanagement.service.Imp;

import com.semihdizdar.issuemanagement.entity.User;
import com.semihdizdar.issuemanagement.repo.UserRepository;
import com.semihdizdar.issuemanagement.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User save(User user) {


        return userRepository.save(user);

    }

    @Override
    public User getById(Long Id) {
        return null;
    }

    @Override
    public Page<UserService> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public User getByUserName(String username) {
        return null;
    }

    @Override
    public Boolean delete(User user) {
        return null;
    }
}
