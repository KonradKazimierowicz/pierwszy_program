fun main(args: Array<String>) {



    var zmInt = 1 //int
    var zmLon = 1L //long
    var zmInt2:Int = 10 //int
    var zmLong:Long = 10 //long

    var zmByte: Byte = 4 //byte
    var zmShort: Short = 4 //short

    var zmFloat = 10.2f //float
    var zmDouble = 10.2 //double

    var zmBool = true //bool

    var zmChar = 'a' //char
    var zmString = "Ala ma kota"


    //Stale:
    val stala = 10


    //println("Stala: $stala")

    var tab = arrayOf(4,'h',45,"frqfrq",true)
    for(i in 0..tab.size - 1){
        //print("$i:${tab[i]} ")
    }

    var tab2 = arrayOf<Int>(1,2,5,8,7)
    var tab3 = intArrayOf(1,2,5,8,5,6)
    var tab5: Array<String> = arrayOf("rv","quiwcq")
    var tab6 = charArrayOf('e','f','g')

    var tab7 = IntArray(10)

    var tab8 = Array(5,{i -> i+1 })
    for(el in tab8){
       // print(el)
    }

    //println("--------------------------------------\n")

    for (n in tab2.indices){
        //println("$n: ${tab2[n]}")
    }



    var tab10 = intArrayOf(1,2,3,4)
    for(j in 0..tab10.size - 1){
        println("${tab10[j]} ")
    }

    var tab11: Array<String> = arrayOf("komputer","mac")

    var tab12: Array<Double> = arrayOf(1.55,1.02,1.1)
    var tab13: Array<Float> = arrayOf(16.1f,12.02f,11.13f,10.5f,16.1f,12.02f,11.13f,10.5f,10.5f)
    for(x in 0..tab13.size - 1){
        print("${tab13[x]} ")
    }

    var tab14 = arrayOf(4,'h',45,"frqfrq",true)
    for(p in 0..tab14.size - 1){
        println("${tab14[p]} ")
    }

    for(i in 0..10){
        print("#")
    }
    for (i in 10 downTo 0){
        print("$")
    }
    for (i in 0 until 50){
        if (i%2==0)
            print(i)
    }
    for(i in 0..50 step 2){
        print(i)
    }

}