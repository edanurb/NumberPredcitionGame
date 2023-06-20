package com.example.numberguessinggame.gamemain

import java.util.*


fun main() {
    var numberOfPrediction=3
    val number=(0..101).random()

    while(numberOfPrediction>0){
        print("Toplam $numberOfPrediction tahmin hakkınız bulunmakta 0-101 arasında bir sayı tahmin edin: ")
        try {
            val prediction=getInput()

            if(prediction==number){
                println("Tebrikler kazandınız.")
                return
            }
            else if(prediction<number){
                println("Daha büyük.")
            }
            else if(prediction>number){
                println("Daha küçük.")
            }
            numberOfPrediction--

        }catch (e: InputMismatchException) {
            print("Lütfen sadece bir tam sayı giriniz.")
            continue
        }
    }
    println("Hakkınız bitti sayı $number dı.")

}
fun getInput(): Int{
    val reader = Scanner(System.`in`)
    var integer:Int = reader.nextInt()
    return  integer
}
