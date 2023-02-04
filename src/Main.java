public class Main {

    public static void main(String[] args) {
        Bus bus = new Bus();
        Bus bus2 = new Bus();
        bus.enterPassenger(8);
        System.out.println("현재 승객 수 = " + bus.passengerCount);
        System.out.println("잔여 승객 수 = " + (Bus.MAX_PASSENGER - bus.passengerCount));
        System.out.println("요금 확인 = " + bus.price);
        bus.changeFuel(-50);
        System.out.println("주유량 = " + bus.fuel);
        bus.changeFuel(10);
        System.out.println("상태 = " + bus.status);
        System.out.println("주유량 = " + bus.fuel);
        bus.changeStatus("운행");
        bus.enterPassenger(45);
        bus.enterPassenger(5);
        System.out.println("현재 승객 수 = " + bus.passengerCount);
        System.out.println("잔여 승객 수 = " + (Bus.MAX_PASSENGER - bus.passengerCount));
        System.out.println("요금 확인 = " + bus.price);
        bus.changeFuel(-55);
        System.out.println("주유량 = " + bus.fuel);
        System.out.println("상태 = " + bus.status);
        Taxi taxi = new Taxi();
//        Taxi taxi2 = new Taxi();
        System.out.println("주유량 = " + taxi.fuel);
        System.out.println("상태 = " + taxi.status);
        taxi.enterPassenger(2, 2, "서울역");
        System.out.println("탑승 승객 수 = " + taxi.passengerCount);
        System.out.println("잔여 승객 수 = " + (Taxi.MAX_PASSENGER - taxi.passengerCount));
        System.out.println("기본 요금 확인 = " + Taxi.BASIC_PRICE);
        System.out.println("목적지 =  " + taxi.destination);
        System.out.println("목적지 까지 거리 =  " + taxi.destDistance);
        System.out.println("지불 할 요금 = " + (Taxi.BASIC_PRICE + (taxi.destDistance-Taxi.BASIC_DISTANCE) * Taxi.DISTANCE_PRICE));
        System.out.println("상태 = " + taxi.status);
        taxi.changeFuel(-80);
        System.out.println("주유량 = " + taxi.fuel);
        taxi.pay();
        taxi.enterPassenger(5, 2, "서울역");
        taxi.enterPassenger(3, 12, "구로디지털단지역");
        System.out.println("탑승 승객 수 = " + taxi.passengerCount);
        System.out.println("잔여 승객 수 = " + (Taxi.MAX_PASSENGER - taxi.passengerCount));
        System.out.println("기본 요금 확인 = " + Taxi.BASIC_PRICE);
        System.out.println("목적지 =  " + taxi.destination);
        System.out.println("목적지 까지 거리 =  " + taxi.destDistance);
        System.out.println("지불 할 요금 = " + (Taxi.BASIC_PRICE + (taxi.destDistance-Taxi.BASIC_DISTANCE) * Taxi.DISTANCE_PRICE));
        taxi.pay();
        taxi.changeFuel(-20);
        System.out.println("상태 = " + taxi.status);
    }
}
