error id: file://<WORKSPACE>/src/main/scala/test.scala:[528..528) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/test.scala", "import mypkg._

object TestMain extends App {
    val service1 = new ServiceImportante("uno")
    (1 to 3) foreach (i => println(s"Result: ${service1.work(i)}"))

    val service2 = new ServiceImportante("dos") with StdoutLogging {
        override def work(i: Int): Int = {
            info(s"Starting Work: i = $i")
            val result = super.work(i)
            info(s"Ending Work: i = $i")
            result
        }
    }
    (1 to 3) foreach (i => println(s"Result: ${service2.work(i)}"))
}

object ")
file://<WORKSPACE>/src/main/scala/test.scala
file://<WORKSPACE>/src/main/scala/test.scala:18: error: expected identifier; obtained eof
object 
       ^
#### Short summary: 

expected identifier; obtained eof