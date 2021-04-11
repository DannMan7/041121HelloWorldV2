typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    println("Hello World")
    // Declarations
    var number:Int
    number = 10;
    number = 20



    val names = arrayListOf("John","Jane", "Mary")
    println(names[1])

    val employees: EmployeeSet

    val employee1 = Employee("Jon Doe", 500)
    employee1.name = "John Jones"
    val employee2: Employee
    val number2 = 100

    if(number < number2) {
        employee2 = Employee("Jane Smith", 400)
    }
    else {
        employee2 = Employee("Mike Watson", 150)
    }

}
class Employee(var name: String, val id: Int)