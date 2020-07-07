package com.rober.restapi.web

import com.rober.restapi.utils.Constants
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
//@RequestMapping(Constants.URL_BASE_HOME)
class HomeController {

    @GetMapping("", "/", "/home")
    fun load(): String{
        return "Hello, if you want to check out the api endpoint for persosn go to <br><br> localhost:8080${Constants.URL_BASE_PERSONS} </br></br>"
    }
}