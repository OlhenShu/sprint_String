# Advanced Test Automation (Java) with Selenium

## Getting Started

### Clone the Repository
To begin working with this project, clone the repository to your local machine using the following command:

```sh
git clone <url>
```

You can copy the repository URL as shown below:

<img width="968" alt="Screenshot 2022-05-10 at 23 06 42" src="https://user-images.githubusercontent.com/61456363/167713268-c89a4125-9467-47a6-a2d8-eb6fcefcc1dd.png">

## Project Structure

This sprint is organized into multiple tasks, each with its corresponding unit tests. These tasks are located in separate branches: **task1**, **task2**, **task3**, etc.

### Switching Between Tasks

To switch to a specific task branch, use the following command:

```sh
git checkout <branch name>
```

For example:

```sh
git checkout task1
```

> **Important:** Always commit your changes before switching to a different branch to avoid losing your work!

## Workflow

1. Navigate to the **main** folder and implement your solution for the current task
2. Uncomment all the tests in the **test** folder
3. Run the tests using one of the following methods:

### Running Tests

Using Maven:
```sh
mvn test
```

If Maven is not installed on your system, use the Maven wrapper:

For Windows:
```sh
mvnw.cmd test
```

For Unix-based systems (Linux, macOS):
```sh
./mvnw test
```

Alternatively, you can execute the tests directly from your IDE using the `Run` command.
