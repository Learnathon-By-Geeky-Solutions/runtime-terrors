public class Main {
    public static void main(String[] args) {
    //store roll number
        int[] rollNumber=new int[5];
        //store 5 name
        String[] name=new String[5];
        //Data of 5 students(roll no,name ,marks)
        int[] rno=new int[5];
        String[] names=new String[5];
        Float[]mark=new Float[5];
        //my own data type
        //Create a class
        class Student {
            int rno;
            String names;
            Float mark;

//            public Student(int rno, String names, Float mark) {
//                this.rno = rno;
//                this.names = names;
//                this.mark = mark;
//            }
            //If we don't give return type of class student .It's ok no problem
            //We nees a way ro add the values of the class
            //Object by objct
            Student(int rno,String names,Float mark){
                this.rno=rno;
                this.names=names;
                this.mark=mark;
                //we can't do something like that
//                Sazid.rno=14;
//                Sazid.names="Sazidur Rahman";
//                Sazid.mark=60.66f;



            }
            Student (String jemima)
            {
                this.names="Udoy";
                this.mark=20.2f;
                this.rno=12;
            }
            Student()
            {
//                this.names=names;
//                this.rno=rno;
//                this.mark=mark;
                //this is how you call a constructor from another constructor
                //Internally : new Student(13,"Default",12.5f)
                this(13,"Default",12.5f);
            }

            void greeting()
            {
                System.out.println("Hello my name is "+this.names);
            }
            void changeName(String newName)
            {
                names=newName;
            }



        }
        Student[] student =new Student[5];
        Student Sazid;
        Sazid=new Student(1,"Sazid",60.2f);
        Student udoy=new Student("Jemima");
        Student random=new Student();
        System.out.println(random.names);
//        Student random=new Student(Jemima);
//        System.out.println(random.names);
        System.out.println(udoy.names);
//        Sazid.rno=14;
//        Sazid.names="Sazidur Rahman";
//        Sazid.mark=60.66f;
//        System.out.println(Kunal);
        System.out.println(Sazid.rno);//
        System.out.println(Sazid.names);
        System.out.println(Sazid.mark);
        Sazid.greeting();
        Sazid.changeName("Mahin");
        System.out.println(Sazid.names);
        Student one=new Student();
        Student two=one;
        one.names="Something Something";
        System.out.println(two.names);
        //new allocates dynamic memory
//        System.out.println(Arrays.toString(student));
//        Student student1= new Student();


        }


    }
