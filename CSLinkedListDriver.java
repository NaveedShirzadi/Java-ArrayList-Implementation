// CSLinkedListDriver.java
// Starter file for the Linked List portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runLL3_CourseWaitlist).

import java.util.Comparator;

public class CSLinkedListDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        //runLL1_Playlist();
        //runLL2_TodoList();
        //runLL3_CourseWaitlist();
        //runLL4_TextEditorLines();
        //runLL5_RecentlyContacted();
        //runLL6_ShoppingListAddAfter();
        //runLL7_BusRouteStops();
        //runLL8_EventScheduleSorted();
        //runLL9_BugTrackerRemoveById();
        //runLL10_PlaylistShuffleCopy();
    }

    // LL1 – Music Playlist Manager
    private static void runLL1_Playlist() {
        // TODO: Implement task LL1 here.
        // See the assignment handout for the scenario description.
        System.out.println("=== LL1 – Music Playlist Manager ===");

        CSLinkedList<String> playlist = new CSLinkedList<>();

        // Add songs to end
        playlist.add("Starboy");
        playlist.add("Blinding Lights");
        playlist.add("Save Your Tears");

        System.out.println("\nInitial playlist:");
        System.out.println(playlist);

        // Insert at index 0 (top of playlist)
        System.out.println("\nAdding 'The Hills' to the top of the playlist...");
        playlist.add(0, "The Hills");
        System.out.println(playlist);

        // Remove a song from the middle
        System.out.println("\nRemoving 'Blinding Lights'...");
        int idx = playlist.indexOf("Blinding Lights");
        if (idx != -1) {
            playlist.remove(idx);
        }
        System.out.println(playlist);

        System.out.println("\nFinal playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i));
        }
    }


    // LL2 – To-Do List with Priorities
    private static void runLL2_TodoList() {
        // TODO: Implement task LL2 here.
        System.out.println("=== LL2 – To-Do List with Priorities ===");

        CSLinkedList<String> todo = new CSLinkedList<>();

        // Regular tasks → end
        todo.add("Do CS homework");
        todo.add("Clean my room");
        todo.add("Send emails");

        System.out.println("\nInitial to-do list:");
        System.out.println(todo);

        // Urgent tasks → front (index 0)
        System.out.println("\nAdding URGENT task: 'Study for exam' at front...");
        todo.add(0, "URGENT: Study for exam");
        System.out.println(todo);

        System.out.println("\nAdding URGENT task: 'Pay bill' at front...");
        todo.add(0, "URGENT: Pay bill");
        System.out.println(todo);

        // Remove completed task by index
        System.out.println("\nRemoving completed task at index 2...");
        if (todo.size() > 2) {
            todo.remove(2);
        }
        System.out.println("Final to-do list:");
        System.out.println(todo);
    }

    // LL3 – Course Waitlist (No Duplicates)
    private static void runLL3_CourseWaitlist() {
        // TODO: Implement task LL3 here.
        // You may add a helper method addIfAbsent(E item) to CSLinkedList if needed.
        System.out.println("=== LL3 – Course Waitlist (No Duplicates) ===");

        CSLinkedList<String> waitlist = new CSLinkedList<>();

        String[] names = {
                "Naveed", "Sara", "Michael", "Jake", "Fred", "Keila", "Andrew"
        };

        for (String name : names) {
            boolean added = waitlist.addIfAbsent(name);
            System.out.println("Trying to add " + name + ": " + (added ? "added" : "already on waitlist"));
        }

        System.out.println("\nFinal waitlist:");
        System.out.println(waitlist);
    }

    // LL4 – Text Editor Line Manager
    private static void runLL4_TextEditorLines() {
        // TODO: Implement task LL4 here.
        System.out.println("=== LL4 – Text Editor Line Manager ===");

        CSLinkedList<String> lines = new CSLinkedList<>();
        lines.add("int x = 0;");
        lines.add("x = x + 5;");
        lines.add("System.out.println(x);");

        System.out.println("\nOriginal lines:");
        printLinesWithNumbers(lines);

        // Insert a new line in the middle (like pressing Enter)
        System.out.println("\nInserting a new line at index 1...");
        lines.add(1, "// increase x by 5");
        printLinesWithNumbers(lines);

        // Delete a line (e.g., index 2)
        System.out.println("\nDeleting the line at index 2...");
        if (lines.size() > 2) {
            lines.remove(2);
        }
        printLinesWithNumbers(lines);
    }

    private static void printLinesWithNumbers(CSLinkedList<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + ": " + lines.get(i));
        }
    }

    // LL5 – Recently Contacted Friends (Move to Front)
    private static void runLL5_RecentlyContacted() {
        // TODO: Implement task LL5 here.
        // You may add a helper method moveToFront(E item) to CSLinkedList if needed.
        System.out.println("=== LL5 – Recently Contacted Friends ===");

        CSLinkedList<String> friends = new CSLinkedList<>();
        friends.add("Naveed");
        friends.add("Sara");
        friends.add("Matthew");
        friends.add("Fred");

        System.out.println("\nInitial list:");
        System.out.println(friends);

        System.out.println("\nMessaging 'Fred' → move to front...");
        friends.moveToFront("Fred");
        System.out.println(friends);

        System.out.println("\nMessaging 'Sarah' → move to front...");
        friends.moveToFront("Sarah");
        System.out.println(friends);

        System.out.println("\nMessaging 'Zara' (not in list) → no change...");
        friends.moveToFront("Zara");
        System.out.println(friends);
    }

    // LL6 – Shopping List: Insert After Item
    private static void runLL6_ShoppingListAddAfter() {
        // TODO: Implement task LL6 here.
        // You may add a helper method addAfter(E target, E newItem) to CSLinkedList if needed.
        System.out.println("=== LL6 – Shopping List: Insert After Item ===");

        CSLinkedList<String> shopping = new CSLinkedList<>();
        shopping.add("Coffee");
        shopping.add("Bread");
        shopping.add("Eggs");

        System.out.println("\nInitial shopping list:");
        System.out.println(shopping);

        System.out.println("\nInsert 'Sugar' after 'Coffee'...");
        boolean ok = shopping.addAfter("Coffee", "Sugar");
        System.out.println("Success? " + ok);
        System.out.println(shopping);

        System.out.println("\nInsert 'Jam' after 'Bread'...");
        ok = shopping.addAfter("Bread", "Jam");
        System.out.println("Success? " + ok);
        System.out.println(shopping);
    }

    // LL7 – Bus Route Stops
    private static void runLL7_BusRouteStops() {
        // TODO: Implement task LL7 here.
        System.out.println("=== LL7 – Bus Route Stops ===");

        CSLinkedList<String> route = new CSLinkedList<>();
        route.add("Stop A");
        route.add("Stop B");
        route.add("Stop C");
        route.add("Stop D");

        System.out.println("\nOriginal route:");
        System.out.println(route);

        System.out.println("\nAdding new stop 'Stop B2' between B and C...");
        int idxB = route.indexOf("Stop B");
        if (idxB != -1) {
            route.add(idxB + 1, "Stop B2");
        }
        System.out.println(route);

        System.out.println("\nRemoving closed stop 'Stop D'...");
        int idxD = route.indexOf("Stop D");
        if (idxD != -1) {
            route.remove(idxD);
        }
        System.out.println("\nFinal route:");
        System.out.println(route);
    }

    // LL8 – Event Schedule (Insert by Time)
    private static void runLL8_EventScheduleSorted() {
        // TODO: Implement task LL8 here.
        // You may add a helper method addInOrder(E item, Comparator<E> cmp) to CSLinkedList if needed.
        System.out.println("=== LL8 – Event Schedule (Insert by Time) ===");

        CSLinkedList<String> events = new CSLinkedList<>();

        java.util.Comparator<String> timeComparator = new java.util.Comparator<String>() {
            @Override
            public int compare(String e1, String e2) {
                String t1 = e1.substring(0, 5);
                String t2 = e2.substring(0, 5);
                return t1.compareTo(t2);
            }
        };

        events.addInOrder("09:00 Breakfast", timeComparator);
        events.addInOrder("13:00 Lunch", timeComparator);
        events.addInOrder("11:30 Meeting", timeComparator);
        events.addInOrder("08:30 Workout", timeComparator);

        System.out.println("\nEvents in time order:");
        System.out.println(events);
    }

    // LL9 – Bug Tracker List (Remove by ID)
    private static void runLL9_BugTrackerRemoveById() {
        // TODO: Implement task LL9 here.
        // You may add a helper method removeFirstOccurrence(E item) to CSLinkedList if needed.
        System.out.println("=== LL9 – Bug Tracker List (Remove by ID) ===");

        CSLinkedList<String> bugs = new CSLinkedList<>();
        bugs.add("BUG-101");
        bugs.add("BUG-202");
        bugs.add("BUG-101");
        bugs.add("BUG-303");

        System.out.println("\nInitial bug list:");
        System.out.println(bugs);

        System.out.println("\nRemoving first occurrence of BUG-101...");
        boolean removed = bugs.removeFirstOccurrence("BUG-101");
        System.out.println("Removed? " + removed);
        System.out.println(bugs);

        System.out.println("\nRemoving first occurrence of BUG-999...");
        removed = bugs.removeFirstOccurrence("BUG-999");
        System.out.println("Removed? " + removed);
        System.out.println(bugs);
    }

    // LL10 – Playlist Shuffle Copy
    private static void runLL10_PlaylistShuffleCopy() {
        // TODO: Implement task LL10 here.
        // You may add a helper method copy() to CSLinkedList if needed.
        System.out.println("=== LL10 – Playlist Shuffle Copy ===");

        CSLinkedList<String> original = new CSLinkedList<>();
        original.add("Song A");
        original.add("Song B");
        original.add("Song C");
        original.add("Song D");

        System.out.println("\nOriginal playlist:");
        System.out.println(original);

        CSLinkedList<String> copy = original.copy();

        // Simple "shuffle": swap 0 and 2, 1 and 3 (if they exist)
        if (copy.size() >= 4) {
            String temp = copy.get(0);
            copy.add(0, copy.get(2));
            copy.remove(3); // old copy.get(2)

            temp = copy.get(1);
            copy.add(1, copy.get(3));
            copy.remove(4);
        }

        System.out.println("\nShuffled copy:");
        System.out.println(copy);

        System.out.println("\nOriginal playlist again (unchanged):");
        System.out.println(original);
    }
}
