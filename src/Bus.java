public class Bus {

    static final int MAX_PASSENGER = 30;
    private int passengerCount;
    private int price = 0;
    private static int number = 1;
    private int fuel;
    private int currentSpeed;
    private String status;

    public Bus() {
        System.out.println(number + "번 버스객체 만들어짐!");
        number++;
        this.fuel = 100;
        this.status = "운행";
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getNumber() {
        return number;
    }


    public static void setNumber(int number) {
        Bus.number = number;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void changeFuel(int num) {
        this.fuel += num;
        if(num < 0) {
            changeStatus("차고지행");
        }
        if(this.fuel < 10) {
            System.out.println("주유가 필요합니다.");
        }
    }
    public void changeStatus(String status) {
        if(status.equals("차고지행")) {
            this.status = "차고지행";
            this.passengerCount = 0;
            this.price = 0;
        }else {
            this.status = "운행";
        }
    }

    public void enterPassenger(int num) {
        if(MAX_PASSENGER >= this.passengerCount + num && this.status.equals("운행")) {
            this.price += 1000 * num;
            this.passengerCount += num;
        }else {
            System.out.println("최대 승객 수 초과");
        }
    }




}
