for {
    x <- Seq(1,2,2.5,"one","two",Symbol("four"))
} {
    val str = x match {
        case 1 => "int 1"
        case i: Int => "a int: " + i
        case d: Double => "a double: " + x
        case "one" => "string one"
        case s: String => "other string: " + s
        case unexpected => "unexpected value: " + unexpected
    }
    println(str)
}