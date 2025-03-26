package org.example

def list = [1, 2, 3, 4]

println 'for: ----'

for(value in list){ // groovy перебор по элементам списка
    println value
}
println 'for: ----'

for(value in 0..<list.size()){ // groovy перебор значений из range
    println value
}
println 'upto: ----'

0.upto(list.size()) {
    println it
}
println 'downto: ----'

list.size().downto(0) {
    println it
}
println 'times: ----'

list.size().times{ // тоже что и upto, но не включая последний элемент
    println it
}
println 'step: ----'

0.step(5, 2) { // тоже что и upto, но с заданным шагом 2
    println it
}


