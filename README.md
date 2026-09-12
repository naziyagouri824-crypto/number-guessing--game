# 🎮 Number Guessing Game

A simple **Java console-based game** where the computer generates a random number between 1 and 100, and the player tries to guess it.

The game gives hints after every guess and counts the number of attempts taken to find the correct number.

## ✨ Features

* 🎲 Generates a random number between 1 and 100
* ⌨️ Takes input from the user
* 🔼 Shows "Too high" when the guess is greater than the secret number
* 🔽 Shows "Too low" when the guess is smaller than the secret number
* 🎯 Displays a success message when the correct number is guessed
* 🔢 Counts the number of attempts

## 🛠️ Technologies Used

* **Java**
* `Scanner` for user input
* `Random` for generating the secret number
* `while` loop
* `if-else` conditions
* Variables and operators

## 📂 Project Structure

```text
number-guessing-game/
│
├── NumberGuessingGame.java
└── README.md
```

## ▶️ How the Game Works

1. The computer generates a random number between 1 and 100.
2. The player enters a guess.
3. The program compares the guess with the secret number.
4. The program gives a hint:

   * **Too high** 🔼
   * **Too low** 🔽
5. The player continues guessing until the correct number is found.
6. The total number of attempts is displayed.

## 💡 Sample Output

```text
🎮 Welcome to Number Guessing Game!
I have chosen a number between 1 and 100.
Try to guess it!

Enter your guess: 50
Too high! 🔼 Try again.

Enter your guess: 25
Too low! 🔽 Try again.

Enter your guess: 37
🎉 Correct!
You guessed the number in 3 attempts.
```

## 📚 What I Learned

While building this project, I practiced:

* Taking user input using `Scanner`
* Generating random numbers using `Random`
* Using `while` loops
* Using `if-else` conditions
* Working with variables
* Building a simple interactive Java program

## 🚀 Future Improvements

* Add difficulty levels
* Add a maximum number of attempts
* Add a play-again option
* Add a score system
* Improve input validation
* Create a graphical user interface

## 👩‍💻 Author

**Naziya Gouri**

BCA Student | Learning Java, Web Development & Computer Science
