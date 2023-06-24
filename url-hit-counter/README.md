# SpringBoot_Assignment_ Url_Hit_Count

## Framework Used
SpringBoot

## Language Used
Java

## Data flow
In this project, we have four layers-

Controller - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.

Service -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.

## Data Structure used in my project
In our project uesd HashMap

## Step 1: Create a Spring Boot Project
Create a new Spring Boot project using the Spring Initializr and import required dependency.

## Step 2: Create a UrlHitController Class
Under the controller package, create a new class called "UrlHitController". In this class, define a GET mapping method that will handle requests to the "/count" endpoint. This method should call the service layer to increment the hit count.

## Step 3: Create a UrlHitService Class
Under the service package, create a new class called "UrlHitService". In this class, define a method to increment the hit count. 


## Step 4: Test Your Application
Start your application and make a GET request to the "/count" endpoint. Verify that the response contains the expected hit count.

