# 🎮 Number Guessing Game

A simple **Java console-based number guessing game** where the computer generates a random number and the player tries to guess it.

The game includes **difficulty levels, score calculation, maximum attempts, input validation, hints, and a replay option**.

## ✨ Features

* 🎲 Generates a random number
* 🎯 Three difficulty levels:

  * Easy: 1–50
  * Medium: 1–100
  * Hard: 1–200
* 🔼 Shows **Too High** when the guess is greater than the secret number
* 🔽 Shows **Too Low** when the guess is smaller than the secret number
* 🔢 Counts the number of attempts
* ⏳ Limits the maximum number of attempts
* 🏆 Calculates the player's score
* ⚠️ Handles invalid input
* 🔁 Allows the player to play again
* ❌ Shows the correct number when the player loses

## 🏆 Scoring System

Each difficulty level has a different starting score:

| Difficulty | Range | Maximum Attempts | Starting Score |
| ---------- | ----- | ---------------- | -------------- |
| Easy       | 1–50  | 10               | 100            |
| Medium     | 1–100 | 8                | 150            |
| Hard       | 1–200 | 7                | 200            |

For every incorrect valid guess, **10 points are deducted**.

The fewer attempts you use, the higher your final score will be.

## 🛠️ Technologies Used

* **Java**
* `Scanner` for user input
* `Random` for generating random numbers
* `while` loops
* `if-else` conditions
* Variables and operators
* Input validation
* Basic game logic

## 📂 Project Structure

```text
number-guessing-game/
│
├── NumberGuessingGame.java
└── README.md
```

## ▶️ How to Play

1. Start the program.
2. Choose a difficulty level.
3. The computer generates a random number.
4. Enter your guess.
5. The game gives a hint:

   * **Too High** 🔼
   * **Too Low** 🔽
6. Continue guessing until:

   * You guess the correct number, or
   * You run out of attempts.
7. Your final score is displayed.
8. Choose whether you want to play again.

## 💻 Sample Output

```text
🎮 Welcome to Number Guessing Game!

==============================
       CHOOSE DIFFICULTY
==============================
1. Easy   (1 - 50)
2. Medium (1 - 100)
3. Hard   (1 - 200)

Enter your choice: 2

🎯 I have chosen a number between 1 and 100.
You have 8 attempts.
Try to guess it!

Enter your guess: 50
Too low! 🔽 Try again.

Enter your guess: 75
Too high! 🔼 Try again.

Enter your guess: 63
🎉 Congratulations! You guessed it!

🔢 Attempts: 3
🏆 Your Score: 130

Do you want to play again? (yes/no): no

================================
   Thanks for playing! 👋
================================
```

## 📚 What I Learned

While building this project, I practiced:

* Taking user input using `Scanner`
* Generating random numbers using `Random`
* Using `while` loops
* Using `if-else` conditions
* Working with variables and operators
* Input validation
* Creating difficulty levels
* Implementing a scoring system
* Controlling game flow with loops
* Building an interactive console-based Java application

## 🚀 Future Improvements

Possible future improvements include:

* Add a leaderboard
* Save high scores
* Add more difficulty levels
* Add hints with limited usage
* Create a graphical user interface
* Add sound effects
* Store player statistics

## 👩‍💻 Author

**Naziya Gouri**

BCA Student | Learning Java, Web Development & Computer Science

