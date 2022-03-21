val summInRub = 10_000
val kopInRub = 100
val amount = summInRub * kopInRub
var percentSummForCard = 0.0
val cardName = "Visa"
val maxTransfer = 150000 * kopInRub
val maxTransferVKPay = 15000 * kopInRub
val maxAmountForMasterMaestro = 75000 * kopInRub
val minAmount = 300
val minAmountInCop = minAmount * kopInRub
var percent = 0.0

fun main(finishResult: Double): Boolean {
    val finishResult = amountCalculation(cardName, amount)
    if (finishResult == -1.0) {
        return false
        stopMetod()
    }
    val finishResultInRub: Double = (finishResult / 100)
    println("Общая комиссия от суммы $summInRub оставила $finishResultInRub руб.")
    return true

}

fun amountCalculation(cardName: String, amount: Int): Double {
    when (cardName) {
        "Mastercard", "Maestro" -> percentSummForCard = mastercardMaestro(amount)
        "Visa", "Мир" -> percentSummForCard = visaMir(amount)
        "VK Pay" -> if (amount >= maxTransferVKPay) {
            stopMetod()
        }
    }
    return percentSummForCard

}

fun mastercardMaestro(amount: Int): Double {
    val summForPercent = 20 * kopInRub
    val minPercent = 0.6

    if (amount > maxTransfer) {
        percent = -1.0
    } else
        if ((amount > minAmountInCop) && (amount < maxAmountForMasterMaestro)) {
            percent = percent
        } else percent = ((amount / 100 * minPercent) + summForPercent)
    return percent

}

fun visaMir(amount: Int): Double {
    val comissionPercent = 0.75
    val minComission = 35 * kopInRub
    val percentSumm = (amount / 100 * comissionPercent)
    percent = percentSumm

    if (amount > maxTransfer) {
        percent = -1.0
    } else {
        if (percentSumm < minComission) {
            percent = minComission.toDouble()
        }
    }
    return percent

}

fun stopMetod() {
    println("Сумма превышает суточный лимит")
    System.exit(0)
}
