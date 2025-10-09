# Copilot Instructions for AI Coding Agents

## Project Overview
This is a simple Java project for learning and experimentation. The codebase consists of:
- `HelloWorld.java`: Basic entry point, prints a message to the console.
- `Variaveis.java`: Demonstrates variable usage and basic Java syntax.
- `lib/`: Contains external dependencies, currently only JUnit for testing.

## Architecture & Patterns
- No complex architecture; each `.java` file is standalone and does not import from others.
- No package structure; all classes are in the default package.
- No configuration files (e.g., `pom.xml`, `build.gradle`).

## Developer Workflows
### Build & Run
- Compile Java files using:
  ```powershell
  javac HelloWorld.java Variaveis.java
  ```
- Run a class using:
  ```powershell
  java HelloWorld
  ```

### Testing
- JUnit is available via `lib/junit-platform-console-standalone-1.13.0-M3.jar`.
- To run tests (if any are added):
  ```powershell
  java -jar lib/junit-platform-console-standalone-1.13.0-M3.jar --class-path . --scan-class-path
  ```
- No test files currently exist; add test classes in the root directory if needed.

## Conventions
- Use clear, beginner-friendly Java syntax.
- Place all source and test files in the project root.
- Reference external libraries from the `lib/` directory.

## Integration Points
- Only external dependency is JUnit (for future tests).
- No network, database, or other integrations.

## Examples
- See `HelloWorld.java` for main method and console output.
- See `Variaveis.java` for variable declaration and usage.

## Recommendations for AI Agents
- When adding new features, keep code simple and in the root directory.
- When introducing tests, use JUnit and place test files alongside source files.
- Document any new conventions or workflows in this file.

---
_Last updated: October 8, 2025_
