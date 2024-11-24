# Hibernate-Framework

**Framework**

  - A framework is a Body or Platform of pre-defined codes which is used by the programmers to develope an Application.
  - framework will not do anything by itself , It has to be controlled by the Programmer.
  - A Java framewok includes classes . Interfaces and some tools which are required for the application developement.
  - ex.
      - Hibernate
      - Springs
      - TapeStry
      - ibatis , etc...
   
  - **Types of Frameworks :**

      - There are mainly 2 types  of frameworks
          1. Invasive Framework
          2. Non-Invasive Framework

     ** 1. Invasive Framework :**
           - A framework which forces a programmer to extends its classes and implements its intefaces is known as Invasive Framework.
           - ex.
               - EJB framework

     ** 2. Non-Invasive Framework :**
           - A framework which will not forces a programmer to extends its classes and implements its interfaces is known as Non-Invasive Framework.
           - ex.
               - Hibernate
               - TapeStry

**Why to go for the hHbernate....?**

- Because of **Disadvatages of the JDBC** which are as follows

    1. Duplicate code formation / Boiler Plate Code :
         - To insert any record into the database we need to follow all the steps of the JDBC , also for updating , deleting and retrieving record from the database which results in formation duplicate code / Boiler Plate Code

    2. JDBC will not support the Automatic Table Creation
    3. JDBC does not provide the stratergy for the generation of primary key
    4. JDBC does not supports the cache mechanism because of which traffic between the the database and Java Application increases and Efficiency decreases.
    5. in JDBC accessing data from a multiple table requires complex Queris and Joins.
