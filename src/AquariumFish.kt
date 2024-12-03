package example.myapp

interface FishColor {
    val color: String
}

interface FishAction{
    fun eat()
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

//interface:FishColorの要素を受け継いだfishColorにGoldColorを代入
class Plecostomus(fishColor: FishColor = GoldColor): FishAction by PrintingFishAction("eat algae"), FishColor by fishColor{
//        override fun eat() {
//            println("eat algae")
//        }
    }



//abstract class AquariumFish {
//    abstract val color : String
//
//}


//class Shark: AquariumFish(),FishAction {
//    override val color = "gray"
//    override fun eat(){
//        println("hunt and eat fish")
//
//    }
//}
//
//class Plecostomus: AquariumFish(), FishAction {
//    override val color = "gold"
//    override fun eat(){
//        println("eat algae ")
//
//    }
//
//}