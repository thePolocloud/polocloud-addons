dependencies {
    compileOnly(libs.gson)

    implementation(libs.polocloud.sdk.java)
    implementation(projects.api)
    implementation(libs.bundles.nrc)
}

repositories {
    maven("https://maven.norisk.gg/repository/maven-releases/")
}

tasks.processResources {
    filesMatching(listOf("plugin.yml", "velocity-plugin.json")) {
        expand("version" to project.version)
    }
}