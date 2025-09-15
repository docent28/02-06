//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите 1-ое число: ")
    val chast01 = readln()
    print("Введите 2-ое число: ")
    val chast02 = readln()

    var chetNechet = false

    val chast01All = chast01 + chast02
    if (chast01All.toInt() % 2 == 1) {
        println("Нечетное число - $chast01All")
        chetNechet = true
    }

    val chast02All = chast02 + chast01
    if (chast02All.toInt() % 2 == 1) {
        println("Нечетное число - $chast02All")
        chetNechet = true
    }

    if(!chetNechet) {
        println("Нечетное число создать невозможно")
    }
}
