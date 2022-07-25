package sule.projects.houseWorkersSystem.modal;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;  //help to make class to be in different type of stream

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(name = "username")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "status")
    private String status;
    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "Url")
    private String imageUrl;
}