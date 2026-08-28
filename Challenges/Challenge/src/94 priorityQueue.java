import java.util.Comparator;
import java.util.PriorityQueue;

class priorityQueue {

     public static void main(String[] args) {
         PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
             @Override
             public int compare(Student o1, Student o2) {
                 return o1.getGrade() - o2.getGrade();
             }
         });

         queue.offer(new Student("Harsh", 'B'));
         queue.offer(new Student("naru", 'B'));
         queue.offer(new Student("roni", 'C'));
         queue.offer(new Student("parth", 'A'));
         queue.offer(new Student("sufiyan", 'K'));


         System.out.print(queue + "/n");

         System.out.println();
         System.out.println(queue.poll());
         System.out.println(queue.poll());
         System.out.println(queue.poll());
         System.out.println(queue.poll());
         System.out.println(queue.poll());

     }






    private static class Student{
        private final String Name;
        private final char grade;

      public Student(String Name, char grade){
            this.Name = Name;
            this.grade = grade;
        }

        public String getName() {
            return Name;
        }

        public char getGrade() {
            return grade;
        }


        @Override
        public String toString() {
          return Name + ":" + grade ;
        }
    }
}
