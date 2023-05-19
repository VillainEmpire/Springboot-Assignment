# DoctorApp
<h1 align="center">Healthcare Management API 
</h1>

The Healthcare Management API is a RESTful API designed to facilitate the management of patient and doctor data and appointments in a healthcare system. It provides endpoints for patient registration, authentication, appointment booking, and retrieval of doctor information.

## Prerequisites
* ![MySql](https://img.shields.io/badge/DBMS-MYSQL%205.7%20or%20Higher-red)
 * ![SpringBoot](https://img.shields.io/badge/Framework-SpringBoot-green)
* ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)

## Getting Started
* Clone or download the project from the repository.
* Import the project into your preferred Java Integrated Development Environment (IDE).
* Ensure that the required dependencies are resolved and imported correctly.

## Data flow
 The application is built using the SpringBoot framework and consists of three layers: model, service, and repository.-

* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.

>## Key Features
* **Patient Management:** Patients can sign up for a new account and sign in using their credentials. They can browse through the list of available doctors and book appointments as per their convenience. Patients can also cancel their existing appointments if necessary.

* **Doctor Management:** Doctors can be added to the system, providing details such as their name, specialization, and appointment availability. Doctors can view their appointment schedules to stay updated with their upcoming appointments.

* **Appointment Management:** The API facilitates the creation of new appointments by associating patients with available doctors. It ensures that appointments are booked successfully and provides the necessary functionality for patients to cancel their appointments when required.

## API Endpoints
* POST /patient/signup: Creates a new patient account.

* POST /patient/signin: Authenticates a patient and generates an access token.

* GET /patient/doctors: Retrieves a list of doctors available for appointments.

* DELETE /patient/appointment: Cancels an existing appointment.

* POST /doctor: Adds a new doctor to the system.

* GET /doctor/{docId}/appointments: Retrieves appointments for a specific doctor.

* POST /appointment: Creates a new appointment.

## Project Summary

The Healthcare Management API is a RESTful API developed using Spring Boot, Java, and MySQL. It provides a comprehensive solution for managing patient and doctor data, as well as appointments, within a healthcare system. The API allows patients to register, sign in, book appointments with available doctors, and cancel appointments if needed. Doctors can be added to the system, and their appointment schedules can be retrieved.



