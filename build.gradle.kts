plugins {
    id("java")
}

tasks.withType<Jar>() {
    manifest {
        attributes["Main-Class"] = "n2ex1.App"
    }
}

/*

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

 */