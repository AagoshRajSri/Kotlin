#!/usr/bin/env kotlin



import javax.management.monitor.StringMonitor
import kotlin.text.Typography.section

// import com.sun.jdi.IntegerType

//fun main(){
//    // data types
//    val v = 5
//    val w = "Hello World"
//    val x = 5.2
//    val y: Double = 5.44343
//    val z = true
//    println(v)
//    println(w)
//    println(x)
//    println(y)
//    println(z)
//}

//fun main(){
//    // val vs var -> value is immutable and final/constant, whereas variable is a mutable value
//    var x = "Hello world"
//    x = "oh na na na"
//    println(x)
//}

//}

//}

//fun main(){
//    // arithmetic operators
//    var x = 5
//    x++
//    x += 5
//    val y = 10
//    println(x * y)
//    println(x + y)
//    println(y - x)
//    println(x.toFloat() / y)
//    println(x % y)
//fun main(){
//    // logical operators
//    val x = 2
//    val y = 4
//    val arebothEven = x % 2 == 0 && y % 2 == 0
//    println("Is x an even number? $arebothEven")


//fun main() {
//    // input from user
//    println("Enter a number: ")
//    val input = readln()
//    val inputAsInteger = input.toIntOrNull()
//
//    if (inputAsInteger != null) {
//        val y = 5 + inputAsInteger
//        println("The sum of input: $y")
//    } else {
//        println("Invalid input")
//    }
//}

//fun main(){
//    // elvis operator
//    println("Enter a number: ")
////    val x = readln().toIntOrNull() ?: 1
//    val x = readln().toIntOrNull()?.rem(2)?.equals(0)
////    ?.rem(2) → if not null, does number % 2
////    ?.equals(0) → checks if remainder is 0 (i.e., even number)
//    println("Result : $x")
//}

//fun main(){
//    // if-else condition
//    println("enter a number: ")
//    val input = readln().toIntOrNull()
//
//    if(input != null){
//      val isEven = input % 2 == 0
//       if(isEven){
//           println("The number is even")
//       }else{
//        println("The number is odd")
//       }
//    } else{
//        println("The number is not even")
//    }
//}

//fun main() {
//    // when condition
//    println("Enter your number: ")
//    val input = readln().toIntOrNull()
//
//    if (input != null) {
//        val output = when {
//            input % 2 == 0 -> "The output is even"
//            input < 10 -> "The output is less than 10 and odd"
//            else -> "The output is odd and >= 10"
//        }
//        println(output)
//    } else {
//        println("Enter an integer")
//    }
//}

// shorter version
//fun main(){
//    println("Enter ur number: ")
//    val input = readln().toIntOrNull()
//
//    val output = when (input) {
//        null -> "enter a valid integer"
//        2 -> "thats an even number"
//        3 -> "thats an odd number"
//        else -> "i have no idea what to print"
//    }
//    println(output)
//}
//
//fun main() {
//    // exception
//    println("Enter a number: ")
//    val input = readln()
//
//    val inputAsInteger = try {
//        val num = input.toInt()
//        println("This is a correct format")
//        num
//    } catch (e: NumberFormatException) {
//        println("Invalid format")
//        null
//    }
//
//    val output = when(inputAsInteger){
//        3 -> "its 3"
//        4 -> "its 4"
//        5 -> "its 5"
//        null -> "This is an incorrect format, check again!"
//        else -> "Some other number"
//    }
//
//    println(output)
//}

//fun main() {
//    // arrays
//    println("Enter a number")
//    val input = readln().toIntOrNull()
//    val favoriteNumbers = intArrayOf(1, 2, 3, 4, 5)
//
//    if (input != null) {
//        if (input in favoriteNumbers.indices) {
//            println("Your number is ${favoriteNumbers[input]}")
//        } else {
//            println("Index out of range!")
//        }
//    } else {
//        println("Invalid input")
//    }
//}
//    println(favoriteNumbers[0])
//    println(favoriteNumbers[1])
//    println(favoriteNumbers[3])

//fun main(){
    // loops
