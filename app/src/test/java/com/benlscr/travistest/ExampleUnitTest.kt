package com.benlscr.travistest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val mainActivity = MainActivity()

    @Test
    fun checkTheSubstrateOnWallet() {
        assertEquals(80, mainActivity.substrateOnMyWallet(20))
    }
}