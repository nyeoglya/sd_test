for (i <- Seq(1,2,3,4)) {
    i match {
        case _: Int if i%2==0 => println("Even")
        case _: Int => println("Odd")
    }
}