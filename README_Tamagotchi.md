# 🐵 Tamagotchi Simulator – Java Project

This project is a digital pet simulator inspired by the classic Tamagotchi. It was developed entirely in Java for a school assignment using object-oriented principles and console interaction. The system simulates a monkey-like digital creature named **Nico**, who expresses needs, moods, and reacts according to user decisions.

---

## 🎯 Objective

The goal of the project is to simulate the full life cycle of a Tamagotchi-style character, allowing the user to interact with it through:

- Feeding  
- Sleeping  
- Exercising  
- Observing its reactions and eventual death due to age or health conditions

---

## 🛠️ Technologies Used

- Java (JDK 8 or higher)
- BlueJ IDE
- Console-based interaction (no GUI)

---

## 📂 Project Structure

```
📁 Tamagotchijava/
│
├── Tamagotchi.java         // Contains attributes and methods of the pet
├── TamagotchiDesejo.java   // Controls random desires (sleep, hunger, boredom)
├── Principal.java          // Runs the simulation loop
├── README.md               // Project documentation (this file)
├── [OPTIONAL] Video.mp4    // Demonstration video (3 minutes max)
└── [BlueJ config files]
```

---

## 👤 About the Character

The Tamagotchi is named **Nico**, a little monkey with a simple personality and expressive behavior. Nico can feel:

- 💤 **Sleepy** → Sleeps and ages one day  
- 🍽️ **Hungry** → Eats and gains or loses weight  
- 🏃 **Bored** → Exercises and loses weight  

Nico also expresses **moods**:

- 😄 Happy → Well-fed and rested  
- 😢 Sad → Too thin or sleep-deprived  
- 😡 Angry → Overweight or close to old age  

---

## 🔁 Main Rules & Behaviors

- If Nico **doesn’t sleep 5 times**, he sleeps automatically.
- If Nico reaches **15 days old**, he dies of age.
- If Nico reaches **0 kg**, he dies of malnutrition.
- If Nico exceeds **20 kg**, he explodes.
- After running, Nico eats a lot automatically.
- After walking, Nico becomes hungry.

---

## 👨‍💻 How to Use

1. Open the project in **BlueJ**.
2. Run the `Principal.java` class.
3. Follow the console prompts to interact with Nico.
4. Observe how Nico evolves (or dies!) based on your choices.

---

## 💬 Example Console Output

```
Name: Nicollas
Age: 4 days
Weight: 8 kg
Times without sleep: 1
Humor: happy

The Tamagotchi is hungry!
1 - Eat a lot
2 - Eat a little
3 - Don't eat
Your choice: _
```

---

## 🎥 Video Demonstration

A short video is included in the final delivery showing:
- Class structure
- At least 2–3 interactions with Nico
- Explanation of main logic

---

## 📌 Author

**Nicollas Freitas**  
Student of Computer Science  
Polícia Federal Internship — Digital Forensics Lab  
*Contact information available upon request*

---

## 📜 License

This project is part of an academic exercise and not intended for commercial use.
