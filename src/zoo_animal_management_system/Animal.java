package zoo_animal_management_system;

public abstract class Animal {
	
	private String name;
    private String healthCondition; // Encapsulation

public Animal(String name, String healthCondition) {
    this.name = name;
    this.healthCondition = healthCondition;
}

// Common behaviors
public void eat() {
    System.out.println(name + " is eating.");
    healthCondition = "Good"; // Eating improves condition
}

public void sleep() {
    System.out.println(name + " is sleeping.");
    // Health stays same after sleep, just rest
}

// Abstract method — implemented differently by each animal
public abstract void makeSound();

// Getters and setters (Encapsulation)
public String getHealthCondition() {
    return healthCondition;
}

public void setHealthCondition(String healthCondition) {
    this.healthCondition = healthCondition;
}

public String getName() {
    return name;
}
}

