import java.util.*;
class process{
    String name;
    String state;
    int id;
    int arrival_time;
    int burst_time;
    int remaining_time;
    int waiting_time;
    int turnaround_time;

    public process(int id, int arrival_time, int burst_time, String name, String state) {
        this.name = name;
        this.state = state;
        this.id = id;
        this.arrival_time = arrival_time;
        this.burst_time = burst_time;
        this.remaining_time = burst_time;
        this.waiting_time = 0;
        this.turnaround_time = 0;
    }

    public void displayInfo(){
        System.out.println("Process ID: " + id);
        System.out.println("Process Name: " + name);
        System.out.println("State: " + state);
        System.out.println("Arrival Time: " + arrival_time);
        System.out.println("Burst Time: " + burst_time);
        System.out.println("Remaining Time: " + remaining_time);
        System.out.println("Waiting Time: " + waiting_time);
        System.out.println("Turnaround Time: " + turnaround_time);
    }
    
}
public class Main {
    public static void main(String[] args) {
        process p1 = new process(1, 0, 5, "Process1", "Ready");
        process p2 = new process(2, 2, 3, "Process2", "Ready");
        process p3 = new process(3, 4, 1, "Process3", "Ready");
        process p4 = new process(4, 6, 2, "Process4", "Ready");

        p1.displayInfo();
        System.out.println();
        p2.displayInfo();
        System.out.println();
        p3.displayInfo();
        System.out.println();
        p4.displayInfo();
    }
}
abstract class task{

    String name;

    task(String name){
        this.name = name;
    }
    void showDetails(){
        System.out.println("Task Name: " + name);
    }
    abstract void execute();
}

class cpuTask extends task{

    cpuTask(String name) {
        super(name);
    }

    
    void execute() {
        System.out.println("Executing CPU Task: " + name);
    }
}