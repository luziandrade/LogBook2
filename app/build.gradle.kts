/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.0/samples
 */

import org.gradle.api.tasks.testing.logging.TestLogEvent


description = """
Example Graddle project demonstrating the Gradle build for a Java Application
Project name: ${project.name}
"""

plugins{
    //Apply the application plugin java applications
    application 
}

repositories{
    // Use Maven repository to get the libs
    mavenCentral()
}

dependencies{
    // Specify the TestNG framework
    testImplementation("org.testng:testng:7.4.0")

    // The dependency also uses the google guava library
    implementation("com.google.guava:guava:30.0-jre")

}

application{
    //Define the main class for the application
    mainClass.set("GenericList.App")
}


tasks.test{
    // Use TestNG for unit tests
    useTestNG()
}


tasks {
    test {        
        testLogging.events = setOf(TestLogEvent.FAILED, TestLogEvent.PASSED, TestLogEvent.SKIPPED)
    }
}

tasks.register("hello"){
    doLast {
        println("Hello Gradle")
    }
}