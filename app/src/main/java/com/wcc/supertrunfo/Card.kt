package com.wcc.supertrunfo

class Card (
    val vehicule: Vehicule,
    val driver: Driver,
    val player: Player

){

    val label: String = "Card ${player.name}"
    val maxVelocity = setMaxVelocity()
    val accelerationTime = setAccelerationTime()
    val passengers = setPassengers()

    private  fun setAccelerationTime(): Int {
        TODO("not yet implemented")

    }

    private  fun setMaxVelocity(): Int{
        TODO("not yet implemented")
    }

    private  fun setPassengers(): Int {
        return vehicule.passengers * (1 + driver.defensiveDriving)
    }

}