public class Stopwatch{

    /**
     * <p>Stopwatch class</p>
     * @author maria
     * @param startTime start timer time
     * @param stopTime stop timer time
     */
    private long startTime;
    private long stopTime;

    /**
     <p>starting the stop watch </p>
     */
    public void start(){
        startTime = System.nanoTime();
    }

    /**
     <p>stopping the stop watch </p>
     */
    public void stop()
    {     stopTime = System.nanoTime(); }

    /**
     <p>calc time </p>
     @return time
     */
    public long time(){
        return (stopTime - startTime);
    }
    /**
     <p>morph time to string  </p>
     @return string
     */
    public String toString(){
        return "elapsed time: " + time() + " nanoseconds.";
    }
    /**
     <p>main function </p>
     @param args arguments of main
     */
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        // Starting stopwatch before the method call
        stopwatch.start();

        // Stopping stopwatch after the method call
        stopwatch.stop();
        System.out.println("Stopwatch stopped");
        System.out.println(stopwatch.toString());
    }


}
