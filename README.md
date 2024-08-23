# CODTECH-Task2
Java Programmer Intern in CodTech IT Solutions
<br>
Name: Ankita Satdeve
<br>
Company: CODTECH IT SOLUTIONS
<br>
ID: CT04DS5713
<br>
Domain: Java Programming
<br>
Duration: July to August 2024
<br>
Mentor: Muzammil Ahmed
<br>

# Project Overview: 
Online Banking System:
The "Banking System" project is a simple yet comprehensive simulation of a banking system that allows users to perform essential banking operations such as creating accounts, depositing and withdrawing funds, transferring money between accounts, and checking account balances. The application is console-based and built using Java, making it a great project for demonstrating fundamental concepts of object-oriented programming (OOP) in Java.
<br>
# Project Objective
The main objective of the Banking System project is to create a user-friendly application that simulates basic banking functionalities. The project aims to provide a hands-on understanding of OOP principles such as encapsulation, abstraction, and the use of Java Collections for managing data. The project is designed to be both educational and practical, serving as a foundation for more complex financial applications.
<br>
# Key Activities
<br>
✅Account Management:
<br>
Users can open new bank accounts by providing an account number and account holder's name.
<br>
The system ensures no duplicate accounts by checking for existing account numbers.
<br>
✅Depositing Funds:
<br>
Users can deposit money into their accounts.
<br>
The system validates the deposit amount to ensure it is positive.
<br>
✅Withdrawing Funds:
<br>
Users can withdraw money from their accounts.
<br>
The system checks for sufficient balance before processing the withdrawal.
<br>
✅Transferring Funds:
<br>
Users can transfer money between accounts.
<br>
The system ensures the transfer amount is valid and that both the source and target accounts exist.
<br>
✅Balance Inquiry:
<br>
Users can check the balance of their accounts at any time.
<br>
The system retrieves and displays the current balance of the selected account.
<br>
✅Menu-Driven Interface:
<br>
The system presents users with a menu to choose different banking operations.
<br>
The application loops until the user chooses to exit.
<br>

# Technologies Used
<br>
✅Java Programming Language: The entire application is written in Java, utilizing its robust features for object-oriented programming and data handling.
<br>
✅Java Collections Framework: A HashMap is used to store and manage bank accounts, providing efficient access and manipulation of account data.
<br>
✅Java I/O: The Scanner class is used for reading user input from the console.
<br>
✅Object-Oriented Principles: The project heavily employs OOP concepts such as encapsulation (e.g., using private fields and public methods in the Account class), abstraction (e.g., simplifying account operations), and static members (e.g., using a static HashMap to manage accounts).
<br>
In the BankingSystem code provided, several key concepts of Object-Oriented Programming (OOP) and Java programming are utilized. Below is an overview of these concepts:

# Concepts:
✅Encapsulation:
<br>
Definition: Encapsulation is the bundling of data (attributes) and methods that operate on the data into a single unit or class. It also restricts direct access to some of the object's components, which can prevent accidental interference and misuse of the data.
<br>
Example in Code:
The Account class encapsulates the attributes number, holderName, and balance, along with methods to manipulate these attributes (addFunds, deductFunds, transferFunds). The attributes are marked as private, so they cannot be directly accessed from outside the class. Instead, methods (getNumber, getHolderName, getBalance) provide controlled access to the data.
<br>
✅Abstraction:
<br>
Definition: Abstraction involves hiding the complex implementation details of a system and showing only the necessary features of an object. It helps to reduce complexity and allows the programmer to focus on interactions at a higher level.
<br>
Example in Code:
<br>
The Account class abstracts the details of how balance management is handled (e.g., adding, deducting funds) and provides a simplified interface (e.g., addFunds, deductFunds) for users of the class to interact with the account.
<br>
The main banking system logic abstracts user operations like creating an account, depositing, withdrawing, transferring money, and checking balance through simple method calls.
<br>
✅Inheritance:
<br>
Definition: Inheritance is a mechanism in which one class acquires the properties (fields and methods) of another. It promotes code reusability and establishes a natural hierarchy.
<br>
Example in Code:
<br>
While the provided code does not explicitly use inheritance, it is a foundational concept in Java that could be applied if, for example, specialized types of accounts (e.g., SavingsAccount, CheckingAccount) were to inherit from a base Account class.
<br>
✅Polymorphism:
<br>
Definition: Polymorphism allows methods to do different things based on the object it is acting upon, even though they share the same name. It can be achieved through method overloading or overriding.
<br>
Example in Code:
<br>
The code provided does not directly demonstrate polymorphism through method overriding or overloading. However, polymorphism could be implemented by overriding methods in subclasses of Account if inheritance were used.
<br>
✅Classes and Objects:
<br>
Definition: A class is a blueprint for creating objects (instances of a class). Objects are instances of a class that are created with specific data.
<br>
Example in Code:
<br>
The Account class is a blueprint, and each account created using new Account(...) in the code is an object instance of that class. The BankingSystem class also serves as a blueprint for the operations that can be performed within the banking system.
<br>
✅Constructors:
<br>
Definition: Constructors are special methods invoked when an object is created. They are used to initialize the object's state.
<br>
Example in Code:
<br>
The Account class has a constructor public Account(String number, String holderName) which initializes the account number, account holder's name, and sets the initial balance to 0.0.
<br>
✅Static Members:
<br>
Definition: Static members (fields or methods) belong to the class, rather than any instance of the class. They can be accessed directly using the class name.
<br>
Example in Code:
<br>
private static HashMap<String, Account> accountMap is a static member of the BankingSystem class. It holds all the account objects and is shared across all instances of the BankingSystem.
<br>
✅Data Structures (HashMap):
<br>
Definition: HashMap is a data structure in Java that allows for the storage and retrieval of key-value pairs. It is part of the Java Collections Framework.
<br>
Example in Code:
<br>
accountMap is a HashMap that stores account details with the account number as the key and the Account object as the value. This allows for efficient retrieval of account information based on the account number.
<br>
✅Control Structures:
<br>
Definition: Control structures dictate the flow of the program. Common control structures include loops (for, while), conditionals (if, else), and switch statements.
<br>
Example in Code:
<br>
The while loop in the main method controls the execution of the banking system's menu-driven interface, and the switch statement handles different user actions based on their menu selection.
<br>
✅Error Handling:
<br>
Definition: Error handling is the process of responding to the occurrence of exceptions – anomalous or exceptional conditions requiring special processing.
<br>
Example in Code:
<br>
The code uses conditional checks to ensure that operations like deposits, withdrawals, and transfers are valid (e.g., checking if the amount is positive and does not exceed the balance).
<br>
✅User Input and Output:
<br>
Definition: Handling user input and displaying output is essential for interactive applications.
<br>
Example in Code:
<br>
The Scanner class is used to capture user input, and System.out.println is used to display messages to the user.
<br>
These concepts collectively allow for the creation of a well-structured, modular, and maintainable banking application.


