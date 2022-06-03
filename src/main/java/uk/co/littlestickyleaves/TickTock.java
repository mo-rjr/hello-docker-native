package uk.co.littlestickyleaves;


/**
 * Says Tick Tock for one minute
 */
public class TickTock {

    public static void main(String[] args) {
        
        long SECOND = 1000L;
        long counter = 0;

        while (counter < 60 * SECOND) {
            try {
                Thread.sleep(SECOND);
                System.out.println("Tick");
                Thread.sleep(SECOND);
                System.out.println("Tock");
                counter += 2 * SECOND;
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(ex);
            }
        }
    }
}