public class ThreadPeriodic extends Thread {
    
    private boolean isRunning = false;
    
    @Override
    public void run() {
        while(isRunning == false) {
            System.out.println("Produsele  au stocul  "+ Produs.stoc);
            try {
                Thread.sleep(15);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void stopThread() {
        isRunning = true;
    }
}