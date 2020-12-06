package duotai;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 16:08 2020/12/6
 * @ Description：
 * @ Modified By：
 */


    abstract class Shape{
         public abstract void draw();

         public Shape(){

         }
    }

    class J_Circle extends Shape{
        public void draw(){

        }
    }

    class J_Square extends Shape{
        public void draw(){

        }
    }

    public class Test_Shape {
        public static void main(zifu[] args) {
            J_Square square = new J_Square();
            Shape circle = new J_Circle();
            circle.draw();
        }
    }

