import java.util.Map;

public class Taxi extends PublicTransport{

    final static int MAX_PASSENGER = 4;
    String destination; // 목적지
    final static int BASIC_DISTANCE = 1; //기본거리
    int destDistance; //목적지까지 거리
    final static int BASIC_PRICE = 3000; //기본 요금
    final static int DISTANCE_PRICE = 1000; // 거리당 요금

    int money;

    public Taxi() {
        System.out.println(number + "번 택시 생성");
        number++;
        this.fuel = 100;
        this.status = "일반";
    }


    @Override
    public void changeStatus(String status) {
        if(status.equals("일반")) {
            init();
        }
    }

    public void enterPassenger(int passengerCount, int destDistance, String destination) {
        if(this.passengerCount + passengerCount > MAX_PASSENGER) {
            System.out.println("최대 승객 수 초과");
            return;
        }
        this.passengerCount += passengerCount;
        this.destDistance = destDistance;
        this.destination = destination;
        this.status = "운행중";
    }
    public void changeFuel(int num) {
        this.fuel += num;

        if(this.fuel < 10) {
            System.out.println("주유필요");
            this.status = "운행불가";
        }
    }

    public void pay() {
        money += Taxi.BASIC_PRICE + (this.destDistance-Taxi.BASIC_DISTANCE) * Taxi.DISTANCE_PRICE;
        System.out.println("누적 요금 = " + money);
        init();
    }

    public void init() {
        this.passengerCount = 0;
        this.destDistance = 0;
        this.destination = null;
        this.status = "일반";
    }
}
