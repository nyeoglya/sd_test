def doSeqMatch(seq: Seq[_]) = seq match {
    case Nil => "Nil"
    case data +: _ => data match {
        case i: Int => "Int"
        case s: String => "String"
    }
}

for {
    x <- Seq(List(1,2,3,4,5),List("a","b"),List())
} x match {
    case list: List[_] => println(s"type: ${doSeqMatch(list)}")
}
