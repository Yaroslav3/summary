package com.summary.summary.model.profile;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "site")
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "site_id")
    private long id;
    @Column(name = "site")
    private String site;
}
