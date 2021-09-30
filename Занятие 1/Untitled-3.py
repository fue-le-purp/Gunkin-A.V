# -- coding: utf-8 --

age=16
nm='Иван'
if age>0 and age<75:
    if age>=16:
        if nm is 'Иван':
            print('Ошибка вы Иван')
        else:
            print('Поздрвляем вы поступили в ВГУИТ')
    else: 
        print('Сначала нужно окончть школу!')
        print(16-age,'еще лет учиться в школе')
else: 
    print('Ошибка в age')