object controlstructures extends App{
    //if else
    var x=3          
    var y=5
    var min=if(x<y) x else y
    println(min)

    //For Loop
    val num =List(1,2,3)
    for(n<- num) println(n)
    
    //Foreach
    num.foreach(println)

    //For Expression
    val nums=List(1,2,3,4)
    val double=for(n<-nums)yield n*2
    print(double)

    //Match Expression
    val i=5
  i match{
        case 1=>println("Monday")
        case 2=>println("Tuesday")
        case 3=>println("wednesday")
        case 4=>println("Thursday")
        case 5=>println("Friday")
        case 6=>println("Saturday")
        case 7=>println("Sunday")
    }

}