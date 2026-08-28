 class toStringStudentClass {
    int age;
    String name;

    toStringStudentClass(String name, int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "My name is :"+ name +
                " My age is :"+ age;
    }

    public static void main(String[] args) {
       toStringStudentClass student = new toStringStudentClass("Harsh", 19);
       System.out.print(student);
    }

}
