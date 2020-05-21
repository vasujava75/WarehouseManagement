# WarehouseManagement

This project contains angular 9 and spring boot

## Running Front-end:-

Note:- Make sure Node is installed in your machine
--> command prompt go to warehouse-frontend folder(where package.json available) and run below commands

--> npm install

--> npm start

## Running Back-end:-(Importing to IDE is easiest way to run the application)

Note:- Make sure Java and Maven installed in your machine

-->Go inside warehouse-backend folder and run below commands

-->mvn clean install

-->Go to where WarehouseAppliction.java resides(folder) then run Java DemoApplication

## Running Back-end Inside docker container:-

--> Install docker in your machine

--> Go to command prompt do 'mvn clean install'

--> run command 'docker build' (images builded)

--> run image command 'docker exec'(images runs inside container by exposing 8080 port outside)

# About the application

Technologies used: Angular 9, Bootstrap 4, Google Agm for location points, Spring boot,Spring secuirty, Gson library for importing json data,Docker

Remark:- Google image library componnet not implemented fully as some api key issue is there. 

    ### Phase1
    Implemented display component
    ### Phase 2
    Implemented details component
    ### Phase 3
    Implemented shopping component
    ### Misc
    Added other important things like spring security and docker etc. 
        Due to time constraint i haven't imported json data to db. So haven't used spring-data-jpa 
