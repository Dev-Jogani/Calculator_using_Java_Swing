# Java Swing Calculator

This project is a basic calculator application developed using Java Swing, designed with a clean graphical user interface for performing elementary arithmetic operations. It supports operations like addition, subtraction, multiplication, and division, and is aimed at helping beginners understand the implementation of event-driven programming using Java's GUI components.

The calculator comprises two display fields—one for the current expression and one for the result. It includes buttons for digits (0–9), operators (+, -, *, /), a clear function, and an equals button to compute the result. Each button is styled and placed carefully within a `JFrame` to provide a familiar calculator layout.

## Internal Structure

Internally, the logic is separated into two classes:

- **The `operator` class** handles the arithmetic computations.
- **The `myframe` class** builds the interface using Swing components such as `JTextField`, `JButton`, and layout management using absolute positioning. It listens for button presses via `ActionListener`, updates the input fields, and triggers operations when an operator or equals sign is pressed.

## Features Demonstrated:

- Java Swing usage for GUI building
- Layout management and component styling
- Event handling with `ActionListener`
- Basic class structuring and separation of logic

The calculator restricts input to integers and handles operations sequentially. It's a great entry-level project for anyone learning Java desktop application development or preparing to explore more advanced GUI frameworks.

## How to Run

1. Make sure you have **JDK 8 or later** installed.

2. Compile the source file:
    ```bash
    javac calculator1.java
    ```

3. Run the compiled class:
    ```bash
    java calculator1
    ```

You can also package this into a `.jar` file and run it as a standalone application.

This project is simple but can be extended with features like floating-point support, keyboard input, or scientific calculator functions.
