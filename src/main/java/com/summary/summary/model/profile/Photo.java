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
@Table(name = "photo")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "photo_id")
    private long id;
    @Column(name = "photo")
    private String photo;
}
