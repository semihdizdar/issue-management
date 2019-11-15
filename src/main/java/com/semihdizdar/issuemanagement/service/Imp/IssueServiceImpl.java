package com.semihdizdar.issuemanagement.service.Imp;

import com.semihdizdar.issuemanagement.dto.IssueDto;
import com.semihdizdar.issuemanagement.entity.Issue;
import com.semihdizdar.issuemanagement.repo.IssueeRepository;
import com.semihdizdar.issuemanagement.service.IssueService;
import com.semihdizdar.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueeRepository issueeRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueeRepository issueeRepository, ModelMapper modelMapper) {
        this.issueeRepository = issueeRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public IssueDto save(IssueDto issue) {
        if(issue.getDate() == null){
            throw new IllegalArgumentException("Issuee Date Cannot be null");
        }

        Issue issueDb = modelMapper.map(issue, Issue.class);
        issueDb = issueeRepository.save(issueDb);
        return modelMapper.map(issueDb,IssueDto.class);
    }


    @Override
    public IssueDto getById(Long Id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {

        Page<Issue> data = issueeRepository.findAll(pageable);
        TPage page = new TPage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(data.getContent(), IssueDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}