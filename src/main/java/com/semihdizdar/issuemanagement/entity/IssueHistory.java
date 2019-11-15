package com.semihdizdar.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name="issue_History")
public class IssueHistory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @JoinColumn(name = "issue_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Issue issue;



    @JoinColumn(name = "assignee_user_name")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;

}
