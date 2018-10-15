import com.beust.kobalt.plugin.application.application
import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.project
// /home/david/git/kobalt-kotlintest/kobalt/src/Build.kt


val p = project {
    name = "kobalt-kotlintest"
    group = "com.example"
    artifactId = name
    version = "0.1"

    dependencies {
//        compile("com.beust:jcommander:1.68")
        compile("org.jetbrains.kotlin:kotlin-runtime:1.2.70")
        compile("org.jetbrains.kotlin:kotlin-stdlib:1.2.70")
    }

    dependenciesTest {
        compile("org.testng:testng:6.11")
//        compile("io.kotlintest:kotlintest:2.0.7")
        compile("io.kotlintest:kotlintest-runner-junit5:3.1.10")

    }

    assemble {
        jar {
        }
    }

    application {
        mainClass = "com.example.MainKt"
    }
}