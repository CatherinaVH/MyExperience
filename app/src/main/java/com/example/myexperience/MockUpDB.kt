package com.example.myexperience

class MockUpDB {

    fun getGebruiker(): Gebruiker {

        return Gebruiker("Catherina", "Van Hauwermeiren", "08/01/1986", "Oudenaarde"
        , "TSO Boekhouden-Informatica")

    }

    fun getWerkervaring1() : werkErvaring {

        return werkErvaring("01/01/2022", "31/01/2022", "KBO Nederename", "opvang")

    }

    fun getWerkervaring2() : werkErvaring {

        return werkErvaring("01/01/2021", "31/01/2021", "KBO Ename", "opvang")

    }

    fun getWerkervaring3() : werkErvaring {

        return werkErvaring("01/01/2020", "31/01/2020", "KBO Volkegem", "opvang")

    }

    fun getWerkervaring4() : werkErvaring {

        return werkErvaring("01/01/2019", "31/01/2019", "KBO Mater", "opvang")

    }
}