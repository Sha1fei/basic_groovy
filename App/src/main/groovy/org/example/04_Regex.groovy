package org.example

import java.util.regex.Matcher
import java.util.regex.Pattern

String value = "one 1 two 22 three 333"

String regexJava = "(\\w+) (\\d+)"
String regexGroovy = /(\w+) (\d+)/

Pattern patternJava = Pattern.compile(regexJava)
Pattern patternGroovy = ~regexGroovy

Matcher matcherJava = patternJava.matcher(value)
Matcher matcherGroovy = value =~ regexGroovy

boolean resultJava = matcherJava.matches()
boolean resultGroovy = value ==~ regexGroovy

println resultJava
println resultGroovy

while (matcherJava.find()){
    println matcherJava.group()
    println matcherJava.group(1)
    println matcherJava.group(2)
    println(/----/)
}

matcherGroovy.each {group ->
    println(group[0])
    println(group[1])
    println(group[2])
    println(/----/)
}





