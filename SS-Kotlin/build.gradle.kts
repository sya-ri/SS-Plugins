val project = Project.Kotlin
group = project.group

dependencies {
    shadowImplementation(kotlin("stdlib-jdk8"))
}

bukkit {
    name = project.name
    version = project.version
    main = project.main
    author = project.author
    apiVersion = project.apiVersion
    depend = project.allDependPlugin
    softDepend = project.allSoftDependPlugin
    commands {
        register("ss-kotlin") {
            description = "Display Kotlin Version & Package"
        }
    }
}
