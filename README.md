# 🚗 Vehicle Engine Simulation System (Single File Version)

A clean and beginner-friendly Java application that demonstrates how different engine types (Petrol, Diesel, Electric) can be used within a vehicle using object-oriented programming concepts — all implemented in a single file for simplicity.

---

## ✨ Features

- 🔌 Supports Petrol, Diesel, and Electric engines  
- 🔄 Easy switching between engine types  
- 🧩 Demonstrates abstraction and polymorphism  
- 📦 Entire project in one file  
- 🧪 Simple execution  

---

## 📁 Project Structure


VehicleSystem.java


---

## 🛠️ Technologies Used

- ☕ Java (Core)  
- 🧱 Object-Oriented Programming  

---

## 🧠 Concepts Covered

- Abstraction  
- Polymorphism  
- Encapsulation  
- Loose Coupling  
- Basic Dependency Injection  

---

## 💻 Complete Code (Single File)

```java
interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol engine started");
    }
}

class DieselEngine implements Engine {
    public void start() {
        System.out.println("Diesel engine started");
    }
}

class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Electric engine started");
    }
}

class Vehicle {
    private Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Vehicle is moving");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {

        // Choose engine type here
        Engine engine = new PetrolEngine();
        // Engine engine = new DieselEngine();
        // Engine engine = new ElectricEngine();

        Vehicle vehicle = new Vehicle(engine);
        vehicle.drive();
    }
}
▶️ How to Run
javac VehicleSystem.java
java VehicleSystem
📌 Sample Output
Petrol engine started
Vehicle is moving
⚙️ Configuration / Customization

Modify this line to switch engines:

Engine engine = new ElectricEngine();
📚 Key Learnings
Clean OOP design
Flexibility using interfaces
Real-world simulation basics
Writing scalable code
🚀 Future Enhancements
Split into multiple classes/files
Add Spring Framework for DI
Add REST API
Add unit testing
🤝 Contributing
Fork the repo
Create a branch
Commit changes
Open a pull request
📄 License

MIT License

👨‍💻 Author

Durgesh Tiwari
Student | Java Learner 🚀
