package app;

import logic.PointController;
import model.Point;


public class PointApplication {
    public static void main(String[] args) {
        Point point = new Point(5,3);

        PointController controller = new PointController();
        final int moveX = 1;
        final int moveY = 0;
        System.out.println(point);

        switch(moveY){
            case 0:
                controller.addY(point);
                controller.addY(point);
                break;
            case 1:
                controller.minusY(point);
                controller.minusY(point);
                break;
            default:
                System.out.println(point);
        }

        switch(moveX){
            case 0:
                controller.addX(point);
                controller.addX(point);
                break;
            case 1:
                controller.minusX(point);
                controller.minusX(point);
                break;
            default:
                System.out.println(point);
        }

        System.out.println(point);

    }
}
