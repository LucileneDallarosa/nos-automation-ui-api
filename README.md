# NOS Automation Code Challenge
This project aims to automate the register and the entry page of NOS webSite: https://login.nos.pt using the concepts of BDD and Tests UI. 
The project also automate the four endpoints - POST, GET, PATCH and DELETE - of Rest API https://gorest.co.in/.

## Organization
The project uses the **Page Objects** design pattern
* API
  * the configuration and the DTO classes are allocated on MAIN directory;
  * the classes stepDefs and run are allocated on TEST directory;
  * the class .feature is allocated on TEST-RESOURCES directory

* UI
  * the classes element, page and services are allocated on MAIN directory;
  * the classes stepDefs and run are allocated on TEST directory;
  * the classes .feature are allocated on TEST-RESOURCES directory

## Tools
* Java
* Maven


## Frameworks used
* Cucumber
* Junit
* Selenium
