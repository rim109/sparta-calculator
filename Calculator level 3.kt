//fun main() {
//    var cal = Calculator()
//    println("식과 연산자를 차례대로 입력해주세요")
//    println("num1를 입력하시오")
//    var num1 = readln().toInt()
//
//    println("연산자를 입력해주세요")
//    var operator = readln().toString()
//
//    println("num2를 입력하시오")
//    var num2 = readln().toInt()
//
//
//    if(operator == "+") {
//       println(cal.caAdd(AddOperation(),num1,num2))
//    } else if(operator == "-") {
//        // 뺄셈일 때
//        println(cal.caMinus(MinusOperation(),num1,num2))
//    } else if(operator == "*") {
//        // 곱셈일 때
//        println(cal.caMultiple(MultipleOperation(),num1,num2))
//    } else if(operator == "/") {
//        // 나눗셈일 때
//        println(cal.caDivide(DivideOperation(),num1, num2))
//    } else if (operator == "%"){
//        //나머지 연산자일 때
//        println(cal.caReminder(ReminderOperation(),num1, num2))
//    } else {
//        // 잘못된 연산자 일 때
//        println("연산자가 잘못되어 실행되지 않습니다")
//
//    }
//
//}
//
//class Calculator {
//
//    fun caAdd (caAddOperation: AddOperation,num1:Int, num2: Int): Int {
//        return caAddOperation.plus(num1,num2)
//    }
//
//    fun caMinus(caMinusOperation: MinusOperation, num1: Int, num2: Int): Int{
//        return caMinusOperation.minus(num1,num2)
//    }
//
//    fun caMultiple(caMultipleOperation: MultipleOperation, num1: Int, num2: Int): Int{
//        return caMultipleOperation.multiple(num1,num2)
//    }
//
//    fun caDivide(caDivideOperation: DivideOperation, num1: Int, num2: Int): Int{
//        return caDivideOperation.divide(num1,num2)
//    }
//
//    fun caReminder(caReminderOperation: ReminderOperation, num1: Int, num2: Int): Int{
//        return caReminderOperation.remainder(num1,num2)
//    }
//
//}
//
//
//class AddOperation {
//    fun plus(num1: Int, num2: Int): Int {
//        return (num1 + num2)
//    }
//}
//
//class MinusOperation {
//    fun minus(num1: Int, num2: Int): Int {
//        return (num1 - num2)
//    }
//}
//
//class MultipleOperation {
//    fun multiple(num1: Int, num2: Int): Int {
//        return (num1 * num2)
//    }
//}
//
//class DivideOperation {
//    fun divide(num1: Int, num2: Int): Int {
//        return (num1 / num2)
//    }
//}
//
//class ReminderOperation {
//    fun remainder(num1: Int,num2: Int): Int {
//        return (num1 % num2)
//    }
//}
