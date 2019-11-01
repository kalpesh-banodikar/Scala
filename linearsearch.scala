import scala.io.StdIn.readInt
object linearsearch extends App{
  var search=readInt()
  var ranges=0
  var elements=List(1,2,10,3,9,4,12,5)

  for(ranges<-0 to elements.length-1)
  if(elements(ranges)==search)
  {
      print("found at " +  ranges +" position" )
      
  }


}