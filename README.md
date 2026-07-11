# leo

To add `leo` to a robot project:
1. In the `build.gradle` file, add this `repositories` section *after* the plugins section:
```groovy
repositories {
    maven { url "https://jitpack.io" }
}
```
2. In the `dependencies` section, add this `implementation` line:
```groovy
    implementation 'com.github.frc538:leo:TAG'
```
Where `TAG` is the version of the library to include in your project.

Make sure the vendor dependency versions in your project match those in the version you're trying to use. For this version of the library, those are:
- REVLib 2026.0.5
