case class Address(street: String, city: String, country: String)
case class Person(name: String, age: Int)

val as = Seq(
    Address("1", "Anytown", "USA"),
    Address("2", "Othertown", "USA")
)

val ps = Seq(
    Person("Alice", 29),
    Person("Clo", 28)
)

val pas = ps zip as

// baaaad
pas map { tup =>
    val Person(name, age) = tup._1
    val Address(street, city, country) = tup._2
    s"$name (age: $age) lives at $street, $city, in $country"
}

// gooood
pas map {
    case (Person(name, age), Address(street, city, country)) =>
    s"$name (age: $age) lives at $street, $city, in $country"
}

