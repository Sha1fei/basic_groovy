package org.example

def surname = 'Ivanov' // одинарные кавычки не поддерживают интерполяцию
def string = "Ivan $surname"
def string2 = 'Ivan "Hi!"'
def string3 = """Ivan ${getPrefix('Test')}""" //многострочная строка
def string4 = '''Ivan'''
def string5 = /Ivan $surname/
def string6 = $/Ivan/$
char value = 'H';
def getPrefix(String name){
    "prefix"  + name
}

println string3[2] //второй символ строки
println string3[-1] //последний символ строки
println string3[1..3] //с первого по второй символ
println string3 * 3 //три раза продублирует строку
println string3 - 'Iv' //удалит первое совпадение 'Iv' из string3
