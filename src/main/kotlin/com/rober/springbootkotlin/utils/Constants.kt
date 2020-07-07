package com.rober.restapi.utils

class Constants {
    companion object {
        private const val URL_API_BASE = "/api"
        private const val URL_API_VERSION = "/v1"
        //Base API endpoint home
        private const val URL_BASE = URL_API_BASE + URL_API_VERSION
        //Home endpoint
        const val URL_BASE_HOME = "/home"
        //Base API endpoint for persons
        const val URL_BASE_PERSONS = "$URL_BASE/persons"
    }
}