package com.semihdizdar.issuemanagement.repo;

import com.semihdizdar.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueeRepository extends JpaRepository<Issue, Long> {

    

}
