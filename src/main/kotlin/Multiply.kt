class Multiply {
    fun Operation(num: Int):Int {
        var sum=0
        var i=0
        while(i<1000) {
            if(i % num==0) sum += i
            i++
        }
        return sum
    }
}

