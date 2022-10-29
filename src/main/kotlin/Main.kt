import  Circle
fun main() {
   var circle1 = Circle();
    var circle2 = Circle(2.0);
    var circle3 = Circle(2.0,"blue");
    var printOut = """
        circle1:
        Area: ${circle1.getArea()}
        Circumference: ${circle1.getCircumference()}
        Description: Radius: ${circle1.Radius} Color: ${circle1.getColor()}
        Color:${circle1.getColor()}
    
        Circle 2:
        Area: ${circle2.getArea()}
        Circumference: ${circle2.getCircumference()}
        Description: Radius: ${circle2.Radius} Color: ${circle2.getColor()}
        Color:${circle2.getColor()}
    
        Circle 3:
        Area: ${circle3.getArea()}
        Circumference: ${circle3.getCircumference()}
        Description: Radius: ${circle3.Radius} Color: ${circle3.getColor()}
        Color:${circle3.getColor()}
    """.trimIndent()
    println(printOut)
}