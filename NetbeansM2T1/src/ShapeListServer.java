
import java.rmi.*;

public class ShapeListServer {

    public static void main(String args[]) {

        System.setSecurityManager(new RMISecurityManager());

        try {

            ShapeList aShapeList = new ShapeListServant();

            Naming.rebind("Shape List", aShapeList);

            System.out.println("ShapeList server ready");

        } catch (Exception e) {

            System.out.println("ShapeList server main " + e.getMessage());
        }
    }
}
