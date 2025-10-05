plugins {
	java
	id("org.springframework.boot") version "3.5.4"
	id("io.spring.dependency-management") version "1.1.7"
	id("war")
}

group = "com.js"
version = "0.0.1-SNAPSHOT"
description = "Java-Spring Boot Project Implementing all features"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")

}

// Ensure bootJar is disabled for WAR
tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
	enabled = false
}

// Configure bootWar
tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootWar>("bootWar") {
	archiveFileName.set("java-feature.war")
}

bootRun{
   jvmArgs = listOf("-Xmx256m", "-Xms128m", "-XX:+UseG1GC", "-Dserver.tomcat.max-threads=10")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
