plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "polocloud-addons"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include("api")
include("hub")
include("notify")
include("nrc")
include("placeholder")
include("proxy")
include("servermobs")
include("signs:signs-bukkit")
include("signs:signs-fabric")
include("signs:signs-java-abstraction")
include("signs:signs-nukkit")