//    println("Enter a number of your wish: ")
//    val amountOfNumbers = readln().toIntOrNull() ?: 0
//    var sum = 0
//    var i = 0
//    while (i < amountOfNumbers){
//        println("Please enter your number #${i + 1}")
//        val number = readln().toIntOrNull() ?: continue // (it will directly jump to the loop again wo incrementing
//        sum += number
//        i ++
//    }
//    println("the total sum is $sum")
// }

//fun main(){
//    println("How many numbers will you enter? ")
//    val amountOfNumbers = readln().toIntOrNull() ?: 0
//
//    var numbers = intArrayOf()
//    var i = 0
//    while (i < amountOfNumbers){
//        println("Please enter number #${i + 1}")
//        val number = readln().toIntOrNull() ?: continue
//        numbers += number
//        i++
//    }
//    println("Numbers: ${numbers.contentToString()}")
//}

// a better approach ->
//fun main(){
//    println("How mmany numbers will u enter?")
//    val amountOfNumbers = readln().toIntOrNull() ?: 0
//
//    val numbers = mutableListOf<Int>()
//    var i = 0
//    while ( i < amountOfNumbers ){
//        println("Please enter number #${i + 1}")
//        val number = readln().toIntOrNull() ?: continue
//        numbers.add(number)
//        i++
//    }
//    println("Numbers: $numbers")
//}


// an even better approach
//fun main(){
//    println("how many numbers?")
//    val amountOfNumbers = readln().toIntOrNull() ?: 0
//
//    val numbers = mutableListOf<Int>()
//
//    for (i in 0 until  amountOfNumbers){
//        println("Please enter number #${i + 1}")
//        val number = readln().toIntOrNull() ?: continue
//        numbers.add(number)
//    }
////    println("Numbers: $numbers")
//    for ((index, number) in numbers.withIndex()) {
//        println("Number #${index + 1} $number")
//    }
//}


//fun main(){
//    println("enter a text")
//    val input = readln()
//
//    for(c in input){
//        println(c)
//    }
//}
//
//fun main(){
//    // reversing a string
//    println("enter a text")
//    val input = readln()
//
//    val finalString = buildString {
//        for (i in input.lastIndex downTo 0) {
//            append(input[i])
//        }
//    }
//        println(finalString)
//}

// normal function
//fun main(){
//    println("enter a string: ")
//    val input = readln()
//
//    val finalString = buildString {
//        for(i in input.lastIndex downTo 0){
//            append(input[i])
//        }
//    }
//    println(finalString)
//}

// how we can make re-usable functions
//fun main(){
//    println("Enter a text")
//    val input = readln()
//    val reversed = reversed(input)
//    println(reversed)
//    if(input == reversed(input)){
//        println("that is a palindrome!")
//    }else {
//        println("that is not a palindrome!")
//    }
//}
//
//fun reversed(stringToReverse: String): String{
//    val finalString = buildString{
//        for(i in stringToReverse.lastIndex downTo 0){
//            append(stringToReverse[i])
//        }
//    }
//    return finalString
//}

//fun main(){
//    // extension function
//    val text = "Oggy"
//    println(text.addStars())
//}
//fun String.addStars() : String {
//    return buildString {
//        append("*** ")
//        append(this@addStars)
//        append(" ***")
//    }
//}

//fun main() {
//    // extension fn
//    println("Enter a String")
//    val input = readln()
//
//    println(input.reversedCustom())
//}
//
//fun String.reversedCustom(): String {
//    return buildString {
//        for (i in this@reversedCustom.lastIndex downTo 0) {
//            append(this@reversedCustom[i])
//        }
//    }
//}

//fun main() {
// FUNCTION OVERLOADING
//    println(add(2, 3))         // Int version
//
//    println(add(2.5, 3.5))     // Double version
//}
//
//fun add(a: Int, b: Int): Int {
//    return a + b
//}
//
//fun add(a: Double, b: Double): Double {
//    return a + b
//}

//fun main(){
//    println(call("mom"))
//    println(call("dad", 5))
//}
//
//fun call(str : String) :String{
//    return "calling $str"
//}
//
//fun call(str : String, int : Int) : String{
//    return "called $str, $int times"
//}

// data class
//data class Student(
//    val name: String,
//    val age: Int
//)
//fun main(){
//    val student = Student("Oggy", 20);
//    println(student)
//    println("Hello, ${student.name}")
//}

