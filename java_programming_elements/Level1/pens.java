//Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
import java.util.*;
public class pens {
   public static void main(String[] args) {
    int totalPens = 14;
    int students = 3;
    int perStudent = totalPens / students;
    int remaining = totalPens % students;
        System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);
   } 
}
