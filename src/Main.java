public class Main {

    public static void main(String[] args) {
        Bus bus = new Bus();
        Bus bus2 = new Bus();
        bus.enterPassenger(8);
        System.out.println("현재 승객 수 = " + bus.getPassengerCount());
        System.out.println("잔여 승객 수 = " + (Bus.MAX_PASSENGER - bus.getPassengerCount()));
        System.out.println("요금 확인 = " + bus.getPrice());
        bus.changeFuel(-50);
        System.out.println("주유량 = " + bus.getFuel());
        bus.changeFuel(10);
        System.out.println("상태 = " + bus.getStatus());
        System.out.println("주유량 = " + bus.getFuel());
        bus.changeStatus("운행");
        bus.enterPassenger(45);
        bus.enterPassenger(5);
        System.out.println("현재 승객 수 = " + bus.getPassengerCount());
        System.out.println("잔여 승객 수 = " + (Bus.MAX_PASSENGER - bus.getPassengerCount()));
        System.out.println("요금 확인 = " + bus.getPrice());
        bus.changeFuel(-55);
        System.out.println("주유량 = " + bus.getFuel());
        System.out.println("상태 = " + bus.getStatus());
    }
}
