# OOP Library System (Java)

This repository contains a library management system built using Java. The application demonstrates object-oriented programming (OOP) concepts and includes features for managing users and books with different levels of access.

## Features
- User management with role-based access (e.g., Admin, SuperAdmin, Member).
- Book management: add, view, update, and delete books.
- Manage library administration.
- Simple and extensible structure using OOP principles.

## Prerequisites
- Java Development Kit (JDK) 19 or later.
- An IDE or text editor for editing and running Java code (e.g., IntelliJ IDEA, Eclipse, or NetBeans).

## Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/dzikrimaulana87/OOP-Library-with-level-acces.git
   cd OOP-Library-with-level-acces
   ```

2. **Set Up the Database**
   - Import the `masih_belajar.sql` file into your MySQL database:
     ```sql
     mysql -u your_username -p your_database_name < masih_belajar.sql
     ```

3. **Open the Project**
   - Import the project into your Java IDE of choice.

4. **Configure the Database**
   - Update the database connection settings in `src/handler_class/Koneksi.java`

5. **Run the Application**
   - Compile and run the `Main.java` file to start the application.

## Usage
1. Log in using different user roles to explore role-based functionalities.
2. Admins can manage users and books.
3. Librarians can manage books and assist members.
4. Members can view and borrow books.

## Contributor
[Dzikri Maulana](https://www.linkedin.com/in/dzikrimaulana87/)<br>
[Rizky Fahrureza](https://www.linkedin.com/in/rizky-f-388aa4304/)<br>
[Malik Syafi'i](https://www.linkedin.com/in/malik-syafi-i/)<br>
[Luthfi Sifa Khaerunnisa](https://www.linkedin.com/in/luthfi-sifa/)<br>

---

For any questions or issues, please open an issue on the repository or contact the maintainer.
