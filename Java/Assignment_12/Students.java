package Assignment_12;

import java.util.*;
import java.util.stream.Collectors;

public class Students {
    public int id;
    public int age;
    public int year_of_enrollment;
    public String name;
    public String gender;
    public  String engDepartment;
    public Students(int id, String name, int age,  String gender, String engDepartment, int year_of_enrollment, double perTillDate){
        this.id = id;
        this.age = age;
        this.year_of_enrollment = year_of_enrollment;
        this.name = name;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.perTillDate = perTillDate;
    }

    public void printDetails(){
        System.out.print("\nid:"+this.id+"\nname:"+this.name+"\nage:"+this.age+"\ngender:"+this.gender);
        System.out.println("\nengDepartment:"+this.engDepartment+"\nyearOfEnrollment:"+this.year_of_enrollment+"\nperTilldate:"+this.perTillDate);
    }
    public double perTillDate;
    String getEngDepartment(){
        return engDepartment;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }

    public double getPerTillDate(){
        return perTillDate;
    }

    public static void main(String[] args) {


        List<Students>  students = new ArrayList<>();

        students.add(new Students(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Students(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Students(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Students(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Students(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Students(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Students(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Students(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Students(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Students(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Students(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Students(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Students(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Students(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Students(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Students(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Students(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));




        Set<String> departments =students.stream().map(m->m.engDepartment).collect(Collectors.toSet());
        System.out.println("task 1: ");
        System.out.println(departments);
        System.out.println();


        List<String> students_of_2018 =students.stream().filter(f->f.year_of_enrollment>2018).map(m->m.name).collect(Collectors.toList());
        System.out.println("task 2:");
        System.out.println(students_of_2018);
        System.out.println();


        System.out.println("task 3");
        students.stream().filter(f->f.engDepartment.equals("Computer Science") && f.gender.equals("Male")).forEach(e->e.printDetails());
        System.out.println();


        System.out.println("task 4");
        Map<String, Long> noOfMaleAndFemale
                = students.stream().collect(Collectors.groupingBy(g -> g.gender,Collectors.counting()));
        System.out.println(noOfMaleAndFemale);
        System.out.println();


        System.out.println("task 5");
        Map<String, Double> avgAgeOfMaleFemale
                = students.stream().collect(Collectors.groupingBy(Students::getGender,Collectors.averagingInt(Students::getAge)));
        System.out.println(avgAgeOfMaleFemale);
        System.out.println();


        System.out.println("task 6");
        Optional<Students> highestPercentageStudent = students.stream().max(Comparator.comparing(Students::getPerTillDate));
        highestPercentageStudent.get().printDetails();
        System.out.println();


        System.out.println("task 7");
        Map<String, Long> noOfStudentsInEachDept
                = students.stream().collect(Collectors.groupingBy(Students::getEngDepartment,Collectors.counting()));
        System.out.println(noOfStudentsInEachDept);
        System.out.println();


        System.out.println("task 8");
        Map<String, Double> averAgeOfEachDepartment
                = students.stream().collect(Collectors.groupingBy(Students::getEngDepartment,Collectors.averagingDouble(Students::getPerTillDate)));
        System.out.println(averAgeOfEachDepartment);
        System.out.println();


        System.out.println("task 9");
        Optional<Students> youngestMaleInElectronics =
                students.stream().filter(p -> p.engDepartment.equals("Electronic")).min(Comparator.comparing(Students::getAge));
        youngestMaleInElectronics.get().printDetails();
        System.out.println();


        System.out.println("task 10");
        Map<String, Long> noOfMaleFemaleInCS
                = students.stream().filter(p->p.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(p->p.gender,Collectors.counting()));
        System.out.println(noOfMaleFemaleInCS);
        System.out.println();



    }

}

