package com.summary.summary.model;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "site")
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "site_id")
    private Long id;

    @Column(name = "site_name")
    private String siteName;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User users;
}
