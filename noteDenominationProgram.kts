import java.util.Scanner
fun main( ) {
    val currencyNotes = arrayOf(5000, 1000, 500, 100, 50, 20, 10, 5,2, 1)
//Taking Currency Value Input from User
    val read = Scanner(System.`in`)
    println("Enter Currency value :")
    var amount = read.nextInt()
    println("Currency value = $amount")
    var possibleNotes = 0
// Iterating thorough notes array
    for (i in currencyNotes.indices) {
        //Checking if value is greater than note value
        if (amount >= currencyNotes[i]) {
            val remainingAmount = amount % currencyNotes[i]
            val count = amount - remainingAmount
            val noteCount = count / currencyNotes[i]
            possibleNotes += noteCount //Calculating Minimum Possible Notes
            println ("${currencyNotes[i]} rupee notes = $noteCount")
            // updating remaining Amount in "amount" variable
            amount = remainingAmount
        }
    }
    //Print Minimum Possible Notes
    println(" Possible Notes = $possibleNotes")
}
main()