package com.semihdizdar.issuemanagement.service;

import com.semihdizdar.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User save(User user);
    User getById(Long Id);
    Page<UserService> getAllPageable(Pageable pageable);
    User getByUserName(String username);
    Boolean delete(User user);

}
