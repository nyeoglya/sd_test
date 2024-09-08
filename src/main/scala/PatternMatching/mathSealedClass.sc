sealed abstract class HttpMethod() {
    val body: String
    def bodyLength = body.length
}

case class Connect(body: String) extends HttpMethod
case class Disconnect(body: String) extends HttpMethod

def handle(method: HttpMethod) = method match {
    case Connect(body) => s"connect: (length: ${method.bodyLength})"
    case Disconnect(body) => s"disconnect: (length: ${method.bodyLength})"
}

val methods = Seq(
    Connect("connect body..."),
    Disconnect("disconnect body...")
)

methods foreach (method => println(handle(method)))
