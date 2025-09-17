import random

compChoice = random.randint(1, 10)
print(compChoice)
while True:
    userChoice = int(input("Enter a number: "))
    if userChoice > 10 or userChoice < 1:
        print("Enter number b/w 1 to 10")
    if userChoice == compChoice:
        print("Congratulations !!")
        break
    elif userChoice < compChoice:
        print("too low")
    elif userChoice > compChoice:
        print("too high")
