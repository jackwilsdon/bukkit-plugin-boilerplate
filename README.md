# Bukkit Plugin Boilerplate
This boilerplate provides all of the basics to get your plugin up and running in the shortest amount of time possible.

## Customizing
The name, description and version of the plugin can be found in [`gradle.properties`](gradle.properties).

### Changing the package
To change the package of your plugin from `com.example.boilerplate`, follow these steps;
 1. Rename the package directories `com/example/boilerplate` in [`src/main/kotlin`](src/main/kotlin) to your new package.
 2. Update any `package` lines in your plugin's source.
 3. Update [`src/main/resources/plugin.yml`](src/main/resources/plugin.yml) with the new package.

## Building
### Building on Windows
 1. Open a command prompt in the boilerplate folder and run `gradlew build`.

### Building on MacOS or Linux
 2. Open a terminal in the boilerplate folder and run `gradlew build`.
