# Programming challenge

## Background
In food animal systems, animals move to different farms as they age. Each farm has a unique ID and must keep a record of the movement of animals from one farm to another. Here, we present some fictitious records of movements among pig farms.

*Description of the data folder* 

*	*movements*: all records of animal movements 
    -  new_originpremid - column with the ID of the origin farm 
    -  new_destinationpremid - column with the ID of the destination farm 
    -  new_numitemsmovedcolumn - column with the number of moved animals

*	*population*: complete list of the farms
    -  premiseid - column with the ID of the farms
    -  total_animal - column with the current number of animals for the farm


## Challenge
The challenge is to create a system to visualize the movement records. This
system have to follow the requirements bellow:

- Has to be composed of 3 components: a REST API, a SPA WEB client, and a
  relational database;
- The relational database can be any database that you like, PostgreSQL, MariaDB
  etc..;
- The data provided in this repo should be imported into the database;
- The REST API has to written in Java, Python or Typescript. It can use any
  framework/library that you desire;
- The Web Client have to written in Typecript, and you can use any *SPA
  framework/library* that you desire, ex Angular, React, etc...;
- Your submitted project should include instructions on how to run it;

The submitted project will be evaluated considering your experience. For example, a
person with a background in backend development will be evaluated with higher
expectations of the API and database code. A UI person will be evaluated with
higher expectations on the design of the UI.

Bonus points will be awarded for creativity and implementing things outside the
requirements, such as:
- having an authentication in the system
- Using docker
- Having a script to run all components
- Importing the supplied data into a well normalized schema

## Submission

### Documentation
[Java Documentation](https://subodh30.github.io/programming-challenge/) <br>
[Folder Location](/docs)

### Instructions to run the project locally
Please follow steps given in  [SETUP.md](/SETUP.md) file to run the project

### Instructions to deploy applications in Docker
Please follow steps given in  [DEPLOYMENT.md](/DEPLOYMENT.md) file to deploy the project

### Database Schema
Please read [DATABASE.md](/DATABASE.md) file for database schema details. <br>
Please refer [schema.sql](/Backend/application_layer/src/main/resources/schema.sql) file for database schema and [data.sql](/Backend/application_layer/src/main/resources/data.sql) file for initial data.

### Screenshots of Website

#### Dashboard
![Dashboard](/output/dashboard.png)

#### Movement Data
![Movement Data](/output/movement.png)

#### Population Data
![Population Data](/output/population.png)