apply(plugin= "kotlin-jpa")

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.mariadb.jdbc:mariadb-java-client:3.1.2")
    //spring batch
    implementation("org.springframework.boot:spring-boot-starter-batch")
    implementation("org.projectlombok:lombok:1.18.22")
}

sourceSets {
    getByName("main").resources {
        srcDir("src/main/resources")
    }
}

tasks {
    val processResources by getting(Copy::class) {
        from("src/main/resources")
        into("build/resources/main")
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
    }
}