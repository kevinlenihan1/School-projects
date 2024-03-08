                            #Kevin Lenihan - IT140
inventory = []

print("You are in your apartment and see on the news that a sea monster is coming towards the city, you need to help where will you go?\nApothecary shop?\nWeapons shop?\nWalmart?")
user_choice1 = input("\nWhich location will you travel to?")

if user_choice1 == "Walmart":
    inventory.append("Baseball bat")
    inventory.append("Food")
    print("\nYou chose to go to the", user_choice1, ", you gathered a", inventory[0], "and", inventory[1])
    print(inventory, "Is now in your inventory")
elif user_choice1 == "Apothecary shop":
    inventory.append("Healing Potion")
    inventory.append("Spell book")
    print("\nYou chose to go to the", user_choice1, ", you gathered a", inventory[0], "and", inventory[1])
    print(inventory, "Is now in your inventory")
elif user_choice1 == "Weapons shop":
    inventory.append("A gun")
    inventory.append("Ammunition")
    print("\nYou chose to go to the", user_choice1, ", you gathered a", inventory[0], "and", inventory[1])
    print(inventory, "Is now in your inventory")
else:
    print("\nThat is not an option, the sea monster has attacked the city while you tried to find", user_choice1)

print("\nNow that you have traveled to", user_choice1, "and gathered", inventory[0], "and", inventory[1], "where will you go next?\nMartial arts academy\nPolice station\nMilitary base")
user_choice2 = input("\nWhich location will you travel to?")

if user_choice2 == "Martial arts academy":
    inventory.append("A black belt")
    inventory.append("Connor McGregor")
    print("\nYou chose to go to the", user_choice1, ", you gathered a", inventory[0], "and", inventory[1])
    print(inventory, "Is now in your inventory")
elif user_choice2 == "Police station":
    inventory.append("Body armor")
    inventory.append("The police force")
    print("\nYou chose to go to the", user_choice1, ", you gathered a", inventory[0], "and", inventory[1])
    print(inventory, "Is now in your inventory")
elif user_choice2 == "Military base":
    inventory.append("A tank")
    inventory.append("The navy seals")
    inventory.append("A helicopter")
    print("\nYou chose to go to the", user_choice1, ", you gathered a", inventory[0], "and", inventory[1], "and", inventory[2])
    print(inventory, "Is now in your inventory")
else:
    print("\nThat is not an option, the sea monster has attacked the city while you tried to find", user_choice2)

print("\nYou have now traveled to", user_choice1, "and", user_choice2, ". You can now go to the beach and try to fight the sea monster or travel to the docks. where will you go next?\nBeach\nDocks")
user_choice3 = input("\nWhich location will you travel to?")

if user_choice3 == "Beach":
    if len(inventory) < 5:
        print("\nYou were not prepared enough and were defeated by the sea monster and the city is destroyed!")
    elif len(inventory) > 4:
        print("\nYou were well equipped and able to defeat the sea monster and save the city!\nYou win!")
elif user_choice3 == "Docks":
    inventory.append("Rope")
    print("You chose to go to the", user_choice3, ", you gathered a", inventory[0])
    print(inventory, "Is now in your inventory")
    print("The last place you can go now is to a ship to fight the sea monster, do you want to do it?\nYes\nNo")
    user_choice4 = input("Last chance to back out, will you fight?")
    if user_choice4 == "Yes":
        print("\nYou were well equipped and able to defeat the sea monster and save the city!\nYou win!")
    elif user_choice4 == "No":
        print("\nBecause you didn't want to fight the sea monster, it has attacked the city and destroyed everything.\nYou lose")

else:
    print("\nThat is not an option, the sea monster attacked the ciy while you tried to find", user_choice3)
