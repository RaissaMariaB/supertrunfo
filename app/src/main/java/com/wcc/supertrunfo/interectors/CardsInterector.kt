package com.wcc.supertrunfo.interactors

import com.wcc.supertrunfo.data.SuperTrunfoDatabase
import com.wcc.supertrunfo.interactors.Card

class CardsInteractor {
    private val database = SuperTrunfoDatabase()
    val cardOne: Card = generateCard()
    val cardTwo: Card = generateCard()

    private fun generateCard(): Card {
        val vehicle = database.getAllVehicles().random()
        val driver = database.getAllDrivers().random()

        return Card(vehicle, driver)
    }
}