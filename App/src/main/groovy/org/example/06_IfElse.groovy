package org.example

static def checkBoolean (def x){
    if (x){
        println true
    }
}

def customMap = new HashMap<>()
customMap.put(1, 'Valentin');

def value = "one 1 two 22 three 333"
def regexGroovy = /(\w+) (\d+)/
def matcherGroovy = value =~ regexGroovy

class Pet {
     boolean asBoolean(){
        return true
    }
}

checkBoolean(true); // как в java передается boolean
checkBoolean(customMap); // groovy - не пустая Collection/Map
checkBoolean(matcherGroovy); // groovy - Matcher
checkBoolean('Valentin'); // groovy - не пустая строка
checkBoolean(1); // groovy - не ноль number/char
checkBoolean(new Pet()); // groovy - Reference имеет метод

