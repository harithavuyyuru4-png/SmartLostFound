# Smart Lost and Found Management System

## Project Overview
Smart Lost and Found Management System is a Java-based application developed using Core Java, JDBC, and MySQL. It helps users maintain records of lost and found items in a centralized database.

## Technologies Used
- Java
- JDBC (Java Database Connectivity)
- MySQL
- Eclipse IDE
- MySQL Workbench

## Features
1. User Registration
2. User Login
3. Add Lost or Found Items
4. View All Items
5. Update Item Status
6. Delete Item

## CRUD Operations
- **Create:** Add new lost or found item records.
- **Read:** Display all available item records.
- **Update:** Change the status of an item.
- **Delete:** Remove an item record from the database.

## Database Details
Database Name: `lost_found_db`

### Users Table
- user_id
- full_name
- email
- password
- phone
- created_at

### Items Table
- item_id
- user_id
- item_name
- description
- location
- item_type
- status
- created_at

## Project Structure
```text
SmartLostFound
│
└── src
    └── com.lostfound
        ├── DBConnection.java
        ├── User.java
        ├── UserDAO.java
        ├── RegisterTest.java
        ├── LoginTest.java
        ├── Item.java
        ├── ItemDAO.java
        ├── ItemTest.java
        ├── ViewItems.java
        ├── UpdateTest.java
        └── DeleteTest.java
```

## How to Run the Project
1. Clone or download this repository.
2. Open the project in Eclipse IDE.
3. Add MySQL Connector/J to the project Build Path.
4. Create the `lost_found_db` database in MySQL.
5. Create the required `users` and `items` tables.
6. Update the database username and password in `DBConnection.java`.
7. Run the required Java test classes.

## Future Enhancements
- Search Lost and Found Items
- Menu-Driven Application
- User-Friendly Web Interface
- Item Matching and Notifications

## Author
Haritha Vuyyuru
