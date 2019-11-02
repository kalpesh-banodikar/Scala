import scala.collection.mutable.ArrayBuffer
object collectionclasses extends App{

    //ArrayBuffer 
    var arr=ArrayBuffer[Int]()
    arr+=1
    arr+=2
    arr+=3
    arr+=4
    arr.append(5)
    arr.append(6)
    arr.append(7)
    arr.append(8)
    arr-=4
    arr-=5 -=6
    arr--=Array(7,8)

    println(arr)
    
    //List
    var li =List(9,8,7,6)
    var lis=10+:li
     lis =List(1,2)++:li
    println(lis)

    //Vector
    val vec=Vector('a','b','c','d','e')
    val vect=vec:+'f'
     for(n<-vect)println(n)

     //Map
     val m=collection.mutable.Map("a"->"A","b"->"B","c"->"C","d"->"D")
     m+=("e"->"E")
     m-=("e","d")
     println(m)
     
     //Set
     val s=scala.collection.mutable.Set(1,2,3,4)
     s+=5
     s-=5
     s.add(6)
     s.remove(6)
     s++=Vector(5,6,7)
     s--=Vector(5,6,7)
     println(s)

}