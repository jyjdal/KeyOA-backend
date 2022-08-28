/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    java
    `maven-publish`
    id("org.springframework.boot") version "2.7.3"
}

apply(plugin = "io.spring.dependency-management")

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    // Spring projects
    // Starters
    implementation("org.springframework.boot:spring-boot-starter-web:2.7.3")
    implementation("org.springframework.boot:spring-boot-starter-validation:2.7.3")
    implementation("org.springframework.boot:spring-boot-starter-aop:2.7.3")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.3")
    implementation("org.springframework.boot:spring-boot-starter-data-redis:2.7.3")
    implementation("org.springframework.boot:spring-boot-starter-security:2.7.3")
    implementation("org.springframework.boot:spring-boot-starter-actuator:2.7.3")
    // Starters - test
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.7.3")
    // Other spring dependencies
    implementation("org.springframework.boot:spring-boot-configuration-processor:2.7.3")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor:2.7.3")
    runtimeOnly("org.springframework.boot:spring-boot-devtools:2.7.3")

    // Development tools
    // Lombok
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    testCompileOnly("org.projectlombok:lombok:1.18.24")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.24")
    // Guava and Apache commons
    implementation("com.google.guava:guava:31.1-jre")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("org.apache.commons:commons-pool2:2.11.1")
    // Jwt dependency
    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.11.5")
    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.11.5")

    // Drivers and Data access
    runtimeOnly("mysql:mysql-connector-java:8.0.30")
    implementation("com.alibaba:druid-spring-boot-starter:1.2.11")
    implementation("io.jsonwebtoken:jjwt-api:0.11.5")

    // Jaxb
    implementation("javax.xml.bind:jaxb-api:2.4.0-b180830.0359")
    implementation("org.glassfish.jaxb:jaxb-runtime:4.0.0")
}

group = "com.key"
version = "0.0.1-SNAPSHOT"
description = "KeyOA-backend"
java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.test {
    useJUnitPlatform()
}

buildscript { repositories { mavenCentral() } }

springBoot {
    mainClass.set("com.key.oa.KeyOaBackendApplication")
}
