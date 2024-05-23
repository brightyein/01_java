package main.java.com.ohgiraffers.section05;

public class Application {
    public static void main(String[] args) {

        Job[] jobList = new Job[5];

        try {
            jobList[0] = new Job(1, "backend");
            jobList[1] = new Job(2, "frontend");
            jobList[2] = new Job(3, "devops");
            jobList[3] = new Job(4, "DBA");
            jobList[4] = new Job(5, "PM");
            jobList[5] = new Job(6, "PL");
            jobList[6] = new Job(7, "BogData");

            // ArithmeticException 가 발생해도 실행이 멈추지 않도록 예외처리
        } catch (ArithmeticException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Job job : jobList) {
            System.out.println(job);
        }
    }
}
