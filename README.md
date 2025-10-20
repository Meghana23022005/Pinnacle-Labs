# Pinnacle-Labs
Java Console Mini-Projects​
A collection of beginner-friendly Java console applications: a note-taking app, a multiple-choice quiz, and a two-player Tic-Tac-Toe game. Each program runs in the terminal, uses Scanner for input, and illustrates arrays, loops, conditionals, and basic state management.​

Projects​
NoteTakingApp.java — Simple menu-driven notes list with add and view options using ArrayList.​

QuizGame.java — Three-question multiple-choice quiz with score tracking.​

TicTacToe.java — Two-player 3x3 Tic-Tac-Toe with input validation and win/draw detection.​

Getting Started​
Prerequisites:

Java 8+ (JDK) installed and available in PATH.​

Clone:

git clone https://github.com/your-username/your-repo-name.git​

cd your-repo-name​

Compile:

javac NoteTakingApp.java​

javac QuizGame.java​

javac TicTacToe.java​

Run:

java NoteTakingApp​

java QuizGame​

java TicTacToe​

How To Use​
NoteTakingApp:

Choose 1 to add a note, 2 to list notes, 3 to exit. Notes are stored in memory during the session.​

QuizGame:

Answer each question by entering a number 1–4; score increments on correct answers. Displays final score at the end.​

TicTacToe:

Players X and O alternate entering row and column (1–3). The program validates input, checks rows, columns, and diagonals, and announces win or draw.​

Learning Goals​
Practice using Scanner for console I/O.​

Work with arrays and ArrayList for data storage.​

Implement control flow, input validation, and simple game logic.​

Possible Improvements​
NoteTakingApp:

Use generics: ArrayList<String> for type safety.​

Add delete/edit notes and simple file persistence.​

QuizGame:

Fix loop structure to show options before reading input and to print final score after the loop.​

Externalize questions to a file or JSON; add timing and categories.​

TicTacToe:

Ensure scanner is closed after the game loop ends; guard against invalid tokens cleanly.​

Add single-player mode with a basic AI (minimax or random).​

Folder Structure​
/NoteTakingApp.java​

/QuizGame.java​

/TicTacToe.java​

License​
MIT License (recommended for learning projects).​
