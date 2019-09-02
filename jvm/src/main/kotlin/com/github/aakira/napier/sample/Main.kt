package com.github.aakira.napier.sample

import com.github.aakira.napier.DebugAntilog
import com.github.aakira.napier.Napier
import com.github.aakira.napier.mppsample.Sample
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {
    Napier.base(DebugAntilog())

    val sample = Sample()
    sample.hello()

    GlobalScope.launch {
        sample.suspendHello()
    }

    sample.handleError()

    Thread.sleep(5000)
}
