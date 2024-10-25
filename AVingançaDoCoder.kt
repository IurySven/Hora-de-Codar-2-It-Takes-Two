fun Att1(){

    print("Digite um numero: ")
    var num1 = readln().toDouble()

    print("Digite outro numero: ")
    var num2 = readln().toDouble()

    if(num1 == num2){
        print("O numero $num1 é igual a $num2")
    }else{
        if(num1 > num2){
            print("O numero $num1 é maior que o $num2")
        }else{
            print("O numero $num2 é maior que o $num1")
            println()
        }
    }
}
fun Att2(){

    print("Digite um numero: ")
    var num = readln().toDouble()

    if (num >= 1 ){
        println("Esse numero é POSITIVO!")
    }else if (num <= -1){
        println("Esse numero é NEGATIVO!")
    }else if (num == 0.0){
        println("Esse numero é engual a Zero")
        println()
    }
}
fun Att3(){

    print("Digite o Primeiro numero: ")
    var num1 = readln().toDouble()

    print("Digite o Segundo numero: ")
    var num2 = readln().toDouble()
    while (num2 == num1){
        print("Numero Repetido\nDigite o Segundo numero: ")
        var num2 = readln().toDouble()
    }

    print("Digite o Primeiro numero: ")
    var num3 = readln().toDouble()
    while (num3 == num1 || num3 == num2) {
        print("Numero Repetido\nDigite o Terceiro numero: ")
        var num3 = readln().toDouble()
    }

    if (num1 > num2 && num1 > num3){
        print("O Primeiro numero($num1) é o Maior")
    }
    if (num2 > num1 && num2 > num3){
        print("O Segundo numero($num2) é o Maior")
    }
    if (num3 > num1 && num3 > num2){
        print("O Terceiro numero($num3) é o Maior")
    }

}
fun Att4() {
    var M1: Double = 0.0
    var M2: Double = 0.0

    print("Digite o Primeiro numero: ")
    val num1 = readln().toDouble()

    print("Digite o Segundo numero: ")
    var num2 = readln().toDouble()
    while (num2 == num1) {
        print("Numero Repetido\nDigite o Segundo numero: ")
        num2 = readln().toDouble()
    }

    print("Digite o Terceiro numero: ")
    var num3 = readln().toDouble()
    while (num3 == num1 || num3 == num2) {
        print("Numero Repetido\nDigite o Terceiro numero: ")
        num3 = readln().toDouble()
    }

    if (num1 > num2 && num1 > num3) {
        M1 = num1
        M2 = if (num2 > num3) num2 else num3
    } else if (num2 > num1 && num2 > num3) {
        M1 = num2
        M2 = if (num1 > num3) num1 else num3
    } else if (num3 > num1 && num3 > num2) {
        M1 = num3
        M2 = if (num1 > num2) num1 else num2
    }

    val resul = M1 + M2
    println("A soma dos maiores numeros é: $resul")

}
fun Att5(){

    var numers = mutableListOf<Double>()
    var i:Int = 0

    for (v in 1..6){
        i = v
        print("Digite o $i numero: ")
        val num = readln().toDoubleOrNull()
        if (num != null){
            numers.add(num)
        }else{
            print("numero invalido")
        }
    }

    var soma = numers.sum()

    var resul = soma / i

    println("A media aritimetica desses numeros é: $resul")
}
fun Att6(){

    var numers = mutableListOf<Double>()


    for (i in 1..4){
        print("Digite o $i numero: ")
        val num = readln().toDoubleOrNull()
        if (num != null){
        numers.add(num)

        }else{
            print("numero invalido")
        }
    }
    var prima = numers.get(0)
    var quarto = numers.get(3)
    var maior = numers.max()

    println("O Primeiro numero é $prima\n" +
            "O Ultimo numero é $quarto\n" +
            "E o Maior numero é $maior")

}
fun Att7(){

    var numers = mutableListOf<Double>()

    for (i in 1..6) {
        print("Digite o $i numero: ")
        val num = readln().toDoubleOrNull()
        if (num != null){
            numers.add(num)
        }else{
            print("numero invalido")
        }
    }
    var soma = numers.sum()

    println("A soma dos numeros inferiores a 72 é: $soma")

}
fun Att8(){

    var notas = mutableListOf<Double>()

    for (i in 1..4) {
        print("Digite a $i nota: ")
        val num = readln().toDoubleOrNull()
        if (num!! >= 0 || num <= 10 ){
            notas.add(num)
        }
    }

    var soma = notas.sum()

    var media = soma / 4

    if (media >= 5){
        println("A media é: $media você passou no teste")
    }else{
        println("A media é: $media tente novamente")
    }
}

fun Att9(){

    print("Escreva o ano que voce naceu: ")
    var ano = readln().toIntOrNull()

    var vota = 2024 - ano!!

    if (vota!! <= 18){
        println("Não Pode Votar tá ok?!")
    }else{
        println("Pode Votar Companheiro!")
    }
}

fun Att10(){

    print("Voce é ou 1-Mulher 2-Homem: ")
    val gen = readln().toIntOrNull()
    print("Qual é a sua altura: ")
    val altu = readln().toDouble()

    if (gen == 2) {
        val resul = (72.7 * altu) - 58
        println("O Seu Peso Ideal Deve ser: $resul")
    }else if (gen == 1){
        val resul = (62.1 * altu) - 44.7
        println("O Seu Peso Ideal Deve ser: $resul")
    }
}

fun Att11(){

    print("Digite um numero de 1-4")
    val num1 = readln().toInt()
    print("Digite uma operação (+ - % x:")
    val ope = readln().toString()
    print("Digite outro numero de 1-4")
    val num2 = readln().toInt()

    if (ope == "+"){
        val resul = num1 + num2
        println("R: $resul")
    }else if (ope == "-"){
        val resul = num1 + num2
        println("R: $resul")
    }else if (ope == "%"){
        val resul = num1 + num2
        println("R: $resul")
    }else if (ope == "x"){
        val resul = num1 + num2
        println("R: $resul")
    }
}