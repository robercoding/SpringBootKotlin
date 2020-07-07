package com.rober.restapi.business

import com.rober.restapi.dao.PersonRepository
import com.rober.restapi.exception.BusinessException
import com.rober.restapi.exception.NotFoundException
import com.rober.restapi.model.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.Exception
import java.util.*

@Service
class PersonBusiness: IPersonBusiness {

    @Autowired
    val personRepository: PersonRepository? = null

    @Throws(BusinessException::class)
    override fun list(): List<Person> {
        try{
            return personRepository!!.findAll()
        }catch (e: Exception){
            throw BusinessException(e.message)
        }
    }

    @Throws(BusinessException::class, NotFoundException::class)
    override fun load(idPerson: Long): Person {

        val op: Optional<Person>

        try{
            op =  personRepository!!.findById(idPerson)
        }catch (e: Exception){
            throw BusinessException(e.message)
        }

        if(!op.isPresent){
            throw NotFoundException("We couldn't find the person")
        }

        return op.get()
    }

    override fun save(person: Person): Person {
        try{
            return personRepository!!.save(person)
        }catch (e: Exception){
            throw BusinessException(e.message)
        }
    }

    override fun remove(idPerson: Long) {
        val op: Optional<Person>

        try{
            op = personRepository!!.findById(idPerson)
        }catch (e:Exception){
            throw BusinessException(e.message)
        }

        if(!op.isPresent){
            throw NotFoundException("We couldn't find the person")
        }

        try{
            personRepository!!.deleteById(idPerson)
        }catch (e: Exception){
            throw BusinessException(e.message)
        }
    }
}