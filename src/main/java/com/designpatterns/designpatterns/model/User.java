package com.designpatterns.designpatterns.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_cd_id")
    private Long id;

    @Column(name = "usr_tx_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "usr_fk_address")
    private Address address;
}
