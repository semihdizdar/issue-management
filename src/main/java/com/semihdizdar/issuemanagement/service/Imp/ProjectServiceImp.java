package com.semihdizdar.issuemanagement.service.Imp;

import com.semihdizdar.issuemanagement.dto.ProjectDto;
import com.semihdizdar.issuemanagement.entity.Project;
import com.semihdizdar.issuemanagement.repo.ProjectRepository;
import com.semihdizdar.issuemanagement.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImp implements ProjectService {

    private final ProjectRepository projectRepository;
    private final ModelMapper modelMapper;

    public ProjectServiceImp(ProjectRepository projectRepository, ModelMapper modelMapper) {
        this.projectRepository = projectRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public ProjectDto save(ProjectDto project) {

        Project projectCheck = projectRepository.getByProjectCode(project.getProjectCode());

        if (projectCheck != null) {
            throw new IllegalArgumentException("Project Code Already  Exist");
        }


        Project p = modelMapper.map(project, Project.class);
        projectRepository.save(p);
        project.setId(p.getId());
        return project;
    }

    @Override
    public ProjectDto getById(Long Id) {

        Project p = projectRepository.getOne(Id);
        return modelMapper.map(p, ProjectDto.class);
    }

    @Override
    public Project getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public Project getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return projectRepository.findAll(pageable);
    }

    @Override
    public ProjectDto update(Long id, ProjectDto project) {
        Project projectDb = projectRepository.getOne(id);

        if (projectDb == null) {
            throw new IllegalArgumentException("Project does not exist ID :" + id);
        }


        ProjectDto projectCheck = projectRepository.getByProjectCodeAndIdNot(project.getProjectCode(),id);

        if (projectCheck != null )
        {
            throw new IllegalArgumentException("Project Code Already Exist");
        }
        projectDb.setProjectCode(project.getProjectCode());
        projectDb.setProjectName(project.getProjectName());

        projectRepository.save(projectDb);
        return modelMapper.map(projectDb, ProjectDto.class);

    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }

    public Boolean delete(Long id){
        projectRepository.deleteById(id);
        return true;
    }
}
