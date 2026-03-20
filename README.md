# 🏥 Hospital Management System

## 📌 Project Overview

This is a Java-based Hospital Management System developed using Hibernate (JPA) to manage hospital operations such as patient records, encounters, medical orders, and user data.
The project follows a layered architecture using DAO and Service design patterns.

---

## 🚀 Features

* Add and manage hospital details
* Manage branches and addresses
* Patient (Person) management
* Encounter and observation tracking
* Medical orders management
* User management system
* CRUD operations using Hibernate

---

## 🛠️ Tech Stack

* **Java**
* **Hibernate (JPA)**
* **MySQL / Relational Database**
* **Maven**
* **Eclipse / VS Code**

---

## 📂 Project Structure

```
src/main/java/com/ty/hospital_app/
│
├── dto          → Entity classes (Hospital, Branch, Person, etc.)
├── dao          → Data Access Layer
├── imp          → DAO Implementations
├── service      → Business Logic Layer
├── control      → Main/Test classes
│
resources/
└── META-INF/persistence.xml → Hibernate configuration
```

---

## ▶️ How to Run

1. Clone the repository

   ```
   git clone https://github.com/your-username/Hospital-management-system.git
   ```

2. Open project in **Eclipse / IntelliJ / VS Code**

3. Configure database in:

   ```
   src/main/resources/META-INF/persistence.xml
   ```

4. Run main class:

   ```
   TestSaveHospital.java
   ```

---

## 📸 Sample Functionality

* Saving hospital data using Hibernate
* Managing relationships between entities
* Performing CRUD operations

---

## 🔮 Future Improvements

* Add REST APIs using Spring Boot
* Add frontend UI (React / Angular)
* Implement authentication & authorization
* Add reporting and dashboard

---

## 👨‍💻 Author

**Mayank**
Java Backend Developer | Middleware Engineer

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
