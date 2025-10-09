## Copilot Instructions for AI Coding Agents

### Project Overview
This is a simple Java project with two main source files:
- `HelloWorld.java`: Basic hello world program.
- `Variaveis.java`: Demonstrates variable declaration and printing in Java.

### Directory Structure
- `lib/`: Contains external dependencies. Currently includes `junit-platform-console-standalone-1.13.0-M3.jar` for running JUnit tests.
- `.github/`: Contains this instructions file.

### Build & Run Workflow
**Compile:**
```powershell
javac HelloWorld.java Variaveis.java
```
**Run:**
```powershell
java HelloWorld
java Variaveis
```
**Test (JUnit):**
No test files are present yet, but to run tests, use:
```powershell
java -jar lib/junit-platform-console-standalone-1.13.0-M3.jar --class-path . --scan-class-path
```

### Conventions & Patterns
- All source files are in the project root (no `src/` folder).
- Class names use PascalCase and match their filenames.
- Main methods are used for entry points.
- External libraries are placed in `lib/` and referenced directly in commands.

### Integration Points
- JUnit is available for future test development. Place test classes in the root or organize as needed.

### Example: Adding a New Class
1. Create `NewClass.java` in the root.
2. Compile with `javac NewClass.java`.
3. Run with `java NewClass`.

### Recommendations for AI Agents
- Follow the existing pattern for class and file naming.
- Update this file if new workflows, dependencies, or conventions are introduced.
- Reference the `lib/` folder for any external dependencies.

---
If any section is unclear or incomplete, please provide feedback for improvement.
