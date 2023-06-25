# Framework Used
* Spring Boot
# Language Used
* Java
# Data Flow

* Controller - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer.
* Service -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* Repository - This layer mainatains the databases thing on which CRUD operations are performed.
* Model - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

# Summary

The above project implements a Restaurant model which add some class variables to Restaurant model class ( like restaurant name, restaurant address, number, specialty, total staffs etc.) on which various operation to be performed :- -get Restaurant by id using GetMapping. -get all Reataurant using GetMapping -Add some Restaurant to Restaurant lists using PostMapping -update Restaurant information like Specialty. -delete Restaurant from the list.
