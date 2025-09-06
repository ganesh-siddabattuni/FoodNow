# 🍔 FoodNow - Full-Stack Food Delivery Application

![FoodNow Application Banner](https://i.imgur.com/w9O1wM9.png)

**FoodNow** is a modern, full-stack food ordering and delivery platform designed to connect customers with their favorite local restaurants. Built with a powerful backend using Java & Spring Boot and a dynamic frontend using Angular, this application provides a seamless and feature-rich experience for customers, restaurant owners, and administrators.

---

## ✨ Key Features

The application is designed with three primary user roles in mind, each with a dedicated and feature-rich dashboard.

### 👨‍🍳 For Customers
* **User Authentication**: Secure user registration and login using JWT (JSON Web Tokens).
* **Restaurant Discovery**: Browse a comprehensive list of available restaurants.
* **Search & Filtering**: Easily find restaurants by name or cuisine type.
* **Detailed Menu Viewing**: View detailed menus for each restaurant.
* **Shopping Cart**: Add and manage multiple items in a persistent shopping cart.
* **Secure Checkout**: A complete order placement flow with address management.
* **Real-time Order Tracking**: Track the status of an order from "Placed" to "Delivered".
* **Order History**: View a complete history of all past orders.
* **Reviews & Ratings**: Leave feedback and a star rating for completed orders.
* **Become a Partner**: A simple form to apply to list a new restaurant on the platform.

### 🍽️ For Restaurant Owners
* **Dedicated Dashboard**: A powerful dashboard to manage all restaurant-specific operations.
* **Menu Management**: Add, edit, delete, and toggle the availability of food items.
* **Order Management**: View and process incoming orders in real-time with status updates (`Accept`, `Prepare`, `Ready for Pickup`).
* **Audible Notifications**: Get real-time sound alerts for new incoming orders.
* **Performance Analytics**: View key metrics like total revenue and top-selling items through interactive charts.
* **Customer Reviews**: View and manage all customer feedback.

### ⚙️ For Administrators
* **System Overview Dashboard**: A high-level view of the entire platform's health and key metrics using interactive charts (daily revenue, order status distribution).
* **Restaurant Application Management**: Approve or reject new restaurant applications.
* **User Management**: View a list of all users registered on the platform.
* **Platform-wide Data**: View all restaurants, orders, and delivery agents in the system.

---

## 🚀 Tech Stack

This project is built with a modern, robust, and scalable technology stack.

| Area        | Technology                                                                 |
| :---------- | :------------------------------------------------------------------------ |
| **Frontend** | `Angular`, `TypeScript`, `HTML5`, `CSS3`, `ApexCharts`                    |
| **Backend**  | `Java 17`, `Spring Boot`, `Spring Security`, `Spring Data JPA`, `Maven`   |
| **Database** | `MySQL`                                                                   |
| **Testing**  | `JUnit 5`, `Mockito`                                                      |

---

## 🏗️ Architecture Overview

FoodNow is built using a decoupled, client-server architecture.

* **Backend**: A stateless, JWT-secured REST API built with Spring Boot. It follows a layered architecture (Controller ➔ Service ➔ Repository) to ensure a clean separation of concerns.
* **Frontend**: A dynamic Single-Page Application (SPA) built with Angular. It uses a service-based architecture with centralized state management to create a reactive and efficient user experience.

