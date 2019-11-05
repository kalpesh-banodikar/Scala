import scala.io.StdIn.readInt
import scala.collection.mutable.ArrayBuffer

object insertionSort extends App{
var num:Int=readInt()
var arr=ArrayBuffer[Int]()
var element:Int=0
for(i<-0 to num-1)
{
    element=readInt()
    arr.append(element)
}
var j:Int=0
var key:Int=0


for(i<-0 to arr.length-1)
{
    key=arr(i)
    j=i-1
    while(j>=0 && arr(j)>key)
    {
        arr(j+1)=arr(j)
        j=j-1
    }
    arr(j+1)=key
}
println(arr)
}