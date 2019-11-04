public class Test {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round((float) Math.random() * 100000.0f);
        }
        StopWatch time = new StopWatch();
        time.start();
        System.out.println(time.getStartTime());
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        time.stop();
        System.out.println(time.getEndTime());
        double t = time.getElapsedTime();
        System.out.println("Thoi gian thuc thi thuat toan sap xep luc chon la : " + t);
    }
}
