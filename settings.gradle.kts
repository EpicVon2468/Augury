pluginManagement {
	repositories {
		maven {
			name = "Fabric"
			// Importing doesn't work.  Trust me, I tried.
			url = java.net.URI("https://maven.fabricmc.net")
		}
		mavenCentral()
		gradlePluginPortal()
	}
}

rootProject.name = "Augury"