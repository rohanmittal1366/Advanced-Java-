 RMI - Application 

//Interface (Server.client)
package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;



public interface Hello extends Remote {

    String sayHello() throws RemoteException;
}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
//Server
package example.hello;
        
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;


import java.rmi.server.UnicastRemoteObject;
        
public class Server implements Hello {

    public Server() {
    }

    public String sayHello() {
        return "Hello, world!";
    }

    public static void main(String args[]) {

        try {
            Server obj = new Server();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hello", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
// Client.java (Hello.java - sayhello())
package example.hello;

import java.rmi.registry.LocateRegistry;


import java.rmi.registry.Registry;

public class Client {

    private Client() {
    }

    public static void main(String[] args) {

        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Hello stub = (Hello) registry.lookup("Hello");
            String response = stub.sayHello();
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
