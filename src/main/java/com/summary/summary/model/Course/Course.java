package com.summary.summary.model.Course;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private Long id;
    @Column(name = "course_name")
    private String course_name;
    @Column(name = "course_level")
    private String course_level;
    @Column(name = "data_begin")
    private LocalDateTime data_begin;
    @Column(name = "expiration_date")
    private LocalDateTime expiration_date;
}
