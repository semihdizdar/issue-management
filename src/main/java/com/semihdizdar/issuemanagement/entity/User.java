package com.semihdizdar.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Semih DİZDAR on 6.11.2019

 **/


@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class User extends BaseEntity {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Getter
    @Setter
    @Column(name="uname", length = 200, unique = true)
    private String userName;

    @Getter
    @Setter
    @Column(name = "pwd", length = 200)
    private String password;

    @Getter
    @Setter
    @Column(name = "name_surname", length = 200)
    private String nameSurname;

    @Getter
    @Setter
    @Column(name="email", length = 200)
    private String email;

    @Getter
    @Setter
    @JoinColumn(name = "assignee_user_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Issue> issues;

}
