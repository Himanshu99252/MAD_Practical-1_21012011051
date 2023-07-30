class car(var carobjn:Int,var type:String,var model:String,var originalprice:Long,var currentprice:Long,var owner:String,var milesdrive:Long){
    init {
        println("Creating car class object car$carobjn in next line")
        println("Object of class is created and Init is Called.")
    }
    fun getcarprice():Long{
        return originalprice
    }
    fun getcarinformation():Array<String>
    {
        var a1= arrayOf<String>(type,model,owner)
        return a1
    }
    fun getoriginalprice():Long
    {
        return originalprice
    }
    fun getcurrentprice():Long
    {
        return currentprice
    }
    fun displaycarinfo(){
        println("----------")
        var a=getcarinformation()
        println("Car Information:${a[0]},${a[1]}")
        println("Car Owner:${a[2]}")
        println("Miles Drive:$milesdrive")
        println("Original Car Price:$originalprice")
        println("Current Car Price:$currentprice")
        println("----------")
    }
}

fun main()
{
    var no:Int=0;
    no=no+1
    var obj1=car(no,"TOYOTA","2018",100000,98950,"Himanshu",565)
    obj1.displaycarinfo()
    no=no+1
    var obj2=car(no,"TOYOTA","2019",450000,350000,"Aditya",250)
    obj2.displaycarinfo()

    println("************ ArrayList of Car *****************")
    no=no+1
    var obj3=car(no,"SUZUKI","2017",1080000,1079000,"Himanshu",100)
    no=no+1
    var obj4=car(no,"FORD","2020",4000000,3998000,"Krish",200)

    var person=arrayOf<car>(obj3,obj4)
    for(i in person)
    {
        i.displaycarinfo()
    }
}
