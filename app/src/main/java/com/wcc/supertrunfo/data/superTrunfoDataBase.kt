package com.wcc.supertrunfo.data

import com.wcc.supertrunfo.entities.Driver
import com.wcc.supertrunfo.entities.Vehicule


class SuperTrunfoDatabase {

    fun getAllVehicles(): List<Vehicule> {
        val vehicleOne = Vehicule(
            100,
            120,
            5,
            120,
            2,
            "sedã",
            5,
            "car"
        )

        val vehicleTwo = Vehicule(
            50,
            60,
            2,
            10,
            0,
            "regular",
            7,
            "bike"
        )

        val vehicleThree = Vehicule(
            170,
            40,
            2,
            70,
            0,
            "adventure",
            6,
            "motorcycle"
        )

        val vehicleFour = Vehicule(
            130,
            170,
            4,
            110,
            2,
            "hatch",
            5,
            "car"
        )

        val vehicleFive = Vehicule(
            30,
            240,
            1,
            13,
            0,
            "regular",
            4,
            "bike"
        )

        return listOf(vehicleOne, vehicleTwo, vehicleThree, vehicleFour, vehicleFive)
    }

    fun getAllDrivers(): List<Driver> {
        val driverOne = Driver(
            40,
            60,
            10,
            2,
            10,
            0,
            3,
            4
        )

        val driverTwo = Driver(
            90,
            10,
            30,
            30,
            0,
            0,
            2,
            7
        )

        val driverThree = Driver(
            50,
            30,
            80,
            3,
            7,
            15,
            6,
            2
        )

        return listOf(driverOne, driverTwo, driverThree)
    }


}