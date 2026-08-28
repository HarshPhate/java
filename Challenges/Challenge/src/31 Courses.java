 class Courses {

    static int maxCapacity = 100;

    int enrolled;
    String courseName;

    String[] enrollStudent ;


     Courses(String courseName){
         this.courseName = courseName;
         this.enrolled = 0;
         this.enrollStudent = new String[maxCapacity];
     }

    static void setMaxCapacity(int maxCapacity){
        Courses.maxCapacity = maxCapacity;
    }


   void enrollment(String studentName){
        enrollStudent[enrolled] = studentName;
        enrolled++;

   }

   void unenrollStudent(String studentName){
        enrolled--;
   }

}
