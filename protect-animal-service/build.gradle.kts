apply(plugin= "kotlin-jpa")

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation("org.mariadb.jdbc:mysql-java-client")
    implementation("org.projectlombok:lombok:1.18.22")

    runtimeOnly("com.mysql:mysql-connector-j")

    //spring batch
    implementation ("org.springframework.boot:spring-boot-starter-batch:3.0.4")

    testImplementation ("org.springframework.batch:spring-batch-test")
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
