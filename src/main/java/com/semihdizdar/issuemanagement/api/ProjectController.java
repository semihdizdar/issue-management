package com.semihdizdar.issuemanagement.api;


import com.semihdizdar.issuemanagement.dto.ProjectDto;
import com.semihdizdar.issuemanagement.service.Imp.ProjectServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/project")
public class ProjectController {

    private final ProjectServiceImp projectServiceImp;

    public ProjectController(ProjectServiceImp projectServiceImp) {
        this.projectServiceImp = projectServiceImp;
    }


    @GetMapping("/{id}")
    public ResponseEntity<ProjectDto> getById(@PathVariable("id") Long id) {

        ProjectDto projectDto = projectServiceImp.getById(id);
        return ResponseEntity.ok(projectDto);

    }


    @PostMapping
    public ResponseEntity<ProjectDto> createProject(@Valid @RequestBody ProjectDto project) {

        return ResponseEntity.ok(projectServiceImp.save(project));
    }


    @PutMapping("/{id}")
    public ResponseEntity<ProjectDto> updateProject(@PathVariable(value = "id", required = true) Long id, @RequestBody ProjectDto project) {


        return ResponseEntity.ok(projectServiceImp.update(id, project));

    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteProject(@PathVariable(value = "id" , required = true) Long id){

        return ResponseEntity.ok(projectServiceImp.delete(id));
    }


}
