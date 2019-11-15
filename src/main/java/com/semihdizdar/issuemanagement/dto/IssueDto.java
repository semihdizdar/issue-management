package com.semihdizdar.issuemanagement.dto;
import com.semihdizdar.issuemanagement.entity.IssueStatus;
import lombok.Data;

import java.util.Date;


@Data
public class IssueDto {

    private long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto userDto;
    private ProjectDto projectDto;

}
