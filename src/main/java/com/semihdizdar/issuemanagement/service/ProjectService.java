package com.semihdizdar.issuemanagement.service;

import com.semihdizdar.issuemanagement.dto.ProjectDto;
import com.semihdizdar.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {



    ProjectDto save(ProjectDto project);

    Project getByProjectCode(String projectCode);
    Project getByProjectCodeContains(String projectCode);
    ProjectDto getById(Long Id);
    Page<Project> getAllPageable(Pageable pageable);
    ProjectDto update(Long id, ProjectDto project);
    Boolean delete(Project project);
}
