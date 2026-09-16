# Payroll Management System

A Java console application demonstrating core OOP concepts through a real-world payroll scenario.

---

## Classes

- **Employee** — abstract base class
- **FullTimeEmployee** — fixed salary + bonus
- **PartTimeEmployee** — hourly rate × hours
- **Payable** — interface for payment
- **Payroll** — manages employees & payslips
- **Main** — entry point

---

## OOP Concepts Covered

- Abstraction
- Encapsulation
- Inheritance
- Polymorphism
- Interface
- Composition

---

## Features

- Add full-time and part-time employees
- Calculate salary (different logic per type)
- Generate payslips
- Pay all employees
- Remove employee by ID
- View remaining employee count

---

## How to Run

1. Compile all files
2. Run `Main.java`

---

## Sample Output
Employee Aaksh has been added to the Payroll
Employee Rajat has been added to the Payroll

--- Payslips ---
Name: Aaksh, Id: 1, Salary: 55000.0
Total Salary: ₹55000.0
--------------------------------------
Name: Rajat, Id: 2, Salary: 16000.0
Total Salary: ₹16000.0
--------------------------------------

--- Paying All Employees ---
Aaksh get 55000.0 which is full time employee
Rajat get 16000.0 which is part time employee

--- Remove Employee ID 2 ---
Employee Rajat removed

--- Remove Employee ID 99 ---
Employee with ID 99 not found

--- Remaining Employees ---
Count: 1
  
