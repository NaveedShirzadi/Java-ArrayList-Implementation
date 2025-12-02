// ArrayQueueDriver.java
// Starter file for the Queue portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runQ2_CallCenterQueue).

public class ArrayQueueDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        //runQ1_PrintQueue();
        //runQ2_CallCenterQueue();
        //runQ3_ThemeParkRideLine();
        //runQ4_CustomerServiceTickets();
        //runQ5_TaskSchedulingQueue();
        //runQ6_CheckoutLine();
        //runQ7_MessageQueueChatApp();
        //runQ8_PrintSpoolingBurst();
        runQ9_RoundRobinService();
    }

    // Q1 – Print Queue
    private static void runQ1_PrintQueue() {
        // TODO: Implement task Q1 here.
        System.out.println("=== Q1 – Print Queue ===");

        ArrayQueue<String> queue = new ArrayQueue<>();
        // Enqueue print jobs
        queue.offer("LabReport.pdf (3 pages)");
        queue.offer("Resume.docx (1 page)");
        queue.offer("Slides.pptx (10 pages)");
        queue.offer("Notes.txt (5 pages)");

        System.out.println("Initial print queue:");
        System.out.println("Jobs waiting: " + queue.size());

        int jobNum = 1;

        // Dequeue and simulate printing
        while (!queue.isEmpty()) {
            String job = queue.peek();
            System.out.println("\nPrinting job " + jobNum + ": " + job);
            queue.poll();
            jobNum++;
            System.out.println("Jobs remaining: " + queue.size());
        }
        System.out.println("\nAll jobs printed. Queue is empty.");
    }

    // Q2 – Call Center Queue
    private static void runQ2_CallCenterQueue() {
        // TODO: Implement task Q2 here.
        System.out.println("=== Q2 – Call Center Queue ===");
        ArrayQueue<String> calls = new ArrayQueue<>();
        calls.offer("Caller 1");
        calls.offer("Caller 2");
        calls.offer("Caller 3");
        while (!calls.isEmpty()) {
            System.out.println("Answering: " + calls.peek());
            calls.poll();
        }
    }

    // Q3 – Theme Park Ride Line
    private static void runQ3_ThemeParkRideLine() {
        // TODO: Implement task Q3 here.
        System.out.println("=== Q3 – Theme Park Ride Line ===");
        ArrayQueue<String> line = new ArrayQueue<>();
        line.offer("Rider A");
        line.offer("Rider B");
        line.offer("Rider C");
        while (!line.isEmpty()) {
            System.out.println("Boarding: " + line.peek());
            line.poll();
        }
    }

    // Q4 – Customer Service Tickets
    private static void runQ4_CustomerServiceTickets() {
        // TODO: Implement task Q4 here.
        System.out.println("=== Q4 - Customer Service Tickets ===");
        ArrayQueue<Integer> tickets = new ArrayQueue<>();
        tickets.offer(101);
        tickets.offer(102);
        tickets.offer(103);
        while (!tickets.isEmpty()) {
            System.out.println("Handling ticket: " + tickets.peek());
            tickets.poll();
        }
    }

    // Q5 – Task Scheduling Queue
    private static void runQ5_TaskSchedulingQueue() {
        // TODO: Implement task Q5 here.
        System.out.println("=== Q5 – Task Scheduling Queue ===");

        ArrayQueue<String> tasks = new ArrayQueue<>();
        tasks.offer("Task A");
        tasks.offer("Task B");
        tasks.offer("Task C");

        while (!tasks.isEmpty()) {
            System.out.println("Running: " + tasks.peek());
            tasks.poll();
        }
    }

    // Q6 – Checkout Line at a Store
    private static void runQ6_CheckoutLine() {
        // TODO: Implement task Q6 here.
        System.out.println("=== Q6 – Checkout Line at a Store ===");

        ArrayQueue<String> customers = new ArrayQueue<>();
        customers.offer("Customer 1");
        customers.offer("Customer 2");
        customers.offer("Customer 3");

        while (!customers.isEmpty()) {
            System.out.println("Checking out: " + customers.peek());
            customers.poll();
        }
    }

    // Q7 – Message Queue in a Chat App
    private static void runQ7_MessageQueueChatApp() {
        // TODO: Implement task Q7 here.
        System.out.println("=== Q7 – Message Queue in a Chat App ===");

        ArrayQueue<String> messages = new ArrayQueue<>();
        messages.offer("Hi!");
        messages.offer("How are you?");
        messages.offer("Let's meet later.");

        while (!messages.isEmpty()) {
            System.out.println("Delivering message: " + messages.peek());
            messages.poll();
        }
    }

    // Q8 – Print Spooling with Burst of Jobs
    private static void runQ8_PrintSpoolingBurst() {
        // TODO: Implement task Q8 here.
        System.out.println("=== Q8 – Print Spooling with Burst of Jobs ===");

        ArrayQueue<String> queue = new ArrayQueue<>();

        System.out.println("Burst of jobs arriving...");
        queue.offer("Job 1");
        queue.offer("Job 2");
        queue.offer("Job 3");
        queue.offer("Job 4");
        System.out.println("Queue size after burst: " + queue.size());

        while (!queue.isEmpty()) {
            System.out.println("Printing: " + queue.peek());
            queue.poll();
            System.out.println("Remaining: " + queue.size());
        }
    }

    // Q9 – Round-Robin Service (Single Queue Version)
    private static void runQ9_RoundRobinService() {
        // TODO: Implement task Q9 here.
        System.out.println("=== Q9 – Round-Robin Service ===");

        ArrayQueue<String> people = new ArrayQueue<>();
        people.offer("A");
        people.offer("B");
        people.offer("C");

        int rounds = 5;
        int currentRound = 1;

        while (currentRound <= rounds && !people.isEmpty()) {
            String person = people.poll();
            System.out.println("Round " + currentRound + ": Serving " + person);

            // They still need service → re-enqueue
            people.offer(person);
            currentRound++;
        }

        System.out.println("Finished round-robin simulation.");
    }
}
