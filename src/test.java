


public class test {
    public static void main(String[] args) {


        Tank customTank = new Tank(-20, -30, 200);
        customTank.goBackward(50);
        customTank.printPosition();
        customTank.goBackward(-50);
        customTank.printPosition();
        customTank.goBackward(20);
        customTank.printPosition();
        customTank.turnRight();
        customTank.goForward(-30);
        customTank.printPosition();
    }


}


