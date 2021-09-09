package day04.JavaCollections.JavaList;

import java.util.*;


//List interface methods
public class ListMethods {
    public static void main(String[] args) {
        //dummyList
        List<Integer> dummyList = new ArrayList<>();
        dummyList.add(10);
        dummyList.add(11);
        dummyList.add(12);
        dummyList.add(13);


        //common list methods
        List<Integer> myList = new ArrayList<>();
        System.out.println("Initial List => "+myList.toString());

        //adding
        System.out.println(" 1.add operation");
        myList.add(1);
        System.out.println("  added 1 => "+myList.toString());
        myList.add(1,10);
        System.out.println("  added 10 at '1'th position => "+myList.toString());
        myList.addAll(2,dummyList);
        System.out.println("  added [10,11,12,13] to 2nd position our list => "+myList.toString());
        myList.addAll(dummyList);
        System.out.println("  added [10,11,12,13] whole list to our list => "+myList.toString());
        System.out.println(" List after elements added => "+myList.toString());

        //size
        System.out.println("\n 2.List size =>  "+myList.size());
        //check empty or not
        System.out.println(" 3.is list empty => "+myList.isEmpty());
        //check whether list contains given item
        System.out.println(" 4.is list contains 10 ? => "+myList.contains(10));
        //check whether list contains given LIST
        System.out.println(" 5.is list contains 10 ? => "+myList.containsAll(dummyList));
        //get
        System.out.println(" 6.get specific element using index => "+myList.get(5));
        //set
        System.out.println(" 7.set item to specific place (setting 3 to 5th place) (returns the old value but updates yours) => "+myList.set(5,3));
        //indexOf
        System.out.println(" 8.get index by passing value => "+myList.indexOf(3));
        //lastIndexOf
        System.out.println(" 9.get lastondex by passing value => "+myList.lastIndexOf(10));
        //toArray
        System.out.println(" 10.toArray operation ");
        System.out.println("  convert list into array => "+Arrays.toString(myList.toArray()));
        System.out.println("  convert list into array toArray(T[] t) => "+Arrays.toString(myList.toArray(new Integer[dummyList.size()])));
        //retailAll
        System.out.println(" 11.retainAll used to retains the items which was passed as param, other all items will be removed ");
        System.out.println("  initial list => "+myList);
        System.out.println("  retains all this "+dummyList+" ? => "+myList.retainAll(dummyList));
        System.out.println("  after retainsAll method => "+myList);
        //iterator
        System.out.println(" 12.iterator");
        Iterator normalIterator = myList.iterator();
        System.out.println("  using next() method => "+normalIterator.next());
        System.out.println("  using hasNext() method => "+normalIterator.hasNext());
        //Listiterator
        System.out.println(" 12.List iterator");
        ListIterator listIterator = myList.listIterator();
        System.out.println("  using next() method => "+listIterator.next());
        System.out.println("  using previous() method => "+listIterator.previous());
        System.out.println("  using hasNext() method => "+listIterator.hasNext());
        System.out.println("  using hasPrevious() method => "+listIterator.hasPrevious());
        System.out.println("  using nextIndex() method => "+listIterator.nextIndex());
        System.out.println("  using previousIndex() method => "+listIterator.previousIndex());
        //remove
        System.out.println(" 13.remove operation");
        System.out.println(" before removing => "+myList);
        System.out.println("  using remove by passing index 0 => "+myList.remove(0));
        System.out.println(" after removing index 0 => "+myList);
        System.out.println("  using remove by passing value => "+myList.remove(new Integer(10)));
        System.out.println(" after removing value 10 => "+myList);
        System.out.println("  using removeAll by passing list => "+myList.removeAll(dummyList));
        System.out.println(" after removing "+dummyList+" => "+myList);

        //clear
        System.out.println(" 14.clear the dummy list ");
        System.out.println("  before clearing => "+dummyList);
        dummyList.clear();
        System.out.println("  after clearing => "+dummyList);




        //subList

        }

}

