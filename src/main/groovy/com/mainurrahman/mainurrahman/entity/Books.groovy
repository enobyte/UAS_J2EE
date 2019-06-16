package com.mainurrahman.mainurrahman.entity

import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "books")
class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id

    @JoinColumn(name = "kd_kategori")
    String kd_kategori

    @NotNull
    @Column(nullable = false)
    String title

    @NotNull
    @Column()
    BigInteger stok

}