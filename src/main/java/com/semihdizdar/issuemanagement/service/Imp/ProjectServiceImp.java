package com.semihdizdar.issuemanagement.service.Imp;

import com.semihdizdar.issuemanagement.entity.Project;
import com.semihdizdar.issuemanagement.repo.ProjectRepository;
import com.semihdizdar.issuemanagement.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImp implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImp(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project save(Project project) {

        /*
            if(project.getProjectCode == null){
               throw new IllegalArgumentException("Project cannot be null");
            }

         */

        project = projectRepository.save(project);
        return project;
    }

    @Override
    public Project getById(Long Id) {
        return projectRepository.getOne(Id);
    }

    @Override
    public List<Project> getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return projectRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }
}
