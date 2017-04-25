Scala Object and Class
- object is for running scala language.
- class is a template (interface / abstract in java).

Define Object/Class
```scala
object name {
    //...
    def main(args:Array[String]){

    }
}

class name {
    //... 
}

//example

//without primary constructor
class Person{
    var id:String = null
    var name:String = null
    var sex:String = null
    var age:Int = 0 

    def callMe(){
        println( id , name , sex , age )
    }
}

//without primary constructor
class Person2(idx:String,namex:String,sexx:String,agex:Int){
    var id:String = idx
    var name:String = namex
    var sex:String = sexx
    var age:Int = agex 

    // secondary constructor
    def this(idx:String,namex:String,sexx:String){
        this.id = idx
        this.name = namex
        this.sex = sexx
        this.age = 0
        // or overloading constructor
        // this( idx ,namex , sexx , 0 )
    }

    def callMe(){
        println( id , name , sex , age )
    }

    //overloading function
    def callMe(text:String){
        println("I'm saying",text)
    }

    //overloading function with different data type
    def callMe(text:Int){
        println("I'm saying Number is :",text)
    }
}

object PersonObject{
    def main(args:Array[String]){
        var p = new Person()
        println( p.id , p.name , p.sex , p.age ) // (null,null,null,0)
        p.callMe() // (null,null,null,0)

        var p2 = new Person2("13700","Ai Ml","Male",2)
        // println( p.id , p.name , p.sex , p.age ) //not working
        p.callMe() // ("13700","Ai Ml","Male",2)
    }
}

//Extends Class
class name(){}
class name extends parent(){}

class Weapon(val namex:String,
            val typex:String){
    val name:String = namex
    val _type:String = typex
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
        println("Pound")
    }
}

class Sword( override val namex:String ,
            override val typex:String ,
            val atkx:Int )
        extends Weapon(namex,typex){
    //overriding

    override val atk:Int = atkx

    override def skill(){
        println("Slash!!")
    }
}
```

Abstract Class
- abstract methods
- abstract constructor
- abstract variables 
```scala
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

def main(args:Array[String]){  
    var hand = new Hand("hand","body")
    hand.attack()
    hand.skill()
}
```

Trait 
- like an interface
- can contain abstract and non-abstract

```scala
trait Printable{  
    def print()  
    def typing(){
        println("Typing!!")
    }
}  
  
trait Showable{  
   def show()  
}  

class A4 extends Printable with Showable{  
    def print(){  
        println("This is printable")  
    }  
    def show(){  
        println("This is showable");  
    }  
}      
```

Scala Class Access modifier
- like a java 
```scala
class name {
    private var x:type = xxx
    protected var y:type = yyy
    var z:type = zzz
}
```

Singleton Object
- Scala don't have a static concept, so scala use Singleton object instead of static.
- Using object keyword instead by class
- No object is required to call methods declared inside singleton object
```scala
object TestSingleton{
    def main(args:Array[String]){
        SingletonObject.hello()
    }
}

object SingletonObject{
    def hello(){
        println("Hello, I'm Singleton")
    }
}
```

Define Function

```scala
// simple no return value
def func_name () {

}

// or return value
def func_name () = {
    x
}

// no return variable
def func_name ( arg : type ){

}

// return variable
def func_name ( arg : type ) : type = {
    x 
}

// function with default arg value
def func_name ( arg1:Int = 0 , arg2:Int = 0):Int= {
    a+b
}

// passinga a function as parameter
functionExample(25, multiplyBy2)
def functionExample(a:Int, f:Int=>AnyVal):Unit = {  
    println(f(a))   // 50        
}  
def multiplyBy2(a:Int):Int = {  
    a*2  
}  

// annoymous function like a lambda in java
var func_name1 = (a:Int,b:Int) => a+b
var func_name2 = (_:Int) + (_:Int)
func_name1( 10 , 10 ) // 20
func_name2( 10 , 10 ) // 20

// function with variable length params
var sum = add(1,2,3,4,5,6,7,8,9)
def add(args: Int*) = {  
    var sum = 0;  
    for(a <- args) sum+=a  
    sum  
}  
```

Variable has 2 types

- mutable
- immutable 

```scala
var mu_data = 100
data = 110 // no error 

val im_data = 100
data = 110 // error
```

There're 2 Data types
- primitive
- dynamic

```scala
var var_name : type 

var pri_data: Int = 100 // primitive
var dy_data = 100 // dynamic

//Array
var arr_name : Array[Type] = new Array[Type](size)
var arr_name = new Array[Type](size)
var arr_name : Array[Type] = new Array(size)
var arr_name = Array(a1,a2,a3,...,an)
```

Primitive data types

| Data type |
|-----------|
| Boolean   |
| Byte      |
| Short     |
| Int       |
| Long      |
| Float     | 
| Double    | 
| Char      |
| String    |
| Array[Type]|
| Any //support all type|
| AnyRef // return from function |
| Null |
| Nothing |

Comment 
- singleline
- multiline
```scala
// single line ...

/*
    multi ...
    lines ...
*/
```
Conditional Statement 
```scala
if(){

}

if(){

}else{

}

//short variable statement
var data = 10 
var var_name = if(data == 10) "yes" else "no" // yes

// short function statement
def func_name ( arg:type ) = if ( ) variable else variable
```

Pattern Matching 
- switch / case in java
```scala

variable match{
    case va_case1 =>
    case va_case2 =>
    case _ => // default case
}

//example
var a = 1  
a match{  
    case 1 => println("One")  
    case 2 => println("Two")  
    case _ => println("No")  
}  

//example
def x(){
    var result = search ("Hello")  // No
}
def search (a:Any):Any = a match{  
    case 1  => println("One")  
    case "Two" => println("Two")  
    case _ => println("No")      
}  
```

For Loop
```scala
while(){

}

do { 

}while()

for( i <- range ){

}

// example
for( i <- 1 to 10 ) // 1-10
for( i <- 1 until 10) // 1-9
for( i <- 1 to 10 if i%2==0 ) // 2 4 6 8 10
for( i <- 1 to 10 by 2) // 1 3 5 7 9
for( i <- 10 to 1 by -2) // 10 8 6 4 2

//yield keyword
// return values from for Loop
var result = for( i <- 1 to 10 ) yield i // 1-10
var result = for( i <- 1 to 10 if i%2==0) yield i // 2 4 6 8 10


//for loop from Iterating Collection
var list = List(1,2,3,4,5,6,7,8,9)
for(i <- list){
    println(i)  
}  

list.foreach{  
    println     // Print each element  
}  

list.foreach(print)  // Print each element  

list.foreach((element:Int)=>print(element+" "))

```

Break For Loop
```scala
import scala.util.control.Breaks._    

// outter loop
breakable {                  // Breakable method to avoid exception  
    for(i<-1 to 10 by 2){  
        if(i==7)   
            break            // Break used here  
        else  
            println(i)  
    }  
} 

// inner loop
for(i <- 1 to 3){  
    breakable {   
        for(j <- 1 to 3){  
            if(i == 2 & j == 2 )   
                break  
            println(i+" "+j)  
        }  
    }  
}
```
