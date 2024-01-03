 Automation Test Project for Nop Commerce Website

This is a readme file for an automation test project that focuses on testing the registration, login, search, and wishlist functions of a Nop Commerce website.

## Project Overview

The objective of this project is to automate the testing of key functionalities of a Nop Commerce website. The project utilizes Selenium WebDriver, Java, and TestNG to create automated test scripts that verify the expected behavior of the registration, login, search, and wishlist features.

## Prerequisites

Before running the automated tests, make sure you have the following software installed on your machine:

- Java Development Kit (JDK)
- Integrated Development Environment (IDE) such as Eclipse or IntelliJ
- Selenium WebDriver
- TestNG

## Project Structure

The project follows a standard Maven project structure. The important files and directories are as follows:

- `src/main/java`: Contains the main source code files
- `src/main/resources`: Contains any required resources such as configuration files
- `src/test/java`: Contains the test code files
- `src/test/resources`: Contains the test data and configuration files
- `pom.xml`: The Maven project configuration file

## Test Scenarios

The automation test project covers the following test scenarios:

1. Registration Functionality:
   - Verify successful registration with valid user details
   - Verify error message when registering with an already registered email

2. Login Functionality:
   - Verify successful login with valid credentials
   - Verify error message when logging in with invalid credentials

3. Search Functionality:
   - Verify search results for a valid product name
   - Verify no search results for an invalid product name

4. Wishlist Functionality:
   - Verify adding a product to the wishlist
   - Verify removing a product from the wishlist

## How to Run the Tests

1. Clone the project repository to your local machine.
2. Import the project into your preferred IDE.
3. Install the required dependencies mentioned in the `pom.xml` file.
4. Update the test data and configuration files in the `src/test/resources` directory, if necessary.
5. Open the test class files in the `src/test/java` directory and run them using TestNG.

## Test Reports

After running the tests, a test report will be generated automatically. The test report provides detailed information about the test execution, including the number of tests passed, failed, and skipped, along with any error messages or stack traces.

## Contributions

Contributions to the project are welcome. If you find any issues or want to suggest improvements, feel free to create a pull request or submit an issue on the project repository.

## License

This project is licensed under the [MIT License](LICENSE)
