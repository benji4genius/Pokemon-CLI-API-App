Title: Pokémon CLI Web App with User Authentication and Favorites

Description:

This project is a command-line interface (CLI) web application built with Java and Spring Framework that interacts with a Pokémon API to generate random Pokémon encounters. Users can register and log in to create a personalized experience by adding their favorite Pokémon to a favorites list. The application utilizes a PostgreSQL database (pgAdmin) for user data and Pokémon selections, managed through SQL queries.

Features:

Random Pokémon Generation: Invoke the power of the Pokémon API to encounter random Pokémon! Explore the vast world of Pokémon with each command.
User Authentication: Register and log in to personalize your experience. Securely store your login credentials and manage your Pokémon favorites.
Favorites Management: Add your favorite Pokémon to a dedicated list. This allows you to easily revisit your preferred Pokémon companions.
Technologies:

Programming Language: Java
Backend Framework: Spring Framework
API Integration: Pokémon API (https://pokeapi.co/api/v2/pokemon/)
Database: PostgreSQL (pgAdmin)
Database Language: SQL
Requirements:

Java Runtime Environment (JRE) 11 or later (https://www.oracle.com/java/technologies/downloads/)
PostgreSQL database server (https://www.postgresql.org/download/)
pgAdmin for PostgreSQL administration (https://www.pgadmin.org/)
Installation:

Clone the Repository: Use Git to clone this repository to your local machine.

Bash
git clone https://github.com/benji4genius/Pokemon-CLI-API-App.git


Set Up Database:

Install and configure a PostgreSQL database server.
Create a database for the application. (Detailed instructions for database setup may vary depending on your environment. Refer to PostgreSQL documentation for assistance.)
Configure Database Connection:

Edit the application.properties file to specify your database connection details (host, port, username, password, and database name).
Run the Application:

Navigate to the project directory in your terminal.
Use a command like mvn spring-boot:run to start the application.
Usage:

Start the Application: Ensure the application is running (refer to installation instructions).

Register: Use the register command followed by your desired username and password to create an account.

Bash
pokemon-cli register <username> <password>


Login: Use the login command with your credentials to access the application.

Bash
pokemon-cli login <username> <password>


Generate Random Pokémon: Enter the generate command to encounter a random Pokémon. Details will be displayed in the console.

Bash
pokemon-cli generate


Add to Favorites: While logged in, use the favorite add <pokemon_name> command to add a Pokémon to your favorites list.

Bash
pokemon-cli favorite add <pokemon_name>

View Favorites: Use the favorite list command to see your favorite Pokémon.

Bash
pokemon-cli favorite list
