package com.example.coroutine

import kotlinx.coroutines.*
import org.junit.Test

import org.junit.Assert.*
import java.lang.Exception

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        runBlocking {
            val job = launch(start = CoroutineStart.DEFAULT) {
                try {
                    println("start")
                    delay(500)
                    println("done")
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            yield()
            job.cancel()
        }
        Thread.sleep(1000)
    }
}