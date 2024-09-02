    class person{
        var name : String
        var age : Int
        
        constructor(x:String,y:Int){
            this.name = x
            this.age = y
        }

        constructor(x:String,){
            this.name = x
            this.age = 0
        }

        constructor(){
            this.name = "Rahul"
            this.age = 39
        }
    fun intro(){
        print("my name is $name and age is $age")
    }
    fun main(){
        var a=person("riya",90)
        a.intro()
        var b=person()
        b.intro()
        var c=person("hema")
        c.intro()
    }    
