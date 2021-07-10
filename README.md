## Custom-Query-in-Spring-Boot-with-IntelliJ
To craete Custom Queries in Spring Boot with IntelliJ over a MySQL Database.

### Types of Custom Queries in JPA

  1. Dynamic Query
  2. Named Query
  3. Native Query
  4. Criteria API

### Summary of the Project :

  * Created 3 entities/tables namely - Patient, Doctor and Report within Health database
  * Define 2 one-to-one relationship between two entities using JPA and Hibernate

#### Perform different CRUD operations for all 3 entities
  * Add 1 entry of Report
  * Add list of Patients
  * Add list of Doctors
  * Get all list of Reports (directly call of the repository)
  * Get all list of Reports (indirect call of the repository through service layer)
  * Get all list of Patients
  * Get all list of Doctors
  * Update Patient (find and match by PID) (updating other columns are only allowed)
  * Update Doctor (find and match by DID) (updating other columns are only allowed)
  * Delete Patient by PId
  * Delete Doctor by DId

#### Custom Queries created are mentioned below
##### Patient Repository
  * Get only the distinct selected column pairs <name, age> from Patient
  * Get only the distinct selected column pairs <name, age> from Patient whose age>30
  * Get all Patient Info through age entered by user **(Named Query)**
  * Get all Patient Info through name only entered by user **(Criteria API)**
  * Get all Patient Info through name & age entered by user **(Criteria API)**
##### Doctor Repository
  * Get only the distinct selected column pairs <dname, specs> from Doctor
  * Get all Doctor entries through specified specs by user **(Dynamic query - position parameter binding)**
  * Get all Doctor entries through specified specs by user **(Dynamic query - named parameter binding)**
  * Get all Doctor entries through specified specs by user **(Native query / SQL)**
##### Report Repository
  * Get all list of Report entries for specified test by user (user entry)
  * Get list of different attributes/columns taken from combination of all 3 entities. (JOIN)
  * Perform Left, Right, Inner and Cross Join over the same combination taken of all 3 entities.
  * Get different attributes/columns taken from combination of all 3 entities.
  * Perform Left, Right, Inner and Cross Join over the same combination taken of all 3 entities.

