name = input("Hello there, what is your name?")
age = int(input("And how old are you?"))
from datetime import date
current_year = date.today().year

birth_year = current_year - age

print("Hello", name, ", you were born in the year:", birth_year)
