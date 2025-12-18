import java.net.URI

plugins {
	alias(libs.plugins.kotlin.jvm)
	alias(libs.plugins.fabric.loom)
}

group = "io.github.epicvon2468.augury"
version = "1.0.0"

repositories {
	mavenCentral()
	maven { url = URI("https://maven.terraformersmc.com/releases") }
	maven { url = URI("https://api.modrinth.com/maven") }
}

dependencies {
	minecraft(libs.minecraft)
	mappings(libs.yarn)

	modImplementation(libs.fabric.loader)
	modImplementation(libs.fabric.api)
	modImplementation(libs.fabric.kotlin)

	modImplementation(libs.koala)

	modRuntimeOnly(libs.modmenu)
}

tasks.withType<JavaExec> {
	jvmArgs("--enable-native-access=ALL-UNNAMED")
	jvmArgs("-XX:+UseCompactObjectHeaders")
}

tasks.withType(ProcessResources::class) {
	inputs.property("version", project.version)

	filesMatching("fabric.mod.json") {
		expand(inputs.properties)
	}
}

kotlin {
	jvmToolchain(17)
}