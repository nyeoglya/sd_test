case class Address(street: String, city: String, country: String)
case class Person(name: String, age: Int, address: Address)

val alice = Person("Alice", 20, Address("street1", "city1", "country1"))
val bob = Person("Bob", 21, Address("street2", "city2", "country2"))
val charlie = Person("Charlie", 22, Address("street3", "city3", "country3"))

for (person <- Seq(alice, bob, charlie)) {
    person match {
        case Person("Alice", 20, Address(_, "city1", _)) => println("Hi Alice!")
        case Person(name, age, _) => println(s"name: $name, age: $age")
    }
}
