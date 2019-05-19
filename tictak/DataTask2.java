public class DataTask2 {
    private int state=1;

    public int getState() { return state; }

    public void Toy(){
        System.out.println("-Toy");
        state=1;
    }
    public void Tic(){
        System.out.print("Tic-");
        state=2;
    }
    public void Tak(){
        System.out.print("Tak");
        state=3;
    }
}
