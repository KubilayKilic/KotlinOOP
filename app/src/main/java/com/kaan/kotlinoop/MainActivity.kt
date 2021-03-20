package com.kaan.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //sınıflar, sınıflardan objeler üretmek
        //kendi sınıflarını yazmak
        //modellerle çalışmak(internetten veri çekmek.)
        var myUser = User("Duncan", 23)
        //user sınıfından myUser adında obje oluşuturuldu.
        myUser.name = "Paul"
        myUser.age = 17
        println(myUser.age.toString())
        println(myUser.name)
        println(myUser.information())


        //encapsulation

        var stilgar = Fremen("Stilgar Ben Fifrawi", "Arrakis", 50)
        println(stilgar.age.toString())
        println(stilgar.returnBookName("Kaan"))
        println(stilgar.returnBookName("kaan"))

        //inheritance
        //superFremen, fremenin her yaptığını yapabilir ayrıca act yapbilir.

        var chani = SuperFremen("Chani Kynes", "Arrakis", 20)
        println(chani.name)
        println(chani.returnBookName("Kaan"))
        chani.act()

        //polymorphism

        //static polymorphism

        var math = Math()
        println(math.sum())
        println(math.sum(3,4))
        println(math.sum(3,4,5))

        //dinamic polymorphism

        val animal = Animal()
        animal.sing()

        val buz = Dog()
        buz.test()
        buz.sing()

        //abstract & interface
        //obje oluşturulamayacak sınıf, soyut sınıf, inherit için kullanılır

        //var myPeople = People()

        var myPiano = Piano()
        myPiano.brand ="Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()

        //Lambda expressions
        //bir fonksiyonu tek bir satırda yazmak. hemen input alıp output vermek için bir gösterim

        fun printString(myString : String) {
            println(myString)
        }

        printString("test string")

        //lambda text
        val testString = {myString : String -> println(myString)}

        testString("lambda string")

        //çarpma işlemi

        val multiply_lambda = {a: Int, b: Int -> a * b}
        println(multiply_lambda(5,4))

        val multipl_lambda_2 : (Int, Int) -> Int = {a,b -> a * b}
        println(multipl_lambda_2(9,9))

        //async işlemlerde (int veri indirirken)
        //bir işlem uzun sürerken onu beklemeyip, diğer işlemlerin devam etmesi için

        //callback function, listener func, completion func diye isimleri vardır

        fun downloadFremen(url: String, completion : (Fremen) -> Unit) {
            //url -> download
            //data
            val jamis = Fremen("Jamis", "Arrakis", 54)
            completion(jamis)
        }
        downloadFremen("fremenfromplanetarrakis.com", {fremen ->
            println(fremen.name)
            println(fremen.age)
        })

    }
}