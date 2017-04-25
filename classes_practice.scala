
object classes_practice {

    def main(args:Array[String]){  
        var hand = new Hand("hand","body")
        //println( hand.name , hand._type , hand.atk )
        hand.attack()
        hand.skill()
        
        var blade = new Sword("blade","one-hand",10)
        //println( blade.name , blade._type , blade.atk )
        blade.attack()
        blade.skill()
    }  


    class Hand(name:String,
                _type:String){
        val atk:Int = 1
        
        // final variable can't be overrided from child
        final val authority:String = "me"
        final def call_authority(){
            println("Me!!")
        }

        def attack(){
            println("attack!! damage:",atk)
        }
        def skill(){
            println("pound")
        }
    }

    class Sword(name:String ,
               _type:String ,
               override val atk:Int )
    extends Hand(name,_type){
        //overriding

        override def skill(){
            println("Slash!!")
        }
    }
    
}
