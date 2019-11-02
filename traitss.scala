trait details
{
    var name:String="asdf"
    val rollno=40
    def details()
}
class student extends details
{
    var marks=20
    override val rollno: Int = 50
    def show()
    {
        println(s"marks: $marks")
    }
    def details()
    {
        println(s"Name: $name" )
        
        println(s"RollNo: $rollno")
    }
}

object traitss extends App{
    var s=new student()
    s.details()
    s.show()
}