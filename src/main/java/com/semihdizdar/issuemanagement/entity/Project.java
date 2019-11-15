package com.semihdizdar.issuemanagement.entity;


import lombok.*;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;

@Entity
@Table(name = "project")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project extends  BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "project_Code", length = 30)
    private String projectCode;

    @Column(name="project_name", length = 300)
    private String projectName;

    @JoinColumn(name = "manager_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User manager;





}
