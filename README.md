# 🎆 New Year Fireworks
A digital way to celebrate the advent of New Year(mostly for entertaining myself).
To make it more serious, this project is a simple Java Swing animation that displays dynamic fireworks with the text **"新年快乐"** (Happy New Year).

---

## ✨ Features

* 🎇 Randomly generated fireworks animation
* 🧨 Particle-like motion with gravity effect
* 🎨 Warm color palette (red/orange tones)
* 🔄 Smooth animation (~60 FPS)
* 🖥️ Runs as a standalone Java application

---

## 🛠️ Requirements

* Java JDK 8 or higher
* No external libraries needed

---

## 🚀 How to Run

### 1. Compile

```bash
javac NewYearFireworks.java
```

### 2. Run

```bash
java NewYearFireworks
```

---

## 🧠 How It Works

* A `JPanel` is used as the canvas
* A `Timer` updates the animation ~60 times per second
* Each firework is represented by a `FireworkText` object
* Motion includes:

  * Velocity (`vx`, `vy`)
  * Gravity simulation
  * Lifetime decay

---

## 📂 Project Structure

```
NewYearFireworks.java
```

> This project is fully contained in a single file.

---

## 🎯 Learning Purpose

This project demonstrates:

* Java Swing basics (`JFrame`, `JPanel`)
* Animation using `Timer`
* Object-oriented design
* Simple physics simulation (velocity + gravity)
* Rendering text with `Graphics2D`

---

## 💡 Possible Improvements

* Add fading effects (alpha transparency)
* Add sound effects 🎵
* Support different texts or fonts
* Add mouse interaction (click to spawn fireworks)

---

## 📸 Preview

When you run the program, colorful text fireworks appear around the center of the window, simulating a festive New Year celebration.

---

## 📜 License

Free to use for learning and personal projects.

---

Happy Coding! 🚀