// class and objects
//class Dog {
//    var name = "Unknown";
//}
//fun main(){
//    val dog1 = Dog();
//    dog1.name = "Bruno";
//    println(dog1.name)
//    val dog2 = Dog();
//    dog2.name = "Tommy";
//    println(dog2.name)
//}

// properties (GETTER AND SETTER)
//class Speaker {
//
//    var volume = 50
//        set(value) {
//            field = value.coerceIn(0, 100)
//        }
//
//    fun showVolume() {
//        println("Current Volume: $volume")
//    }
//}
//
//fun main() {
//
//    val speaker = Speaker()
//
//    speaker.volume = 80
//    speaker.showVolume()
//
//    speaker.volume = 200
//    speaker.showVolume()
//
//    speaker.volume = -20
//    speaker.showVolume()
//}

//INHERITANCE
//open class Animal(
//    val name: String
//) {
//    open fun speak() {
//        println("$name is making a sound.")
//    }
//}
//
//class Dog(name: String) : Animal(name) {
//    override fun speak() {
//        println("$name is barking.")
//    }
//}
//
//fun main() {
//    val dog = Dog("Tommy")
//    dog.speak()
//}



// ABSTRACT CLASS
//abstract class Animal(
//    val name: String
//) {
//    abstract fun speak()
//
//    fun sleep() {
//        println("$name is sleeping")
//    }
//}
//
//class Dog(name: String) : Animal(name) {
//    override fun speak() {
//        println("$name says: Woof!")
//    }
//}
//
//class Cat(name: String) : Animal(name) {
//    override fun speak() {
//        println("$name says: Meow!")
//    }
//}
//
//fun main() {
//    val dog = Dog("Lobo")
//    val cat = Cat("Keo")
//
//    dog.speak()
//    cat.speak()
//
//    dog.sleep()
//    cat.sleep()
//}

// POLYMORPHISM
//abstract class Notification {
//
//    abstract fun send()
//}
//
//class EmailNotification : Notification() {
//
//    override fun send() {
//        println("Sending Email")
//    }
//}
//
//class SMSNotification : Notification() {
//
//    override fun send() {
//        println("Sending SMS")
//    }
//}
//
//fun main() {
//
//    val notifications: List<Notification> = listOf(
//        EmailNotification(),
//        SMSNotification(),
//        EmailNotification()
//    )
//
//    for (notif in notifications) {
//        notif.send()
//    }
//}

// object, companion, factory method
// A Singleton means:
// There will only ever be one instance of this class.
// the keyword "object" creates a singleton

// singleton
//object Database {
//    fun connect() = println("Connecting...")
//}
//class User private constructor(val nickname: String) {
//    // companion object
//    companion object {
//        // factory method
//        fun createGuest(): User {
//            return User(nickname = "Guest");
//        }
//    }
//}
//fun main(){
//    Database.connect()
//    val user = User.createGuest()
//    println(user.nickname)
//}

// Enum - An enum is a fixed list of predefined values.
//enum class AssistantState {
//    IDLE,
//    LISTENING,
//    THINKING,
//    SPEAKING,
//    ERROR
//}
//
//fun updateState(state: AssistantState) {
//    // Prints the enum value
//    println("Current State: $state")
//
//    when (state) {
//        AssistantState.IDLE -> println("Assistant is idle.")
//        AssistantState.LISTENING -> println("Assistant is listening...")
//        AssistantState.THINKING -> println("Assistant is thinking...")
//        AssistantState.SPEAKING -> println("Assistant is speaking...")
//        AssistantState.ERROR -> println("An error occurred.")
//    }
//
//    println()
//}
//
//fun main() {
//    updateState(AssistantState.IDLE)
//    updateState(AssistantState.LISTENING)
//    updateState(AssistantState.THINKING)
//    updateState(AssistantState.SPEAKING)
//    updateState(AssistantState.ERROR)
//}

