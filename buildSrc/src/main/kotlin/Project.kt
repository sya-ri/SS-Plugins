interface Project {
    companion object {
        private const val group = "com.github.syari.ss.plugins"

        fun subgroup(path: String) = "$group.$path"

        fun build(number: Int) = number.toString()
    }

    val name: String
    val version: String
    val group: String
    val main: String
        get() = "$group.Main"
    val author: String
        get() = "sya_ri"
    val apiVersion: String
        get() = "1.16"
    val dependProject: List<Project>
    val dependProjectName: List<String>
        get() = dependProject.map { it.name }
    val dependPlugin: List<String>
        get() = dependProjectName + extraDependPlugin
    val extraDependPlugin: List<String>
        get() = listOf()

    object Kotlin: Project {
        override val name = "SS-Kotlin"
        override val version = "1.4.10"
        override val group = subgroup("kotlin")
        override val dependProject = listOf<Project>()
    }

    object Core: Project {
        override val name = "SS-Core"
        override val version = build(6)
        override val group = subgroup("core")
        override val dependProject = listOf(Kotlin)
    }

    object Backup: Project {
        override val name = "SS-Backup"
        override val version = build(1)
        override val group = subgroup("backup")
        override val dependProject = listOf(Core)
    }

    object Votifier: Project {
        override val name = "SS-Votifier"
        override val version = build(1)
        override val group = subgroup("votifier")
        override val dependProject = listOf(Core)
    }

    object MaterialChecker: Project {
        override val name = "SS-MaterialChecker"
        override val version = build(2)
        override val group = subgroup("materialchecker")
        override val dependProject = listOf(Core)
    }

    object SoundChecker: Project {
        override val name = "SS-SoundChecker"
        override val version = build(1)
        override val group = subgroup("soundchecker")
        override val dependProject = listOf(Core)
    }

    object Base64Converter: Dependency {
        override val name = "SS-Base64Converter"
        override val version = build(1)
        override val group = subgroup("base64converter")
        override val dependProject = listOf(Core)
    }

    object ItemCreator: Project {
        override val name = "SS-ItemCreator"
        override val version = build(1)
        override val group = subgroup("itemcreator")
        override val dependProject = listOf(Core)
    }

    object CommandBlocker: Project {
        override val name = "SS-CommandBlocker"
        override val version = build(1)
        override val group = subgroup("commandblocker")
        override val dependProject = listOf(Core)
    }

    object PluginManager: Project {
        override val name = "SS-PluginManager"
        override val version = build(1)
        override val group = subgroup("pluginmanager")
        override val dependProject = listOf(Core)
    }

    interface MA: Project {
        object Shop: MA {
            override val name = "SS-MA-Shop"
            override val version = build(2)
            override val group = subgroup("ma.shop")
            override val dependProject = listOf(Core, Dependency.CrackShot, Dependency.CrackShotPlus, Dependency.MythicMobs)
        }

        object Kit: MA {
            override val name = "SS-MA-Kit"
            override val version = build(1)
            override val group = subgroup("ma.kit")
            override val dependProject = listOf(Core, Dependency.AdvancedMobArena)
        }

        object Item: MA {
            override val name = "SS-MA-Item"
            override val version = build(2)
            override val group = subgroup("ma.item")
            override val dependProject = listOf(Core, Dependency.AdvancedMobArena)
        }

        object Mob: MA {
            override val name = "SS-MA-Mob"
            override val version = build(2)
            override val group = subgroup("ma.mob")
            override val dependProject = listOf(Core, Dependency.AdvancedMobArena, Dependency.MythicMobs)
        }
    }

    interface Dependency: Project {
        object MythicMobs: Dependency {
            override val name = "SS-Dependency-MythicMobs"
            override val version = "4.11.0-build-3527"
            override val group = subgroup("dependency.mythicmobs")
            override val dependProject = listOf(Core)
            override val extraDependPlugin = listOf("MythicMobs")
        }

        object CrackShot: Dependency {
            override val name = "SS-Dependency-CrackShot"
            override val version = "0.98.9"
            override val group = subgroup("dependency.crackshot")
            override val dependProject = listOf(Core)
            override val extraDependPlugin = listOf("CrackShot")
        }

        object CrackShotPlus: Dependency {
            override val name = "SS-Dependency-CrackShotPlus"
            override val version = "1.97"
            override val group = subgroup("dependency.crackshotplus")
            override val dependProject = listOf(Core)
            override val extraDependPlugin = listOf("CrackShotPlus")
        }

        object AdvancedMobArena: Dependency {
            override val name = "SS-Dependency-AdvancedMobArena"
            override val version = "7.22"
            override val group = subgroup("dependency.advancedmobarena")
            override val dependProject = listOf(Core)
            override val extraDependPlugin = listOf("AdvancedMobArena")
        }
    }
}