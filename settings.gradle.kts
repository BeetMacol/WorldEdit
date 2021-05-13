rootProject.name = "worldedit"

include("worldedit-libs")

listOf("core", "fabric").forEach {
    include("worldedit-libs:$it")
    include("worldedit-$it")
}
include("worldedit-libs:core:ap")

