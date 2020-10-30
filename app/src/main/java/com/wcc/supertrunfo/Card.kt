package com.wcc.supertrunfo

import com.wcc.supertrunfo.entities.Driver
import com.wcc.supertrunfo.entities.Player
import com.wcc.supertrunfo.entities.Vehicule

class Card (
    val vehicule: Vehicule,
    val driver: Driver,
    val player: Player

){

    val label: String = "Card ${player.name}"
    val maxVelocity = initMaxVelocity()
    val accelerationTime = setAccelerationTime()
    val passengers = initPassengers()
    val xP = initXp()

    private  fun setAccelerationTime(): Int {
        return 0

    }

    private  fun initMaxVelocity(): Int{
        return when( vehicule.type ) {
           "car" -> carMaxVelocity() // aqui vai contas quando o tipo de veículo for carro
           "motorcycle" -> motorcycleMaxVelocity()// aqui vai contas quando o tipo de veículo for moto
           else  ->  bikeMaxVelocity()// aqui vai contas quando o tipo de veículo for bike

        }
    }

    private fun bikeMaxVelocity(): Int {
        return vehicule.maxAcceleration * driver.boldness
    }

    private fun motorcycleMaxVelocity(): Int {
        return 1 / vehicule.weight * vehicule.maxAcceleration
    }

    private fun carMaxVelocity(): Int {
        return if(vehicule.style == "sedã") {
            vehicule.maxAcceleration
        } else {
            vehicule.maxAcceleration + 10
        }
    }

    private  fun initPassengers(): Int {
        return vehicule.passengers * (1 + driver.defensiveDriving)
    }

    private  fun initXp(): Int {
       return when(vehicule.type) {
           "car" -> driver.carXP
           "motorcycle" -> driver.motorcycleXP
           else -> driver.bikeXP
       }
    }



}