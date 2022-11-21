package com.example.myexperience

class MockUpDB {

    fun getGebruiker(): Gebruiker {

        return Gebruiker("Catherina", "Van Hauwermeiren", "08/01/1986", "Oudenaarde"
        , "TSO Boekhouden-Informatica")

    }

    fun getWerkervaring1() : WerkErvaring {

        return WerkErvaring("01/01/2022", "31/01/2022", "KBO Nederename", "opvang")

    }

    fun getWerkervaring2() : WerkErvaring {

        return WerkErvaring("01/01/2021", "31/01/2021", "KBO Ename", "opvang")

    }

    fun getWerkervaring3() : WerkErvaring {

        return WerkErvaring("01/01/2020", "31/01/2020", "KBO Volkegem", "opvang")

    }

    fun getWerkervaring4() : WerkErvaring {

        return WerkErvaring("01/01/2019", "31/01/2019", "KBO Mater", "opvang")

    }

    fun getWerkervaringen() : List<WerkErvaring>{
        val werkErvaringen = arrayOf(
            WerkErvaring("01/01/2022", "31/01/2022", "KBO Nederename", "opvang"),
            WerkErvaring("01/01/2021", "31/01/2021", "KBO Ename", "opvang"),
            WerkErvaring("01/01/2020", "31/01/2020", "KBO Volkegem", "opvang"),
            WerkErvaring("01/01/2019", "31/01/2019", "KBO Mater", "opvang"))

        return werkErvaringen.toList()
    }
}