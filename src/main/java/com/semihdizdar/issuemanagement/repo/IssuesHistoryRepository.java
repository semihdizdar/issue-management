package com.semihdizdar.issuemanagement.repo;

import com.semihdizdar.issuemanagement.entity.IssueHistory;
import com.semihdizdar.issuemanagement.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IssuesHistoryRepository extends JpaRepository<IssueHistory,Long> {

    List<IssueHistory> getByIssueIdOrderById(Long id);
}
