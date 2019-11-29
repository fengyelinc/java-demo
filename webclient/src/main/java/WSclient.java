import service.SayHelloImpl;
import service.SayHelloImplService;

public class WSclient {
    public static void main(String[] args) {
        SayHelloImplService factory = new SayHelloImplService();
        SayHelloImpl sayHelloImplPort = factory.getSayHelloImplPort();
        String name = sayHelloImplPort.sayHello("王大壮");
        System.out.println("WS调用成功："+name);
    }
}
