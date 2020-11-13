public class Nunber {
    private int firstNunber;
    private int secomdNumber;



    public int getFirstNunber() {
        return firstNunber;
    }

    public void setFirstNunber(int firstNunber) {
        this.firstNunber = firstNunber;
    }

    public int getSecomdNumber() {
        return secomdNumber;
    }

    public void setSecomdNumber(int secomdNumber) {
        this.secomdNumber = secomdNumber;
    }

    public int sum(){
        return firstNunber + secomdNumber;
    }

    public float divinee(){

        float val = (float) this.getFirstNunber()/this.getSecomdNumber();

        return  val;
    }

    public Nunber() {

    }

    public Nunber(int firstNunber ,int secomdNumber) {
        this.firstNunber = firstNunber;
        this.secomdNumber= secomdNumber;
    }
}
