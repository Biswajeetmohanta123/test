# 🏡Spring-CRUD-With-Validation wave:

## Framework Used
```
SpringBoot
```
## Language Used
```
Java
```
## Data flow
`
In this project, we have four layers-
`
```
Controller - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
```

```
Repository - Here database is stored, for which I have connected repository class to MYSQL In the database layer, CRUD (create, read, update, delete) operations are performed.
```

```
Service -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
```

```
DataBase Class - Here the class user is defined and the whatever a user class will load. e.g -userId, userName, address, phone number etc.
Data Structure used in my project.
```

In our project MySQL and the methods involved with JpaRepository are used.

## Project Summary
`project basically maintains the upcoming user information with various validation which includes-`

```
UserId
UserName
DOB
Email
Phone Number
LocalTime of entering the data
```

`You can read, read by specific id, update userName of specific userId, delete a user by their userId by api calls.`
