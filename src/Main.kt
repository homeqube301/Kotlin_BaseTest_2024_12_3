
package example.myapp

import example.myapp.decor.makeDecorations

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
fun main() {
   // buildAquarium()
   // makeFish()
    //makeDecorations()
    //var count = Singleton1()
    //count.increment()
    //count.increment()
    //count.printCount()

    //Singleton.increment()
    //Singleton.increment()
    //Singleton.printCount()

}

fun buildAquarium() {
    val myaquarium = Aquarium(length = 25, width = 25, height = 40)
    myaquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

//class Singleton1 {
//    var count: Int = 0
//
//    fun increment() {
//        count++
//    }
//
//    fun printCount() {
//        println("Count is $count")
//    }
//}
//
//object Singleton {
//    var count: Int = 0
//
//    fun increment() {
//        count++
//    }
//
//    fun printCount() {
//        println("Count is $count")
//    }
//}








 













