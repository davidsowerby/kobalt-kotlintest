package com.example

import io.kotlintest.specs.BehaviorSpec

/**
 * Created by David Sowerby on 15 Oct 2018
 */
class KotlinTest : BehaviorSpec() {

    init {
        Given("We want to try KotlinTest") {
            When("We test something") {
                Then("it should work") {
                    assert(42 > 41)
                }
            }
        }
    }
}