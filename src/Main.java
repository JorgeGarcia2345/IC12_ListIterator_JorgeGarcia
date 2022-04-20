import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
    ArrayList - Contigously allocated (next to each other), back by an array
    LinkedList - Scattered around RAM, doesnt need be next to eachother, backed by Node


// --->
    Goal: Start a temp node @ head
    Move it to CS 113

    (cs112, Node(cs112, Node(113, Node()))

    Node<String> temp = mHead; ---- 111
    temp = temp.mNext;         ---- 112
    temp = temp.mNext;         ---- 113

    temp = temp.mNext.mNext;

    for(int i = 0; i < 2; i++)
    temp = temp.mNext;

    for(int i = 0; i < indexOf(element); i++) ?????????????

    temp.mNext = new Node("CS138", temp.mNext);

    Listinterator = data structure that traverses lists
    // allows concurrent modification
    // allows bi-directional traversal a list

    Listiterator = data structure that traverses (front to back, back to front)
    // AND allows concurrent modification

   Listiterator
   // 3 Fields, instance variables
   mPrev (Node)
   mNext (Node)
   mCursor (int) - index

   ["CS111", Node (data, mNext)]  - Listiterator [mPrev, index - cursor, mNext] - ["CS112, Node (data, mNext())]

   if(mPrev != null) // checks before
   if(mNext != null) // checks next

 */
public class Main {

    public static void main(String[] args) {
        // 220 - Summer
        // 113 - Fall

        List<String> csCourses = new ArrayList<>(); // Can easily switch it to LinkedList = li works on any LIST
        csCourses.add("CS111");
        csCourses.add("CS112");
        csCourses.add("CS113"); // Data Structures
        csCourses.add("CS220"); // Computer Architecture, machine code building
        csCourses.add("CS292"); // elective - internship - develop software, good experience
        csCourses.add("CS226"); // discrete structure
        csCourses.add("CS292"); // elective - internship - develop software, good experience

        // Problem: Loop through csCourses
        // remove all the instances of CS292 (too busy, got paid internship)

        System.out.println(csCourses);
/*
        for (int i = 0; i < csCourses.size(); i++) {

           if(csCourses.contains("CS292")){
               csCourses.remove(csCourses.indexOf("CS292"));
           }


           if(csCourses.get(i).equals("CS292"))
               csCourses.remove(i);
            // Throw a ConcurrentModificationException, usually can't modify while looping
        }

        while (csCourses.contains("CS292"))
            csCourses.remove(csCourses.indexOf("CS292"));


 */
        ListIterator<String> li = csCourses.listIterator();

        // cursor starts @ 0


        while(li.hasNext())
            if(li.next().equals("CS292"))
                li.remove(); // Stops @ CS226, we can start going backwards

        // cursor is at end of list, what ever index that is


        // while (file.hasNextLine())
        // line = file.nextLine(); (advanced "cursor" (position) in file)
        System.out.println(csCourses);

        System.out.print("Reverse reverse");
        // Goes backwards
        while (li.hasPrevious())
            System.out.print(li.previous() + ", ");



    }
}
