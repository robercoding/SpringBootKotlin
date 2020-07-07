package com.rober.restapi.business

import com.rober.restapi.model.Person

interface IPersonBusiness {

    fun list(): List<Person>

    fun load(idPerson: Long): Person

    fun save(person: Person): Person

    fun remove(idPerson: Long)
}