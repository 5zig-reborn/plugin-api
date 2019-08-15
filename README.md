Official client API of The 5zig Mod!
=

This is the official client API of The 5zig Mod, which can be used together with the 5zig Mod v3.6 and above.
Build your own 5zig mod plugin, drop it into .minecraft/the5zigmod/plugins and you're ready to go! Create
own module items or server handlers and listen to various mod events! Feel free to create a plugin, suggest
it as a feature to the mod author and it may be implemented in a future version of the 5zig mod.

The API gives you the perfect start into modding Minecraft and allows you to customize the 5zig mod even more!
If you have got any further suggestions, feel free to create an issue.

Getting Started
-
If you want to get started, see the examples directory, as there are multiple documented example plugins of the mod.

Dependencies
-
The mod (and this API) use the Gradle build system.

To get the library, first define a repository:
```groovy
repositories {
    maven { 
        url "https://repo.5zigreborn.eu/repository/maven-releases"
    }
}
```
Then, add the library as a dependency:
```groovy
dependencies {
    compile group: 'eu.5zigreborn', name: 'plugin-api', version: '3.12.6'
}
```
You will also need to add an `authlib` jar to your classpath. You can find it in your
`.minecraft/libraries/com/mojang/authlib/1.5.25` folder.

[Documentation](https://docs.5zigreborn.eu)
- 