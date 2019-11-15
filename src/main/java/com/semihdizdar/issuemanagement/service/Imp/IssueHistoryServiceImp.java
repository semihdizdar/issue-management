package com.semihdizdar.issuemanagement.service.Imp;

import com.semihdizdar.issuemanagement.entity.IssueHistory;
import com.semihdizdar.issuemanagement.repo.IssuesHistoryRepository;
import com.semihdizdar.issuemanagement.service.IssueHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class IssueHistoryServiceImp implements IssueHistoryService {

    private final IssuesHistoryRepository issuesHistoryRepository;

    public IssueHistoryServiceImp(IssuesHistoryRepository issuesHistoryRepository) {
        this.issuesHistoryRepository = issuesHistoryRepository;
    }

    @Override
    public IssueHistory save(IssueHistory issueHistory) {
        //Bussiness Logic

        /**
        if(issueHistory.getDate() == null){
            throw new IllegalArgumentException("Issuee cannot be null");
        }
         TODO : düzeltme yapp...getDate gelmiyor....
         **/

        issueHistory = issuesHistoryRepository.save(issueHistory);
        return issueHistory;
    }

    @Override
    public IssueHistory getById(Long Id) {
        return issuesHistoryRepository.getOne(Id);
    }

    @Override
    public Page<IssueHistory> getAllPageable(Pageable pageable) {
        return issuesHistoryRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(IssueHistory issueHistory) {
        issuesHistoryRepository.delete(issueHistory);
        return Boolean.TRUE;
    }
}
