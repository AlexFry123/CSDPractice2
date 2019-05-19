public class WorkerTask2 extends Thread{
    private int id;
    private DataTask2 data;

    public WorkerTask2(int id, DataTask2 d){
        this.id = id;
        data = d;
        this.start();
    }

    @Override
    public void run(){
        super.run();
            if(id==1){
                while(data.getState() != 1){
                    yield();
                }
                data.Tic();
            }
            else if(id==2){

                while(data.getState() != 2){
                    yield();
                }
                data.Tak();
            }
            else{
                while(data.getState() != 3){
                    yield();
                }
                data.Toy();
            }
    }
}
