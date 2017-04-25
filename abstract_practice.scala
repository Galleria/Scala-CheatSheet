

object abstract_practice {

    def main(args:Array[String]){  
        var hand = new Hand("hand","body")
        //println( hand.name , hand._type , hand.atk )
        hand.attack()
        hand.skill()
    }  

    abstract class Weapon(name:String,_type:String){            
        var atk:Int = 0  
        def skill()                          
        def attack(){  
            println("Attack!!" , atk)  
        }  
    }  

    class Hand(name:String,_type:String) extends Weapon(name,_type){
        atk = 1
        def skill(){
            println("Pound")
        }
    }

}
