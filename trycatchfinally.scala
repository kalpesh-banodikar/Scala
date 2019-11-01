object trycatchfinally extends App{
try
{
    var a=50/0
}
catch
{
    case x:ArithmeticException=>{
        println("can't divide number by zero")
    }
}
finally{
    println("Finally")
}
}