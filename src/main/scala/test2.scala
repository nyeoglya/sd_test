package mypkg

trait Logging {
    def info(message: String): Unit
    def warning(message: String): Unit
    def error(message: String): Unit
}

trait StdoutLogging extends Logging {
    def info(message: String) = println(s"INFO: $message")
    def warning(message: String) = println(s"WARNING: $message")
    def error(message: String) = println(s"ERROR: $message")
}

class ServiceImportante(name: String) {
	def work(i: Int): Int = {
		println(s"ServiceImportante: Doing Important Work! $i")
		i + 1
	}
}
