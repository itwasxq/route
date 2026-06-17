plugins {
    id("dev.deftu.gradle.multiversion-root")
}

preprocess {
    "26.1.2-fabric"(26_01_02, "srg") {
        "1.21.11-fabric"(1_21_11, "srg") {
            "1.21.10-fabric"(1_21_10, "yarn")
        }
    }

    strictExtraMappings.set(false)
}
