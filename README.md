# Random Bar Chart (CS 370 – Lab 3)

A JavaFX application that draws a 10x10 grid filled with bars of random colors and heights. Clicking the **Redraw** button at the bottom of the window generates a new random set of bars.

## Requirements

- JDK 21 or newer, with `JAVA_HOME` set to its install folder
- Maven is **not** required to be installed; the included Maven wrapper downloads it automatically
- JavaFX 21 is downloaded automatically

## How to Run

From the project folder:

**Windows (PowerShell):**

```
.\mvnw.cmd clean javafx:run
```

**Mac/Linux:**

```
./mvnw clean javafx:run
```

The first run takes a minute while dependencies download. Warnings about `sun.misc.Unsafe` on newer JDKs are harmless.

## Project Structure

- `src/main/java/com/example/graph_app2/HelloApplication.java` – draws the grid, the bars, and the Redraw button
- `pom.xml` – Maven build file with the JavaFX dependencies
- `mvnw`, `mvnw.cmd`, `.mvn/` – Maven wrapper

## Team Members

- [Raul] – Application code and demo video
- [Josh] – GitHub repository management
- [Seal] – Teamwork statement and code contributions
- [Angel] – Teamwork statement
