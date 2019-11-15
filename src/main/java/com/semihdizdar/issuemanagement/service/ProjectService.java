package com.semihdizdar.issuemanagement.service;

import com.semihdizdar.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {



    Project save(Project project);

    List<Project> getByProjectCode(String projectCode);
    List<Project> getByProjectCodeContains(String projectCode);
    Project getById(Long Id);
    Page<Project> getAllPageable(Pageable pageable);
    Boolean delete(Project project);
}
