package com.summary.summary.model.education;

import com.summary.summary.model.user.User;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "education_id")
    private Long id;

    @Column(name = "education")
    private String education;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    public User user;
}
