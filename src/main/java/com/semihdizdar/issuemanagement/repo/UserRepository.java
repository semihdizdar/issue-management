package com.semihdizdar.issuemanagement.repo;

import com.semihdizdar.issuemanagement.entity.Project;
import com.semihdizdar.issuemanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String username);
}
