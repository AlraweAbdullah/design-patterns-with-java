## Exercise: Refactoring `DirectionService` with the State Pattern

Look at the code in the `problem/DirectionService` class.  
This is the class that powers our **mapping app**. It provides two methods:

- Calculating the **estimated time of arrival (ETA)**
- Getting the **direction** between two points

### Task

1. **Identify the problems** in the current implementation.
2. **Refactor the code** to use the **State Pattern**.
3. What are the **benefits** of the new implementation?

### Benefits of the New Implementation
- **Improved Maintainability**: Adding new travel modes becomes easier and safer by creating new concrete classes rather than modifying existing code.


- **Separation of Concerns**: `DirectionService` only manages the current state (travel mode) and delegates behavior to the state objects, improving code organization.


- **Scalability**: New travel modes can be added without changing the core logic, making the system more flexible and easier to extend in the future.


- **Polymorphism**: Each travel mode class implements the same interface (`TravelMode`), allowing for consistent method calls regardless of the specific mode, making the code cleaner and more flexible.

