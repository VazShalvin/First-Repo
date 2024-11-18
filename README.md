# Java Collision Check Using Exception Handling

## Overview

This Java program is designed to check for collisions between two objects, such as moving vehicles or interactive game elements. The program uses exception handling to gracefully manage errors or unexpected situations that may arise during the collision detection process. By leveraging exception handling, the program can provide clear feedback to the user and continue execution without crashing.

## Features

- **Collision Detection**: Determines whether two objects (represented as rectangles, circles, or custom shapes) collide based on their positions and sizes.
- **Exception Handling**: Uses Java's `try-catch` mechanism to handle potential errors during the collision check (e.g., invalid input, out-of-bounds errors).
- **Scalable**: The code can be easily modified to handle different types of objects and collision checks.

## Requirements

- **Java 8 or higher**
- Basic understanding of object-oriented programming (OOP) and exception handling in Java.

## Installation

1. Clone the repository to your local machine:
    ```bash
    git clone https://github.com/yourusername/collision-check-java.git
    ```
2. Navigate to the project directory:
    ```bash
    cd collision-check-java
    ```
3. Compile and run the Java program using the following command:
    ```bash
    javac CollisionCheck.java
    java CollisionCheck
    ```

## Usage

1. The program will ask the user to input the position and size of two objects (e.g., rectangles).
2. The system will then check if these objects overlap (collide) based on the provided coordinates and dimensions.
3. If an error is encountered (e.g., invalid input), an exception will be thrown, and the error message will be displayed.

Example:

```plaintext
Enter the x, y, width, and height for object 1:
x1: 10
y1: 20
width1: 30
height1: 40

Enter the x, y, width, and height for object 2:
x2: 25
y2: 30
width2: 30
height2: 40

Collision detected: YES