// sealed classes
// A sealed class is like an enum whose states can carry different kinds of data.
//sealed class Result {
//    object Loading : Result()
//
//    data class Success(val result: String) : Result()
//    data class Error(val error: String) : Result()
//
//fun fetchUser(success: Boolean) : Result {
//    println("Fetching user...")
//    return if (success) {
//        Result.Success("Operation was a success!")
//    } else {
//        Result.Error("Unable to fetch user")
//    }
//}
//}
//fun main(){
//    val result = fetchUser(true)
//    when (result) {
//        is Result.Loading -> println("Loading...")
//        is Result.Success -> println("Successfully fetched user.")
//        is Result.Error -> println("Error fetching user.")
//    }
//}

//sealed class AIMODEL {
//    object thinking: AIMODEL()
//    data class listening(val listen: String) : AIMODEL()
//    data class responding(val response: String) : AIMODEL()
//}
//fun fetchModel(step: Int): AIMODEL {
//    return when (step) {
//        1 -> AIMODEL.thinking
//        2 -> AIMODEL.listening("AI is listening to the USER")
//        3 -> AIMODEL.responding("AI is responding to the USER")
//        else -> AIMODEL.responding("INVALID STEP")
//    }
//}
//fun displayModel(model: AIMODEL){
//    when (model) {
//        is AIMODEL.thinking -> println("Thinking about what the USER said..")
//        is AIMODEL.listening -> println(model.listen)
//        is AIMODEL.responding -> println(model.response)
//    }
//}
//
//fun main(){
//    for(step in 1..3){
//        val model = fetchModel(step)
//        displayModel(model)
//        println("_____________________________")
//    }
//}

// COLLECTIONS - Think of collections as different types of containers.
// map() transforms every element into something else.
// 1 ----
// fun main() {
//    // Create a list of numbers
//    val numbers = listOf(1, 2, 3)
//
//    // Double each number using map
//    val doubled = numbers.map { it * 2 }
//
//    // Print the original list
//    println("Original list: $numbers")
//
//    // Print the doubled list
//    println("Doubled list: $doubled")
//}
// 2 ----
//fun main() {
//    val names = listOf(
//        "oggy",
//        "doggy",
//        "jack"
//    )
//    val upper = names.map { it.uppercase() }
//    println(upper)
//}
// filter() - Keeps only items that satisfy a condition.
// 1 ------
//fun main(){
//    val numbers = listOf(1,2,3,4,5)
//    val even = numbers.filter { it % 2 == 0 }
//    println(even)
//}
// 2 ------
//fun main(){
//    val name = listOf(
//        "John",
//        "Peter",
//        "Marry",
//    )
//    val longNames = name.filter { it.length > 4 }
//    println(longNames)
//}
// find() -
//fun main() {
//    val numbers = listOf(1,2,3,4,5)
//    val result = numbers.find { it == 3 }
//    println(result)
//}
// first() -
//fun main() {
//    val numbers = listOf(1, 2, 3, 4, 5)
//    val result = numbers.first { it > 4 }
//    println(result)
//}
//find() - Returns: null if nothing found, first() - Throws an exception if nothing matches.

// any()
//fun main(){
//    val numbers = listOf(1,2,3,4,5)
//    val answer = numbers.any{
//        it == 4
//    }
//    println(answer)
//}

// all()
//fun main(){
//    val numbers = listOf(2,4,6)
//    val result = numbers.all {
//        it % 2 == 0
//    }
//    println(result)
//}

// sorted()
//data class Person(
//    val name: String,
//    val age: Int
//)
//fun main() {
//    val users = listOf(
//        Person("Oggy", 20),
//        Person("Dooggy", 53),
//        Person("LOLOLOL", 44)
//    )
//    val sorted = users.sortedBy { it.age }
//    println(sorted)
//}

// groupBy()
//data class Student (
//    val name: String,
//    val grade: String
//)
//fun main(){
//    val students = listOf(
//        Student("Rony", "B"),
//        Student("Pony", "C"),
//        Student("Dony", "A")
//    )
//    val grouped = students.groupBy { it.grade }
//    println(grouped)
//}

// associateBy() -converts a list into a Map, where you choose what becomes the key.
//data class User(
//    val id: Int,
//    val name: String
//)
//fun main(){
//    val users = listOf(
//        User(1,"Raj"),
//        User(2,"Oggy")
//    )
//    val map = users.associateBy {
//        it.id
//    }
//    println(map)
//}

