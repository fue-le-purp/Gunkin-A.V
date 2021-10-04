def visYears():
    year = int(input("Введите год: "))

    if (year % 4 == 0)and(year % 100 != 0)and(year % 400 != 0):
        return "Да"
    else:
        return "Нет"

print(visYears())