
public class Main{
    public static void main(String[] args){
        Corridore corridoreA = new Corridore("Corridore A");
        Corridore corridoreB = new Corridore("Corridore B");

        
        corridoreA.start();
        corridoreB.start();

        try{
            
            corridoreA.join();
            corridoreB.join();
        }catch(InterruptedException e) {
            System.out.println("Il thread principale è stato interrotto.");
            Thread.currentThread().interrupt();
        }

        System.out.println("Gara terminata!");
    }
}