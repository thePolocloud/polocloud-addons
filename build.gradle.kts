import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "2.2.21"
    id("com.gradleup.shadow") version "9.0.0"
}

group = "dev.httpmarco.polocloud"
version = "1.0-SNAPSHOT"



allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "com.gradleup.shadow")

    group = "dev.httpmarco.polocloud"
    version = "3.0.0-pre.6.2-SNAPSHOT"

    repositories {
        mavenCentral()
        maven {
            name = "polocloud-snapshots"
            url = uri("https://central.sonatype.com/repository/maven-snapshots/")
        }
    }

    tasks.withType<ShadowJar> {
        archiveFileName.set("polocloud-${project.name}-$version.jar")
    }

    kotlin {
        jvmToolchain(23)
    }
}