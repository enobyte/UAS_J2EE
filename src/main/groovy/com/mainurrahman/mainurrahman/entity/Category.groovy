package com.mainurrahman.mainurrahman.entity


import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table
import javax.persistence.GenerationType
import javax.persistence.Temporal
import javax.persistence.TemporalType
import javax.validation.constraints.NotNull
import javax.persistence.Column

@Entity
@Table(name = "categories")
class Category {

    public Category() {}

    Category(String kd_kategori) {
        this.kd_kategori = kd_kategori
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id

    @NotNull
    @Column(nullable = false)
    String kd_kategori

    @NotNull
    @Column(nullable = false)
    String nama

    @NotNull
    @Column()
    String keterangan

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_at")
    Date create_at

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_at")
    Date update_at
}