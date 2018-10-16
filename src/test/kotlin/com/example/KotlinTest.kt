package com.example

import io.kotlintest.specs.BehaviorSpec
//import io.kotlintest.matchers.numerics.shouldBeEven
//import io.kotlintest.matchers.numerics.shouldBeOdd

/**
 * Created by David Sowerby on 15 Oct 2018
 */
class KotlinTest : BehaviorSpec() {
    init {
        Given("We want to try KotlinTest") {
            When("We test something that is correct") {
                Then("it should pass") {
                    42.shouldBeEven()
                }
            }
            When("We test something which is incorrect") {
                Then("it should fail") {
                    42.shouldBeOdd()
                }
            }
        }
    }
}