// Higher Order Function (HOF) - A function that either:
//takes another function as a parameter, OR
//returns another function.
// 1
//fun perform(
//    action: () -> Unit
//) {
//    action()
//}
//fun main() {
//    perform {
//        println("Hello from lambda!")
//    }
//}
// 2
//fun operate(
//    a: Int,
//    b: Int,
//    operation: (Int, Int) -> Int
//) = operation(a, b)
//
//fun main() {
//    val add = operate(5, 3) { x, y ->
//        x + y
//    }
//    val multiply = operate(5, 3) { x, y ->
//        x * y
//    }
//    println(add)
//    println(multiply)
//}

// scope objects
// let - Do something with an object
// let is commonly used when you want to perform an operation on an object, especially when it might be null.
// example -
//val name = "John"
//
//name.let {
//    println(it.length)
//    println(it.uppercase())
// }

// run - Run some code using this object
// run is useful when you want to use an object's properties and methods without repeatedly writing the object name
// example -
//val person = Person()
//
//person.run {
//    name = "John"
//    age = 25
//    introduce()
//}
//Inside the block, you can directly write:
//
//name
//age
//introduce()
//
//instead of:
//
//person.name
//person.age
//person.introduce()

// with - Work with this object
// with is similar to run.
//The main difference is the syntax.
// val person = Person()
//with(person) {
//    name = "John"
//    age = 25
//    introduce()
//}

// apply - Configure this object
// Use apply when you create an object and want to set up its properties.
// do this
//val person = Person().apply {
//    name = "John"
//    age = 25
//}
// instead of
//val person = Person()
//
//person.name = "John"
//person.age = 25

// also - also do this
// also is useful when you want to perform an additional action without changing the object.
//val numbers = mutableListOf(1, 2, 3)
//    .also {
//        println("Before adding: $it")
//    }
//
//numbers.add(4)

// combined example
//fun main(){
//    // apply
//    val emp = Employee()
//    emp.apply {
//        id = 1
//        name = "Aagosh"
//    }
//    println(emp.id)
//    println(emp.name)
//
//    // let
//    val emp1: Employee = Employee()
//    emp1?.let {
//        println(it.id)
//        println(it.name)
//    }
//
//    // with
//    with(emp){
//        println(name)
//    }
//
//    // run
//    emp.run {
//        val x = name.uppercase()
//        println(x)
//    }
//
//    // also
//    emp.also {
//        println("The name is ${it.name}")
//    }
//}
//class Employee{
//    var id: Int = 0
//    var name: String = ""
//}

//  combined example II
//data class Employee(
//    var id: Int = 0,
//    var name: String = "",
//    var department: String = "",
//    var salary: Double = 0.0
//)
//
//fun getEmployeeFromServer(): Employee? {
//
//    // Pretend this came from an API
//    return Employee(
//        id = 101,
//        name = "Aagosh",
//        department = "Engineering",
//        salary = 80000.0
//    )
//}
//
//fun main() {
//
//    getEmployeeFromServer()
//        ?.let { employee ->
//
//            // We have a valid employee
//            employee.also {
//                println("Employee received: ${it.name}")
//            }
//
//            // Calculate something
//            val summary = employee.run {
//                val monthlySalary = salary / 12
//
//                "$name works in $department " +
//                        "and earns $monthlySalary per month"
//            }
//
//            println(summary)
//
//            // Generate report
//            with(employee) {
//                println("----- EMPLOYEE -----")
//                println("ID: $id")
//                println("Name: $name")
//                println("Department: $department")
//            }
//        }
//}

