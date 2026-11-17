# OOP Coding Test — Review and Reflection

## 1. My Original Examination Grade

### Task 1 — 35/40
**My mark:**

**Why I awarded this mark:**
I did create a workshop class with name,capacity and hashset to store student IDs.
i also made the correct constructor for each.
in main i had a scanner to read the workshop name and capacity and made the workshop object.

### Task 2 — 12/40
**My mark:**

**Why I awarded this mark:**
i did write that a hashset doesn't store duplicates already so i understood its usse
however i didnt actually have something else to check if i had someone registered before
accepting it.
i did have an addStudent method in my work shop the problem was it want used.
i had set up a loop in main but didnt finish setting up the way to process student ids in it.


### Task 3 — 2/20
**My mark:**

**Why I awarded this mark:**
i created a hashset to store student ids but i didnt complete the report or validation.
i didnt add methods to calculate the total registrations, display those registrations or calculate the remaining spaces.
i didnt add a validation for blank ids at all.


**Total self-assessed grade:** 49/100

## 2. Corrections and Improvements

Describe two or three important problems you identified
in your original code. Explain what you changed and
why it works now.

my fields weren't properly encapsulated, hashset was wrong.
studentIds wasn't private so other classes could modify the hashset.

private HashSet<String> studentIds;

my addStudent wasn't finished so it was not used.
it also had no duplicate checks or whether workshop was full.

i should have passed the studentID from main to the register student method using a parameter.
i had to add a check for blank ids,duplicates and capacity before adding student.
im not sure if it's the best method but i have it returning a string to tell main if registration worked.

my loop only displayed registration number and was completely unfinished it didn't ask for ids or process the registration.

i had to add the registerStudent method in the loop that takes the scanner input so the workshop class processes it.

## 3. Reflection

**What did you understand during the examination
but struggle to implement?**

**What was the most important thing you learned
from correcting your code?**

**What would you do differently in your next
coding test?**


I understood that a HashSet could be used to prevent duplicate student IDs because it does not allow duplicate values. 
I also understood that I needed to use methods in my Workshop class to handle registrations.

However, I struggled with connecting the Scanner input in Main.java to the methods in Workshop.java as i failed to set up 
hashset right, i got caught up in it and failed to move on with attempting other tasks even with hashset not working.

the most important thing i learned was how to properly set up and use a hashset so i can pass information 
between classes using method parameters instead of creating another Scanner inside my Workshop class.

In my next coding test, I would try not to spend too much time stuck on one problem. If I was having difficulty with something like setting up a HashSet,
I would move on to another part of the assignment and come back to it later. I would also test smaller parts of my code individually before trying to complete the whole program.

---

## Review lab assessment and mark recovery

What is the name of your Workshop
tech
How big is the capacity?
3
How many registrations do you want?
4
workshop name: tech
Capacity: 3
Number of registration attempts: 4
Registration #1
kane
Student kane was registered
Registration #2
kane
Student already registered
Registration #3

Student cant register as blank
Registration #4
mark
Student mark was registered
tech
[mark, kane]
Total number of registrations accepted: 2
Total number of registrations rejected: 2
1

this is an example run of the corrected program.



The **review lab** is graded separately out of 20 marks:

| Review criterion | Maximum marks |
|---|---:|
| Original self-assessment and supporting evidence | 4 |
| Explanation of mistakes and Java concepts | 6 |
| Corrections and improvements | 4 |
| Testing and demonstration | 4 |
| Reflection | 2 |
| **TOTAL** | **20** |

You can recover **up to 30% of the marks you lost** in the original examination. The actual amount depends on your review lab grade. Your lecturer's examination grade, **not your self-awarded mark**, is used in the calculation.

**Marks recovered = (100 − original exam mark) × 0.30 × (review lab mark ÷ 20)**

**Revised exam mark = original exam mark + marks recovered**

For example, an original examination mark of 40/100 and a review lab mark of 16/20 would recover 14.4 marks, giving a revised result of **54.4/100**.

The aim is to show that you understand your mistakes and can explain your improvements. Simply copying a working solution does not demonstrate this understanding.

