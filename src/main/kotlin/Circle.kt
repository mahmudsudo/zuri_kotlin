import  kotlin.math.PI
import kotlin.math.pow

class Circle( ) {
    var Radius :Double= 1.0;
    private var Color :String= "red";
    constructor( Radius :Double ) : this(){
        this.Color = "red"
        this.Radius=Radius
    }
    constructor(Radius :Double,Color :String):this(){
        this.Radius=Radius;
        this.Color=Color
    }

    public  fun getArea() :Double{

        return  PI*(Radius.pow(2));
    }
    public fun getCircumference():Double {
        return  2*PI*Radius;
    }
    public fun getDescription():String{
        return "Radius : ${this.Radius} ,Color : ${this.Color}"
    }
    fun getColor() : String {
        return this.Color;
    }
}