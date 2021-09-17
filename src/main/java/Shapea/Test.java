package Shapea;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Shape shape = null;
        Scanner scanner = new Scanner(System.in);
        String shapeName = "";
        while (true){
            shapeName = scanner.next();
            if(shapeName.equals("exit"))
                break;
            try{
                shape = ShapeFactory.createShapeByName(shapeName);

                shape.draw();
                shape.erase();
            }catch (UnsupportedShapeException e){
                System.out.println(e.toString());
            }
        }
    }
}
