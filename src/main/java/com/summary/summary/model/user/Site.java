package com.summary.summary.model.user;


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
@Table(name = "site")
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "site_id")
    private Long id;

    @Column(name = "sites")
    private String sites;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
