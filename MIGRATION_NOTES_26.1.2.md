# SecretRoutes 26.1.2 port notes

This is a first-pass source port package for Minecraft 26.1.2 Fabric.

Changes made:
- Added a `versions/26.1.2-fabric` target based on the existing `1.21.11-fabric` overrides.
- Added `26.1.2-fabric` to `settings.gradle.kts`.
- Simplified the Deftu preprocess chain to `26.1.2-fabric -> 1.21.11-fabric -> 1.21.10-fabric`.
- Added 26.1.2 Fabric dependencies in `build.gradle.kts`.
- Added a GitHub Actions workflow that builds only `:26.1.2-fabric` with Java 25 and Gradle 9.4.0.

This is not guaranteed to compile on the first run. SecretRoutes is a large multiversion mod, so the likely next step is to run GitHub Actions and fix any remaining API/dependency errors from the build log.
