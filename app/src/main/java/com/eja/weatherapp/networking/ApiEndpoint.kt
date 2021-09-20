package com.eja.weatherapp.networking

object ApiEndpoint {
    var BASEURL = "http://api.openweathermap.org/data/2.5/"
    var CurrentWeather = "weather?"
    var ListWeather = "forecast?"
    var Daily = "forecast/daily?"
    var UnitsAppid = "&units=metric&appid=fe133da2f7811cc7443d892bf44aea5d"
    var UnitsAppidDaily = "&units=metric&cnt=15&appid=fe133da2f7811cc7443d892bf44aea5d"
}