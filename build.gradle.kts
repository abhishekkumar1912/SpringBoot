plugins {
    id("java")
    application  // Add the application plugin
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") // For JSON conversion    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

// ✅ Add this section to define the main class in the JAR manifest
application {
    mainClass.set("org.example.Main")  // Replace with your actual main class
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.Main"  // Ensure the JAR is runnable
    }
}

tasks.test {
    useJUnitPlatform()
}
