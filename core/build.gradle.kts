plugins {
    `maven-publish`
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

dependencies {
    compileOnly(project(":api"))
//    compileOnly(project(":slimeworldmanager-api"))
    implementation("com.github.luben:zstd-jni:1.5.2-2")
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
}
