import kotlin.math.PI

fun main(){
    val person1=Person("rita",21)
    person1.introduce()
    person1.celebrateBirthday()
    println( person1.age)
    val person2=Person("trish",19)
    person2.introduce()
    println(person2.age)
    person2.celebrateBirthday()
    println(person2.age)
    val car1=Vehicle("TESLA","plaid D",2020)
    car1.drive()
    val user1=Bankaccount(12568762,200.0,3)
    user1.deposit(100.0)
    println(user1.balance)
    user1.withdraw(150.0)
    println( user1.balance)
    user1.withdraw(4000.0)
    val student1=Persons("rita",21,"female")
    student1.speak()
    println(student1.age)
    val student2=Persons("alicia",19,"female")
    student2.speak()
    println(student2.age)
    val member1=BankAccounts(12345678,1000.0,"rita")
    member1.deposit(1000.0)
    member1.withdraw(500.0)
    println(member1.balance)
    member1.withdraw(6000.0)
    member1.checkBalance()
    val dogs=Dog("bosco",3)
    dogs.makesound()
    dogs.eat()
    val birds=Bird("crow",2)
    birds.eat()
    birds.makesound()
    val cats=Cat("molly",1)
    cats.makesound()
    cats.eat()
    val circle1=Circle(3.0,4.0)
    circle1.getarea()
    val circle2=Circle(4.0,5.0)
    circle2.getarea()
    val rectangle1=Rectangle(10.0,5.0)
    rectangle1.getarea()
    val rectangle2=Rectangle(8.0,6.0)
    rectangle2.getarea()
    val triangle1=Triangle(5.0,3.0)
    triangle1.getarea()
    val triangle2=Triangle(4.0,5.0)
    triangle2.getarea()
    

}
//Create a class called Person with properties name and age, and methods introduce() and celebrateBirthday().
// The introduce() method should print a message introducing the person,
// and the celebrateBirthday() method should increment the person's age by 1.
class Person(var name:String,var age:Int){
    fun introduce(){
        println("hi my name is $name and am $age years old nice to meet you")
    }
    fun celebrateBirthday(){
        age++

    }
}
//Create a class called Vehicle with properties make, model, and year, and a method drive().
// The drive() method should print a message indicating that the vehicle is being driven.
class Vehicle(var make:String,var model:String,var year:Int){
    fun drive(){
        println("i am driving a $model ")
    }
}
//Create a class hierarchy for animals. Create a base class called Animal with properties name and age,
// and methods makeSound() and eat(). Create subclasses for different types of animals, such as Dog, Cat, and Bird,
// and override the makeSound() and eat() methods to be appropriate for each subclass.
open class Animals(var name:String,var age:Int){
    open fun makesound(){
    }
    open fun eat(){

    }
}
class Dog(name:String,age:Int):Animals(name,age){
    override fun makesound(){
        println("the dog barks")
    }
    override fun eat(){
        println("eats beef")
    }

}
class Cat(name:String,age: Int):Animals(name,age){
    override fun makesound() {
        println("the cat meows")
    }

    override fun eat() {
        println("drinks milk")
    }
}
class Bird(name: String,age: Int):Animals(name,age){
    override fun makesound() {
        println("bird chirps")
    }

    override fun eat() {
        println("eats grains")
    }
}

//Create a class called BankAccount with properties accountNumber, balance,
// and interestRate, and methods deposit() and
// withdraw(). The deposit() method should add money to the account balance,
// and the withdraw() method should subtract
// money from the account balance. Add validation to the withdraw()
// method to ensure that the balance does not go negative.
class Bankaccount(var accountNumber:Number,var balance:Double,var interestRate:Int){
    fun deposit(amount:Double){
        balance+=amount
    }
    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
        } else {
            println("Not enough money in your account to widthraw $amount,your balance is $balance")
        }
    }
}



//] Create a class named Person with properties for name, age, and gender.
// Add a method named speak that prints "Hello, my name is {name}".
class Persons(private var name:String, var age:Int, var gender:String){
    fun speak(){
        println("Hello,my name is $name")
    }
}

//Create a class named BankAccount with properties for accountNumber, balance, and owner.
// Add methods to deposit, withdraw, and checkBalance.
class BankAccounts(var accountNumber: Number,var balance: Double,var owner:String){
    fun deposit(amount:Double){
        balance+=amount

    }
    fun withdraw(amount: Double){
        if (balance>=amount){
            balance-=amount
        }
        else{
            println("not enough money to withdraw $amount,your balance is $balance")
        }
    }
    fun checkBalance(){
        println("Dear $owner your balance is $balance")
    }
}

//Create a class called Shape with a method getArea(). Create subclasses for different shapes, 
// such as Circle, Rectangle, and Triangle,
// and override the getArea() method to calculate the area of each shape.

open class Shape(){
   open fun getarea(){
        
    }
}

class Circle(var radius:Double,var height:Double):Shape(){
    override fun getarea() {
        var circleArea= PI*radius*radius*height
        println("area of a circle is $circleArea")
    }
}
class Rectangle(var length:Double,var width:Double):Shape(){
    override fun getarea() {
        var rectangleArea = length * width
        println("area of a rectangle is $rectangleArea")
    }

}
class Triangle(var base:Double,var height:Double):Shape(){
    override fun getarea() {
        var triangleArea=0.5*(base*height)
        println("the area of the triangle is $triangleArea")
    }
}