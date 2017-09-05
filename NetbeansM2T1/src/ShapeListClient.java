
import java.rmi.*;

import java.rmi.server.*;

import java.util.Vector;

public class ShapeListClient {

    public static void main(String args[]) {

        System.setSecurityManager(new RMISecurityManager());

        ShapeList aShapeList = null;

        try {

            aShapeList = (ShapeList) Naming.lookup("//bruno.ShapeList");

            Vector sList = aShapeList.allShapes();

        } catch (RemoteException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Client: " + e.getMessage());
        }

    }

}
