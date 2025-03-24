package org.example


assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert  3.intdiv(2) == 1 // использование чисел как int as java
assert 10  % 3 == 1
assert  2 ** 3 == 8

def result1 = (int) (3/2) // приведение типа
def result2 = (3/2) as Integer // тоже приведение
println result2

assert 130 * result2 === 130 // Сравнение по ссылке поэтому не работает использовать == и реализовывать в классах Comparable
