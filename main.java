public class main {
    public static void main(String[] args) {
       
        Job1 job1 = new Job1();

        job1.title = "Fix Leaking kitchen tap";
        job1.description = "Replace damaged tap washer";
        job1.cost = 120.50;
        job1.status = false; 

    }
    
}

class Job1 {
    String title;
    String description;
    double cost;
    boolean status;
}
