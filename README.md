# Java Swing Calculator

A Java desktop calculator built with Swing. It takes two numbers and performs addition, subtraction, multiplication, division, or modulus.

## Features

- Two input fields for the numbers (decimals and negatives are supported)
- Buttons for **Add**, **Subtract**, **Multiply**, **Divide**, and **Modulus**
- A read-only **Result** field
- A layout that arranges components automatically (`FlowLayout`)

## How It Works

- `CalculatorSwing` extends `JFrame` and implements `ActionListener`, so one `actionPerformed` method handles every button.
- It reads both fields with `Double.parseDouble()`.
- `e.getSource()` tells which button was clicked, and the matching operation is applied.
- The answer is shown in the result field.

## Examples

| First | Second | Button | Result |
|-------|--------|--------|--------|
| 10 | 4 | Add | 14.0 |
| 10 | 4 | Subtract | 6.0 |
| 10 | 4 | Multiply | 40.0 |
| 10 | 4 | Divide | 2.5 |
| 10 | 3 | Modulus | 1.0 |

## Known Limitations

- **Invalid input:** If a field is empty or not a number, `Double.parseDouble()` throws a `NumberFormatException`. The window stays open but nothing happens, and the error is printed in the console.
- **Division by zero:** Because the values are `double`, dividing by `0` shows `Infinity` (and `0 % 0` or `10 % 0` shows `NaN`) instead of an error message.

## Requirements

- Java Development Kit (JDK) 8 or higher (Swing is included in the JDK)

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac CalculatorSwing.java
java CalculatorSwing
```

## Project Structure

```
.
├── CalculatorSwing.java
└── README.md
```

## Possible Improvements

- Catch `NumberFormatException` and show a message dialog
- Show a clear message when dividing by zero
- Start the window on the Swing event thread with `EventQueue.invokeLater()`
- Add a Clear button
