import scala.io.StdIn.readInt
import scala.collection.mutable.ArrayBuffer
object Bubble extends App
{
    var arr= ArrayBuffer[Int]()
    var num:Int=readInt()

    var element:Int=0
    for(l<-1 to num)
    {
        element=readInt()
        arr.append(element)
    }
    var len=arr.length
    for(i<-0 to len-1)
    {
        for(j<-0 to len-1)
        {
            if(arr(i)<arr(j))
            {
                var temp=arr(i)
                arr(i)=arr(j)
                arr(j)=temp
            }
        }
    }
    println(arr)
}