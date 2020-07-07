package com.rober.restapi.model

import java.time.LocalDate
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "person")
data class Person(
        val dni: Long = 0,
        val name: String = "",
        val surname: String = "",
        val bornDate: LocalDate? = null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0

}