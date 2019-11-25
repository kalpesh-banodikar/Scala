import scala.collection.mutable._
object Gen extends App
{
   val stack=new Stack[Int]
   stack.push(1)
   stack.push(2)
   stack.push(3)
   stack.pop()
   println(stack)
}