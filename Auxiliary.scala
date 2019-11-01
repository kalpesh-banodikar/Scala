class normal(fn:String, ln:String)
{
  var mn:String=""
  def show()  
    {  
        println("First name: " + fn);  
        println("Middle name: " + mn);  
        println("Last name: " + ln);  
          
    }  
      
  def this(fn:String, ln:String,mn:String)
  {
    
    this(fn,ln)
    this.mn=mn
    
  }
}
object Auxiliary
{
  def main(args:Array[String])
  {
    var n=new normal("First","Middle","Last")
    n.show()
  }
}