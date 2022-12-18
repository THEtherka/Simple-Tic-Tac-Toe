fun main() {
    val annualIncomes = mutableListOf<Int>()
    val pTaxes = mutableListOf<Int>()
    val taxes = mutableListOf<Double>()
    val numberOfCompanies = readln().toInt()
    var maxTax: Double
    var maxTaxNum: Int
    for (i in 0 until numberOfCompanies) {
        annualIncomes += readln().toInt()
    }
    for (i in 0 until numberOfCompanies) {
        pTaxes += readln().toInt()
    }
    for (i in 0 until numberOfCompanies) {
        taxes += annualIncomes[i].toDouble() * pTaxes[i].toDouble()/100
    }
    maxTax = taxes[0]
    maxTaxNum = 1
    for (i in 1 until numberOfCompanies) {
        if (taxes[i] > maxTax){
            maxTax = taxes[i]
            maxTaxNum =  i+1
        }
    }
    println(maxTaxNum)
}