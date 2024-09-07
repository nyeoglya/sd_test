val langs = Seq(("Scala1", "Martin1", "Odersky1"),
("Scala2", "Martin2", "Odersky2"),
("Scala3", "Martin3", "Odersky3"))

for (tuple <- langs) {
    tuple match {
        case ("Scala1",_,_) => println("Found Scala1")
        case (lang,first,last) => println(s"Found Others, $lang,$first,$last")
    }
}
