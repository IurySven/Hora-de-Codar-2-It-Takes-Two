// escolher projeto
fun main(){

    var progect:Boolean = true


    while (progect == true) {
        print("Selecione um Projeto: ")
        var select = readln().toInt()
        println()

        if (select == 1) {
            Att1()
        }else if (select == 2) {
            Att2()
        }else if (select == 3) {
            Att3()
        }else if (select == 4) {
            Att4()
        }else if (select == 5) {
            Att5()
        }else if (select == 6) {
            Att6()
        }else if (select == 7) {
            Att7()
        }else if (select == 8) {
            Att8()
        }else if (select == 9) {
            Att9()
        }else if (select == 10) {
            Att10()
        }else if (select == 11) {
            Att11()
        }

        //continuar ou encerrar o programa
        print("Continuar? (S/N): ")
        var continuar = readln().toLowerCase()
        if (continuar == "n") {
            progect = false
        }
    }
}