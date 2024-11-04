data class Hello(val name:String){
    fun greeting():String{
        return "Hello ${this.name}"
    }
}