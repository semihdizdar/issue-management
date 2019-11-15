package com.semihdizdar.issuemanagement.service;

import com.semihdizdar.issuemanagement.dto.IssueDto;
import com.semihdizdar.issuemanagement.entity.Issue;
import com.semihdizdar.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IssueService {

    IssueDto save(IssueDto issue);
    IssueDto getById(Long Id);
    TPage<IssueDto> getAllPageable(Pageable pageable);
    Boolean delete(IssueDto issue);


}