//  combined example III
//data class Student(
//    var name: String = "",
//    var rno: Int = 0,
//    var section: String = "",
//    var grade: String = ""
//)
//
//fun getStudent(): Student? {
//
//    return Student(
//        name = "Oggy",
//        rno = 1,
//        section = "E",
//        grade = "A"
//    )
//}
//
//fun main() {
//
//    // --------------------------------
//    // LET
//    // --------------------------------
//
//    val student = getStudent()?.let { student ->
//
//        println("Student found: ${student.name}")
//
//        // --------------------------------
//        // ALSO
//        // --------------------------------
//
//        student.also {
//            println("New student joined: ${it.name}")
//        }
//    }
//
//
//    // --------------------------------
//    // RUN
//    // --------------------------------
//
//    student?.run {
//
//        when (grade) {
//            "A" -> println("Excellent grade!")
//            "B" -> println("Good grade!")
//            "C" -> println("Average grade")
//            "D" -> println("Needs improvement")
//            else -> println("Grade not available")
//        }
//
//    }
//
//
//    // --------------------------------
//    // WITH
//    // --------------------------------
//
//    student?.let {
//
//        with(it) {
//
//            println("------ STUDENT ------")
//            println("Name: $name")
//            println("Roll Number: $rno")
//            println("Section: $section")
//            println("Grade: $grade")
//        }
//    }
//
//
//    // --------------------------------
//    // APPLY
//    // --------------------------------
//
//    val newStudent = Student().apply {
//
//        name = "Tom"
//        rno = 2
//        section = "E"
//        grade = "B"
//    }
//
//    println("New student: ${newStudent.name}")
//}

////  combined example IV
//data class AIRequest(
//    var model: String = "",
//    var prompt: String = "",
//    var temperature: Double = 0.0
//)
//
//fun main() {
//    val request = AIRequest()
//        .apply {
//            model = "GPT"
//            prompt = "Explain Kotlin"
//            temperature = 0.7
//        }
//        .also {
//            println("Request created")
//        }
//
//    val promptLength = request.run {
//        prompt.length
//    }
//
//    println(promptLength)
//
//    val response: String? = "Kotlin is awesome"
//
//    response?.let {
//        println("AI Response: $it")
//    }
//}

//Advanced Null Safety
// 1 - !! - Kotlin, I promise this is NOT null. Let me use it as a normal value.
//val name: String? = null
//println(name!!.length)
// But there are situations involving complex code where you may know the value cannot be null even though Kotlin can't prove it.
//That's when !! can sometimes be used.

// 2 - lateinit - I promise I will initialize this variable later.
//class MainActivity {
//    lateinit var database: AppDatabase
//    fun setup() {
//        database = createDatabase()
//    }
//}

// 3 - lazy - Don't create this value until I actually need it.
//val database by lazy {
//    createDatabase()
//}

//lateinit
//Use when:
//initialization genuinely happens later
//you know it will be initialized before use
//you need a var

//lazy
//Use when:
//
//initialization is expensive
//initialization can be delayed
//the value doesn't need to change

// GENERIC - A Generic lets you write code that can work with different data types without rewriting the code.
// Generics let you write code that works with different types safely, while sealed classes let you model a fixed set of possible outcomes/states.
// 1
//fun <T> printValue(value: T){
//    println(value)
//}
//fun main(){
//    printValue("Hello World!")
//    printValue(45)
//    printValue(true)
//    printValue(3.45)
//}

// 2
//class ArrayList<T>(private val array: Array<T>){
//    fun findElement(
//        element: T,
//        foundElement: (index: Int, element: T?) -> Unit
//    ) {
//        for (i in array.indices) {
//            if (array[i] == element) {
//                foundElement(i, array[i])
//                return
//            }
//        }
//            foundElement(-1, null)
//            return
//    }
//}
//fun main(){
//    val util = ArrayList(arrayOf(1, 2, 3, 4))
//    util.findElement(2){
//        index, element -> println("index - $index, element - $element")
//    }
//}

// 3
fun main() {
    val success: Result<AIResponse> =
        Result.Success(
            AIResponse("Hello Oggy!")
        )

    val error: Result<AIResponse> =
        Result.Error(
            "Network timeout"
        )

    val transcript: Result<Transcript> =
        Result.Success(
            Transcript("Hey RAJ")
        )

    processResult(success)
    processResult(error)
    processResult(transcript)
}

sealed class Result<T> {

    data class Success<T>(
        val data: T
    ) : Result<T>()

    data class Error<T>(
        val message: String
    ) : Result<T>()
}

data class AIResponse(
    val text: String
)

data class Transcript(
    val text: String
)

fun <T> processResult(result: Result<T>) {

    when (result) {
        is Result.Success<T> -> {
            println("Success: ${result.data}")
        }
        is Result.Error<T> -> {
            println("Error: ${result.message}")
        }
    }

}













