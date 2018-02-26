package com.summary.summary.model.Course;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "certificates_course")
public class CertificatesCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "certificates_id")
    private Long id;
    @Column(name = "certificates")
    private String certificates;
    @Column(name = "photo")
    private String photo;
}
