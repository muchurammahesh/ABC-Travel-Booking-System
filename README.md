# ✈️ ABC Travel Booking System

A **Java console-based** application for managing travel bookings, rescheduling, fare calculations, and admin operations without a database — powered by **Core Java** and **Collections API**.

---

## 📜 Table of Contents
- [Overview](#-overview)
- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [System Flow](#-system-flow)
- [Modules](#-modules)
- [Setup & Execution](#-setup--execution)
- [Folder Structure](#-folder-structure)
- [License](#-license)
- [Author](#-author)

---

## 📖 Overview
**ABC Travels** is a fictional travel and logistics company aiming to automate its operations.  
This **menu-driven application** allows admins to register, book journeys, reschedule trips, calculate fares with weekend surcharges, and lock accounts after repeated failed logins — all **without any database**, using **Java Collections** for storage.

---

## ✨ Features
- 👨‍💼 **Admin Registration & Login** – Register new admin users with name, contact details, and secure password.
- 🔒 **Account Locking** – Lock account after **5 invalid login attempts**.
- 🗺 **Journey Planning** – Select source, destination, date, and passengers.
- 💰 **Dynamic Fare Calculation** – Weekend surcharge (+200) + GST applied automatically.
- 📅 **Rescheduling** – Edit travel dates without canceling bookings.
- 📜 **Logging** – Console-based logging for all actions.
- ⚠ **Error Handling** – Exception handling for invalid inputs and runtime issues.
- 🖼 **Company Logo Display** – Display ASCII/loaded logo from file on startup.

---

## 🛠 Tech Stack

| Technology | Logo |
|------------|------|
| Java | ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) |
| Java Collections API | ![Collections](https://img.shields.io/badge/Java%20Collections-007396?style=for-the-badge&logo=java&logoColor=white) |
| Java 8 Date/Time API | ![Java Time](https://img.shields.io/badge/Java%20Time%20API-007396?style=for-the-badge&logo=java&logoColor=white) |
| Console UI | ![Terminal](https://img.shields.io/badge/Console%20UI-000000?style=for-the-badge&logo=windows-terminal&logoColor=white) |
| Logger (System.out) | ![Logger](https://img.shields.io/badge/Logger-System.out-blue?style=for-the-badge) |

---

## 🔄 System Flow
1. **JVM Starts** → Display **ABC Travels Logo** from file.
2. Show **Menu Options**:
   - Register Admin  
   - Login  
   - Plan Journey  
   - Reschedule Booking  
   - Exit
3. **Admin Registration** → Save details in a `List<Map>` structure.
4. **Login Validation** → Increment `failedCount` on invalid login, lock account if >5 attempts.
5. **Journey Planning** → Validate source, destination, travel date & seat availability.
6. **Fare Calculation**:
   - Base Fare × Number of Passengers
   - If **Weekend** → Add ₹200 surcharge
   - Apply GST (Configurable %)
7. **Booking Confirmation** → Redirect to home screen.
8. **Rescheduling** → Update travel date in stored booking record.
9. **Exit** → End application.

---

## 📦 Modules
- **Admin Management**
- **Journey Planning & Booking**
- **Fare Calculation with Weekend Surcharge**
- **Rescheduling**
- **Account Lock & Security**
- **Error Handling & Logging**
- **Logo Loading from File**

---

## ⚙️ Setup & Execution

### 1️⃣ Clone the repository
```bash
git clone https://github.com/muchurammahesh/ABC-Travel-Booking-System.git
cd ABC-Travel-Booking-System

2️⃣ Compile

javac -d bin src/com/abc/travel/*.java

3️⃣ Run

java -cp bin com.abc.travel.Main


---

📂 Folder Structure

ABC-Travel-Booking-System/
│── src/com/abc/travel/
│   ├── Main.java               # Application entry point
│   ├── AdminService.java       # Admin registration & login
│   ├── JourneyService.java     # Booking & rescheduling
│   ├── FareCalculator.java     # Fare logic
│   ├── DataStore.java          # In-memory storage
│   ├── LoggerUtil.java         # Logging utility
│   └── LogoLoader.java         # Loads logo from file
│
│── resources/
│   └── logo.txt                # Company logo
│
└── README.md


---

👨‍💻 Author

Muchuram Mahesh
