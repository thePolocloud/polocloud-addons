repositories {
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
}

dependencies {
    implementation(libs.polocloud.sdk.java)
    compileOnly(libs.spigot)
    compileOnly(libs.placeholderapi)
    implementation(projects.api)
}

tasks.processResources {
    filesMatching("plugin.yml") {
        expand("version" to project.version)
    }
}

tasks.shadowJar {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    archiveFileName.set("polocloud-${project.name}-$version.jar")
}