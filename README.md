# 💼 Technical Exercise – Java 21 / Microservices

## 🧠 Context

You are working on a microservice responsible for managing orders.

The current implementation works but has several issues.

Your goal is to **improve the codebase** and make it production-ready.

---

## 🎯 Objectives

Refactor and enhance the existing code to make it:

* Maintainable
* Testable
* Extensible
* Aligned with microservices best practices

---

## 🛠️ Requirements

### 1. Business Rules

Implement the following logic:

* If `amount > 1000` → `REJECTED`
* If customer is VIP → `ACCEPTED` (Customer is VIP when ID % 2 === 0)
* Otherwise → `CREATED`

### 2. External Services

Simulate integration with external services:

* `CustomerService` → to determine if a customer is VIP
* `PaymentService` → to process payments

Requirements:

* Handle failures
* Implement a simple retry mechanism

### 3. Testing

* Write unit tests for the service layer
* Mock external dependencies
* Cover main business cases

---

## ⚙️ Technical Constraints

* Java 21
* Spring Boot
* Maven

## ❗ Notes

This exercise is not about finishing everything.

We are more interested in:

* How you think
* How you structure your code
* How you justify your decisions

---

Good luck 🚀
