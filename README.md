# Programming challenge

## Background  
Farms need to move animals from one place to another. Here, we present some fictitious records of pig movement.

*Description of the data folder* 

*	*movements*: all records of animal movements 
    -  new_originpremid  column with the ID of the origin farm 
    -  new_destinationpremid column with the ID of the destination farm 
    -  new_numitemsmovedcolumn column with the number of moved animals

*	*population*: Native rds format data frame: complete list of the farms  
    -  premiseid  column with the ID of the farms 
    -  total_animal column with the current balance of animals


## Challenge   
The challenge is to create a system to visualize the movement records. This
system have to follow the requirements bellow:

- Have to composed by 3 components: a REST API, a SPA WEB client and a relational database;
- The relational database can be any database that you like, PostgreSQL, MariaDB etc..;
- The data provided in this repo should be imported into the database;
- The REST API have to written in Java, Python or Typescript, and it can use any framework/library that you desire;
- The Web Client have to written in Typecript, and you can use any *SPA framework/library* that you desire, ex Angular, React, etc...;
- The project should contain instructions on how to run it.

The submitted project will be evaluated considering your experience, ex:
a person with background in backend development, will be evaluated with higher expectations of the api and database code, a UI person will be evaluated with
higher expectations on the design on the UI.

Bonus points will be awarded for creativity and implementing things outside the requirements, like:
- having authentication in the system
- Using docker
- Having a script to run all components
- Importing the supplied data into a well normalized schema

## Submitting
You will have until the end of 1st of September to submit the github/gitlab
link, or a zipped file via email to <gmachad@ncsu.com> and <debling@ncsu.edu>
with the subject Programming Challenge.

Good luck!!!
