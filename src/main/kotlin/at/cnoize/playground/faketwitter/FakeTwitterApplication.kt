package at.cnoize.playground.faketwitter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FakeTwitterApplication

fun main(args: Array<String>) {
	runApplication<FakeTwitterApplication>(*args)
}
