package day8;

public class Task1 {
    public static void main(String[] args) {
        //String operation

        long startTime = System.currentTimeMillis();
        String resultString = "";

        for (int i = 0; i <= 20000; i++){
            resultString = resultString + i + " ";
        }

        System.out.println(resultString);
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");

        //StringBuilder operation

        startTime = System.currentTimeMillis();
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i <= 20000; i++){
            resultBuilder.append(i).append(" ");
        }

        System.out.println(resultBuilder);
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");
    }
}
