# -- coding: utf-8 --

seconds=684654
sec=seconds%60
min=(seconds//60)%60
h=((seconds//60)//60)%24
d=seconds//86400
print(d,':',h,':',min,':',sec)