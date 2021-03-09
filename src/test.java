


public class test {
    public static void main(String[] args) {

        Tank justTank = new Tank();
        Tank anywareTank = new Tank(10, 10);
        Tank customTank = new Tank(20, 30, 200);
        Tank justTank2 = new Tank();
        justTank2.goForward(50);
        justTank2.printPosition();
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }


}


