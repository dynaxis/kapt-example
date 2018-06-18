package kaptexample.app

import kaptexample.annotation.Interesting

@Interesting
class Main {
    /**
     * 한글.
     */
    @Interesting
    fun hello() {
        println("The compiler should have told you I am interesting")
    }
}
