fun main(){

    for(i in 1..100 step 2){
        when{
            i < 50 -> println("Before 50: $i")
            else -> println("After 50: $i")
        }
    }
}