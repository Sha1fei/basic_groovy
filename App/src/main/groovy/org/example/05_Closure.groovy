package org.example

import java.util.function.Function
import java.util.stream.Stream


Function<Integer, Integer> func = value -> value + value
Closure closure = { it -> //в  closure можно передавать неограниченное количество параметров
    it + it
}
Stream.of(1, 2, 3, 4) // поведение в java
    .map(func)
    .map(String::valueOf)
    .forEach(System.out::println)

Stream.of(1, 2, 3, 4) // поведение в java
        .map(closure)
        .map(String.&valueOf) // .& аналог :: java
        .forEach(System.out.&println)

static def check(Integer x, Closure closure){
    closure(x)
}

println check(5, closure) // передача готовой closure в функцию
println check(5){ // вынос и передача за скобки closure в функцию (сокращенный вариант)
    it -> it + it
}

