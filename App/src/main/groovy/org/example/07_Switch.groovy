package org.example

def x = 10;

// в java можно использовать byte, short, int, char, String, enum
switch (x){
    case Integer: // проверка на принадлежность к class, d groovy не нужно указывать Integer.class
        println 0
        break
    case 10: // проверка equals ==
        println 1
        break
    case ~/\d+/: // проверка на regex
        println 2
        break
    case { it == 10 }: // проверка closure
        println 3
        break
    case new Pet(): // проверка значение вызова метода isCase у класса Pet
        println 4
        break
    case [1, 2, 10]: // проверка совпадение в массиве
        println 5
        break
    default:  // дефолтный значение
        println false
        break
}

if(x in [1, 2, 10]){ //замена перебору
    println 6
}