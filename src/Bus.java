public class Bus extends PublicTransport{

    final static int MAX_PASSENGER = 30;
    int price = 0;

    public Bus() {
        System.out.println(number + "번 버스객체 만들어짐!");
        number++;
        this.fuel = 100;
        this.status = "운행";
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
    @Override
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
