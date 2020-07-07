package com.rober.restapi

import com.rober.restapi.business.PersonBusiness
import com.rober.restapi.dao.PersonRepository
import com.rober.restapi.model.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@SpringBootApplication
class RestapiApplication: CommandLineRunner{

	//Insert a person as a example
	@Autowired
	val personRepository: PersonRepository? = null

	override fun run(vararg args: String?) {
		val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
		val person = Person(10101010, "rober", "coding with mysql as a database management", LocalDate.parse("01-01-1901", formatter))

		personRepository!!.save(person)
	}
}

fun main(args: Array<String>) {
	runApplication<RestapiApplication>(*args)
}
