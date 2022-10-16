////Problem1
//import java.util.ArrayList;
//
//public class Problem {
// public static void main(String[] args) {
//        Student student1 = new Student(1,"Merey","Omaroba","Madykyzy",2004,"Lugoboy","87051029604","Teacher","3B1",3);
//        Student student2 = new Student(2,"Ulbolsyn","Sayaqbay","Dosmakhankyzy",2004,"Merke","87073215804","IT","3E",3);
//        Student student3 = new Student(3,"Uldana","Ilyas","Kuanyshkyzy",2004,"Aisha-Bibi","87780057005","Dancer","3D",3);
//        Student student4 = new Student(4,"Merey","Kalen","Erikkyzy",2005,"Taraz","87089638521","Teacher","2F1",2);
//        Student student5 = new Student(5,"Aruzhan","Kozhakhmetova","Bakhtzhankyzy",2004,"Taraz","87073270317","Dancer","2A",2);
//
// ArrayList<Student> studentArrayList = new ArrayList<>();
//
//             studentArrayList.add(student1);
//             studentArrayList.add(student2);
//             studentArrayList.add(student3);
//             studentArrayList.add(student4);
//             studentArrayList.add(student5);
//
//
//   String faculted = "Teacher";
// for(Student a:studentArrayList){
// if(a.getFaculted() == faculted){
// System.out.println(a);
//            }
//        }
//
//
// String it = "IT";
// String teacher = "Teacher";
// String dancer = "Dancer";
// for(Student a : studentArrayList){
// if(a.getFaculted()==it && a.getCurse()==3){
// System.out.println("Faculted IT Third Course:\n"+a);
// }else if(a.getFaculted()==teacher && a.getCurse()==2){
// System.out.println("Faculted Teacher Second Course :\n"+a);
// }else if(a.getFaculted()==teacher && a.getCurse()==3){
// System.out.println("Faculted Teacher Third Course :\n"+a);
// }else if(a.getFaculted()==dancer && a.getCurse()==2){
// System.out.println("Faculted Dancer Second Course :\n"+a);
// }else if(a.getFaculted()==dancer && a.getCurse()==3){
// System.out.println("Faculted Dancer Third Course :\n"+a);
//            }
//        }
//
//
// int kun = 2004;
// for(Student a:studentArrayList){
// if(a.getBirthday_date()>kun){
// System.out.println("Students born after 2004:\n"+a);
//            }
//        }
//
//
// ArrayList<String> groups = new ArrayList<>();
//        for(Student a:studentArrayList){
// groups.add(a.getGroup());
//        }
// System.out.println(groups);
//
//    }
//}
//class Student{
// int id;
// String surname;
// String name;
// String patronymic;
// int birthday_date;
// String adres;
// String phone_number;
// String faculted;
// int curse;
// String group;
//
//
//
//
// public Student(int id,String name,String surname,String patronymic,int birthday_date,String adres,String phone_number,String faculted,String group,int curse){
//       this.id = id;
//       this.surname = surname;
//       this.name = name;
//       this.patronymic = patronymic;
//       this.birthday_date = birthday_date;
//       this.adres = adres;
//       this.phone_number = phone_number;
//       this.faculted = faculted;
//       this.curse = curse;
//      this.group = group;
//
//       }
//
//            public int getId() {
// return id;
//    }
//
//            public String getSurname() {
// return surname;
//    }
//
//            public String getName() {
// return name;
//    }
//
//            public String getPatronymic() {
// return patronymic;
//    }
//
// public int getBirthday_date() {
// return birthday_date;
//    }
//
// public String getAdres() {
// return adres;
//    }
//
// public String getPhone_number() {
// return phone_number;
//    }
//
// public String getFaculted() {
// return faculted;
//    }
//
// public int getCurse() {
// return curse;
//    }
//
// public String getGroup() {
// return group;
//    }
//
// public void setId(int id) {
// this.id = id;
//    }
//
// public void setSurname(String surname) {
// this.surname = surname;
//    }
//
// public void setName(String name) {
// this.name = name;
//    }
//
// public void setPatronymic(String patronymic) {
// this.patronymic = patronymic;
//    }
//
// public void setBirthday_date(int birthday_date) {
// this.birthday_date = birthday_date;
//    }
//
// public void setAdres(String adres) {
// this.adres = adres;
//    }
//
// public void setPhone_number(String phone_number) {
// this.phone_number = phone_number;
//    }
//
// public void setFaculted(String faculted) {
// this.faculted = faculted;
//    }
//
// public void setCurse(int curse) {
// this.curse = curse;
//    }
//
// public void setGroup(String group) {
// this.group = group;
//    }
//
// @Override
// public String toString() {
// return "Student{" +
// "id=" + id +
// ", surname='" + surname + '\'' +
// ", name='" + name + '\'' +
// ", patronymic='" + patronymic + '\'' +
// ", birthday_date='" + birthday_date + '\'' +
// ", adres='" + adres + '\'' +
// ", phone_number='" + phone_number + '\'' +
// ", faculted='" + faculted + '\'' +
// ", curse=" + curse +
// ", group='" + group + '\'' +
//                '}';
//    }
//}
//
//



//Problem2
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Problem {
//    public static void main(String[] args) {
//        Customer customer = new Customer(1,"Ulbolsyn","Sayaqbay","Dosmakhankyzy","Merke", 3405,244);
//        Customer customer1 = new Customer(2,"Omarova","Merey","Madiqyzy","Lugovoe",  3604,245);
//        Customer customer2 = new Customer(3,"Kozhakhmentova","Aruzhan","Bakhytzhanqyzy","Taraz", 3704,246);
//        Customer customer3 = new Customer(4,"Iliyas","Uldana","Kuanyshqyzy","Aisha-Bibi", 3804,247);
//        Customer customer4 = new Customer(5,"Kalen","Merey","Erikqyzy","Taraz", 3904,204);
//        Customer customer5 = new Customer(6,"Tanatar","Alina","Erikinkyzy","Taraz", 3309,205);
//
//
//        ArrayList<Customer> customersArrayList = new ArrayList<>();
//        customersArrayList.add(customer);
//        customersArrayList.add(customer1);
//        customersArrayList.add(customer2);
//        customersArrayList.add(customer3);
//        customersArrayList.add(customer4);
//        customersArrayList.add(customer5);
//
//
//
//
//        Collections.sort(customersArrayList,new SortByName());
//        for(Customer s:customersArrayList){
//            System.out.println(s.getTitle());
//        }
//
//        int first = 3804;
//        int second = 3309;
//        ArrayList<Customer> range_customers = new ArrayList<>();
//        for(Customer f:customersArrayList){
//            if(f.getNumber_card()>=first && f.getNumber_card()<=second){
//                range_customers.add(f);
//            }
//        }
//        System.out.println("Range Customers number card of 3804-3309");
//        for(Customer f:range_customers){
//            System.out.println(f);
//        }
//    }
//}
//
//
//
//class SortByName implements Comparator<Customer>{
//
//    @Override
//    public int compare(Customer first, Customer second) {
//        return first.getTitle().compareTo(second.getTitle());
//    }
//}
//class Customer{
//    int id;
//    String surname;
//    String title;
//    String lastname;
//    String adres;
//    int number_card;
//    int bank_check_number;
//    public Customer(int id,String surname,String title,String lastname,String adres,int number_card,int bank_check_number){
//        this.id =id;
//        this.surname =surname;
//        this.title =title;
//        this.lastname =lastname;
//        this.adres =adres;
//        this.number_card =number_card;
//        this.bank_check_number =bank_check_number;
//
//    }
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", title='" + title + '\'' +
//                ", lastname='" + lastname + '\'' +
//                ", adres='" + adres + '\'' +
//                ", number_card=" + number_card +
//                ", bank_check_number=" + bank_check_number +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getAdres() {
//        return adres;
//    }
//
//    public void setAdres(String adres) {
//        this.adres = adres;
//    }
//
//    public int getNumber_card() {
//        return number_card;
//    }
//
//    public void setNumber_card(int number_card) {
//        this.number_card = number_card;
//    }
//
//    public int getBank_check_number() {
//        return bank_check_number;
//    }
//
//    public void setBank_check_number(int bank_check_number) {
//        this.bank_check_number = bank_check_number;
//    }
//}
//







////Problem3
//import java.util.ArrayList;
//
//public class Problem{
// public static void main(String[] args) {
// Patient patient1 = new Patient(1,"Omaroba","Merey","Madykyzy","Lugoboy","87051029604",22,"Animya");
// Patient patient2 = new Patient(2,"Sayaqbay","Ulbolsyn","Dosmakhankyzy","Merke","87073215804",33,"Bronchitis");
// Patient patient3 = new Patient(3,"Ilyas","Uldana","Kuanyshkyzy","Aisha-Bibi","87780057005",55,"Laryngitis");
// Patient patient4 = new Patient(4,"Kalen","Merey","Erikkyzy","Taraz","87089638521",44,"Allergy");
// Patient patient5 = new Patient(5,"Kozhakhmetova","Aruzhan","Bakhtzhankyzy","Taraz","87073270317",66,"Gastritis");
// Patient patient6 = new Patient(6,"Tanatar","Alina","Erikinkyzy","Taraz","87073270319",11,"Animya");
// ArrayList<Patient> patientsArrayList = new ArrayList<>();
// patientsArrayList.add(patient1);
// patientsArrayList.add(patient2);
// patientsArrayList.add(patient3);
// patientsArrayList.add(patient4);
// patientsArrayList.add(patient5);
// patientsArrayList.add(patient6);
//
//
// ArrayList<Patient> animya = new ArrayList<>();
// String animya_diag = "Animya";
// for(Patient s:patientsArrayList){
// if(s.getDiagnosis()==animya_diag){
//     animya.add(s);
//            }
//        }
// System.out.println("Patients which have animya:");
// for(Patient p:animya){
// System.out.println(p);
//        }
//
//
//        int first = 1;
//        int second = 6;
//        ArrayList<Patient> interval = new ArrayList<>();
//        for(Patient s:patientsArrayList){
//            if(s.getNumber_medical_card()>=first && s.getNumber_medical_card()<=second){
//                interval.add(s);
//            }
//        }
//        System.out.println("Patients in interval 1-6");
//        for(Patient p: interval){
//            System.out.println(p);
//        }
//    }
//}
//
//
//
//class Patient{
//    int id;
//    String surname;
//    String name;
//    String patronymic;
//    String adres;
//    String phone_number;
//    int number_medical_card;
//    String diagnosis;
//    public Patient(int id,String surname,String name,String patronymic,String adres,String phone_number,int number_medical_card,String diagnosis){
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.patronymic = patronymic;
//        this.adres = adres;
//        this.phone_number = phone_number;
//        this.number_medical_card = number_medical_card;
//        this.diagnosis = diagnosis;
//    }
//
//    @Override
//    public String toString() {
//        return "Patient{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", adres='" + adres + '\'' +
//                ", phone_number='" + phone_number + '\'' +
//                ", number_medical_card=" + number_medical_card +
//                ", diagnosis='" + diagnosis + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPatronymic() {
//        return patronymic;
//    }
//
//    public void setPatronymic(String patronymic) {
//        this.patronymic = patronymic;
//    }
//
//    public String getAdres() {
//        return adres;
//    }
//
//    public void setAdres(String adres) {
//        this.adres = adres;
//    }
//
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public int getNumber_medical_card() {
//        return number_medical_card;
//    }
//
//    public void setNumber_medical_card(int number_medical_card) {
//        this.number_medical_card = number_medical_card;
//    }
//
//    public String getDiagnosis() {
//        return diagnosis;
//    }
//
//    public void setDiagnosis(String diagnosis) {
//        this.diagnosis = diagnosis;
//    }
//}





//Problem4
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Problem {
//    public static void main(String[] args) {
//        applicant applicant1 = new applicant(1,"Omarova","Merey","Madiqyzy","Lugovoe","87054121874",85);
//        applicant applicant2 = new applicant(2,"Yeren","Merey","Madiqyzy","Merki","87073270317",55);
//        applicant applicant3 = new applicant(3,"Kozhakhmetova","Aru","Bakhytzhanqyzy","Taraz","87078871243",90);
//        applicant applicant4 = new applicant(4,"Tanatar","Alina","Erikinkyzy","Taraz","87474748581",0);
//        applicant applicant5 = new applicant(5,"Iliyas","Uldana","Kuanyshqyzy","Aisha-Bibi","87474748581",50);
//        applicant applicant6 = new applicant(6,"Kalen","Merey","Madiqyzy","Taraz","87474748581",60);
//
//        ArrayList<applicant> applicantArrayList = new ArrayList<>();
//        applicantArrayList.add(applicant1);
//        applicantArrayList.add(applicant2);
//        applicantArrayList.add(applicant3);
//        applicantArrayList.add(applicant4);
//        applicantArrayList.add(applicant5);
//        applicantArrayList.add(applicant6);
//
//        ArrayList<applicant> jaqsi_emes_marks = new ArrayList<>();
//        for(applicant f: applicantArrayList){
//            if(f.getMarks()<69){
//                jaqsi_emes_marks.add(f);
//            }
//        }
//        System.out.println("neudovletvoritel'nyye otsenki:");
//        for (applicant d:jaqsi_emes_marks) {
//            System.out.println(d);
//        }
//
//        int mark = 75;
//        ArrayList<applicant> more_than = new ArrayList<>();
//        for(applicant d:applicantArrayList){
//            if(d.getMarks()>mark){
//                more_than.add(d);
//            }
//        }
//        System.out.println("bally vyshe ukazannogo");
//        for(applicant f:more_than){
//            System.out.println(f);
//        }
//
//        int n = 3;
//        Collections.sort(applicantArrayList,new SortByMarks());
//        ArrayList<applicant> themost = new ArrayList<>();
//        System.out.println("naivysshiy obshchiy ball");
//        for(int i = 0;i<n;i++){
//            themost.add(applicantArrayList.get(i));
//        }
//        System.out.println(themost);
//
//
//        for(applicant f:applicantArrayList){
//            if(f.getMarks()>70){
//                System.out.println(f);
//            }
//        }
//
//    }
//}
//class SortByMarks implements Comparator<applicant> {
//
//    @Override
//    public int compare(applicant first, applicant second) {
//        if(first.getMarks() == second.getMarks()){
//            return 0;
//        }else if(first.getMarks()>second.getMarks()){
//            return -1;
//        }else{
//            return 1;
//        }
//    }
//}
//class applicant{
//    int id;
//    String surname;
//    String title;
//    String Patronymic;
//    String adres;
//    String phone_number;
//    int marks;
//
//    public applicant(int id, String surname, String title, String Patronymic, String adres, String phone_number, int marks) {
//        this.id = id;
//        this.surname = surname;
//        this.title = title;
//        this.Patronymic = Patronymic;
//        this.adres = adres;
//        this.phone_number = phone_number;
//        this.marks = marks;
//    }
//
//    @Override
//    public String toString() {
//        return "applicant{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", title='" + title + '\'' +
//                ", patronymic='" + Patronymic + '\'' +
//                ", adres='" + adres + '\'' +
//                ", phone_number='" + phone_number + '\'' +
//                ", marks=" + marks +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getPatronymic() {
//        return Patronymic;
//    }
//
//    public void setPatronymic(String Patronymic) {
//        this.Patronymic = Patronymic;
//    }
//
//    public String getAdres() {
//        return adres;
//    }
//
//    public void setAdres(String adres) {
//        this.adres = adres;
//    }
//
//    public String getPhone_number() {
//        return phone_number;
//    }
//
//    public void setPhone_number(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public int getMarks() {
//        return marks;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
//}
//
//






//Problem5
//import java.util.ArrayList;
//
//public class Problem {
// public static void main(String[] args) {
// Book book1 = new Book(1,"The Prince and the Pauper ","Mark Twain","Semey",2004,380,"8000$","pdf");
// Book book2 = new Book(2,"Fight Club","Chuck Palahniuk","Oskemen",2012,380,"8000$","pdf");
// Book book3 = new Book(3,"1984","Palahniuk","Astana",2022,380,"8000$","pdf");
// Book book4 = new Book(4,"The Prince and the Pauper ","Mark Twain","Semey",2016,380,"8000$","pdf");
// Book book5 = new Book(5,"The Prince and the Pauper ","Mark Twain","Semey",2003,380,"8000$","pdf");
// Book book6 =new Book(6,"Abay","Muktar Aurthob","Almaty",2021,380,"8000$","pdf");
//
//
//   ArrayList<Book> bookArrayList = new ArrayList<>();
// bookArrayList.add(book1);
// bookArrayList.add(book2);
// bookArrayList.add(book3);
// bookArrayList.add(book4);
// bookArrayList.add(book5);
// bookArrayList.add(book6);
//
//
//
// String avtor_kerek = "Mark Twain";
// ArrayList<Book> avtor = new ArrayList<>();
// for(Book d:bookArrayList){
// if(d.getAuthor()==avtor_kerek){
//     avtor.add(d);
//            }
//        }
//        System.out.println(avtor);
//
//
//
//        String baspasy = "Semey";
// ArrayList<Book> baspa = new ArrayList<>();
// for(Book d:bookArrayList){
//            if(d.getAuthor()==baspasy){
//                baspa.add(d);
//            }
//        }
//        System.out.println(baspa);
//
//
//
//        int jil = 2016;
//        ArrayList<Book> jili = new ArrayList<>();
//        for(Book d:bookArrayList){
//            if(d.getDate()>2016){
//                jili.add(d);
//            }
//        }
//        System.out.println(jili);
//    }
//}
//class Book{
//    int id;
//    String name;
//    String author;
//    String publisher;
//    int date;
//    int pages;
//    String cost;
//    String type_of_binding;
//
//    public Book(int id, String name, String author, String publisher, int date, int pages, String cost, String type_of_binding) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//        this.publisher = publisher;
//        this.date = date;
//        this.pages = pages;
//        this.cost = cost;
//        this.type_of_binding = type_of_binding;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", date=" + date +
//                ", pages=" + pages +
//                ", cost='" + cost + '\'' +
//                ", type_of_binding='" + type_of_binding + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//
//    public int getDate() {
//        return date;
//    }
//
//    public void setDate(int date) {
//        this.date = date;
//    }
//
//    public int getPages() {
//        return pages;
//    }
//
//    public void setPages(int pages) {
//        this.pages = pages;
//    }
//
//    public String getCost() {
//        return cost;
//    }
//
//    public void setCost(String cost) {
//        this.cost = cost;
//    }
//
//    public String getType_of_binding() {
//        return type_of_binding;
//    }
//
//    public void setType_of_binding(String type_of_binding) {
//        this.type_of_binding = type_of_binding;
//    }
//}







//Problem6
//import java.util.ArrayList;
//
//public class Problem {
//    public static void main(String [] args){
//        ArrayList<House> houseArrayList = new ArrayList<>();
//        House house1 = new House(1, 1, 90, 1, 2, "Seyfyllina", "brick", 10);
//        House house2 = new House(2, 2, 50, 2,  3, "Seyfyllina", "brick", 20);
//        House house3 = new House(3, 3, 100, 3,  1, "Seyfyllina", "brick", 30);
//        House house4 = new House(4, 4, 25, 4,  2, "Seyfyllina", "brick", 40);
//        House house5 = new House(5, 5, 10, 5, 3, "Seyfyllina", "brick", 50);
//
//        houseArrayList.add(house1);
//        houseArrayList.add(house2);
//        houseArrayList.add(house3);
//        houseArrayList.add(house4);
//        houseArrayList.add(house5);
//             for (House s : houseArrayList){
//            if (s.getNumber_of_rooms() == 2){
//                System.out.println(s.apartment_number + ": " + s.getNumber_of_rooms() + ":room");
//            }
//        }
//
//        for (House s : houseArrayList){
//            if (s.getNumber_of_rooms() == 4){
//                if (s.getFloor() > 1 && s.getFloor() < 5){
//                    System.out.println(s);
//                }
//            }
//        }
//
//        for (House s : houseArrayList){
//            if (s.area > 90){
//                System.out.println(s.apartment_number + " area: " + s.area);
//            }
//        }
//    }
//}
//
//class House{
//    int id;
//    int apartment_number;
//    int area;
//    int floor;
//    int number_of_rooms;
//    String street;
//    String building_type;
//    int lifetime;
//
//    public House (int id, int apartment_number, int area, int floor, int number_of_rooms, String street, String building_type, int lifetime){
//        this.id = id;
//        this.apartment_number = apartment_number;
//        this.area = area;
//        this.floor = floor;
//        this.number_of_rooms = number_of_rooms;
//        this.street = street;
//        this.building_type = building_type;
//        this.lifetime = lifetime;
//    }
//
//    @Override
//    public String toString() {
//        return "House{" +
//                "id=" + id +
//                ", apartment_number=" + apartment_number +
//                ", area=" + area +
//                ", floor=" + floor +
//                ", number_of_rooms=" + number_of_rooms +
//                ", street='" + street + '\'' +
//                ", building_type='" + building_type + '\'' +
//                ", lifetime=" + lifetime +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getApartment_number() {
//        return apartment_number;
//    }
//
//    public void setApartment_number(int apartment_number) {
//        this.apartment_number = apartment_number;
//    }
//
//    public int getArea() {
//        return area;
//    }
//
//    public void setArea(int area) {
//        this.area = area;
//    }
//
//    public int getFloor() {
//        return floor;
//    }
//
//    public void setFloor(int floor) {
//        this.floor = floor;
//    }
//
//    public int getNumber_of_rooms() {
//        return number_of_rooms;
//    }
//
//    public void setNumber_of_rooms(int number_of_rooms) {
//        this.number_of_rooms = number_of_rooms;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getBuilding_type() {
//        return building_type;
//    }
//
//    public void setBuilding_type(String building_type) {
//        this.building_type = building_type;
//    }
//
//    public int getLifetime() {
//        return lifetime;
//    }
//
//    public void setifetime(int lifetime) {
//        this.lifetime = lifetime;
//    }
//}
//


//Problem7
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Problem{
// public static void main(String[] args) {
// Phone phone1 = new Phone(1,"Omaroba","Merey","Madykyzy","Lugoboy",111,12,1,7);
// Phone phone2 = new Phone(2,"Sayaqbay","Ulbolsyn","Dosmakhankyzy","Merke",111,12,10,24);
// Phone phone3 = new Phone(3,"Ilyas","Uldana","Kuanyshkyzy","Aisha-Bibi",111,21,29,12);
// Phone phone4 = new Phone(4,"Kalen","Merey","Erikkyzy","Taraz",111,12,3,3);
// Phone phone5 = new Phone(5,"Kozhakhmetova","Aruzhan","Bakhtzhankyzy","Taraz",111,12,7,8);
// Phone phone6 = new Phone(6,"Tanatar","Alina","Erikinkyzy","Taraz",111,12,8,42);
// ArrayList<Phone> phoneArrayList = new ArrayList<>();
// phoneArrayList.add(phone1);
// phoneArrayList.add(phone2);
// phoneArrayList.add(phone3);
// phoneArrayList.add(phone4);
// phoneArrayList.add(phone5);
// phoneArrayList.add(phone6);
//
//
//        int berilgen_uakut = 12;
//        ArrayList<Phone> kop_time = new ArrayList<>();
//        for(Phone s:phoneArrayList){
//            if(s.getTime()>berilgen_uakut){
//                kop_time.add(s);
//            }
//        }
//        System.out.println(kop_time);
//
//
//        ArrayList<Phone> intercity = new ArrayList<>();
//        for(Phone s:phoneArrayList){
//            if(s.getTime()>0){
//                intercity.add(s);
//            }
//        }
//        System.out.println(intercity);
//
//
//        Collections.sort(phoneArrayList,new SortByName());
//    }
//}
//class SortByName implements Comparator<Phone> {
//
//    @Override
//    public int compare(Phone first, Phone second) {
//        return first.getName().compareTo(second.getName());
//    }
//}
//class Phone {
//    int id;
//    String surname;
//    String name;
//    String patronymic;
//    String adres;
//    int number_of_credit_card;
//    int debet;
//    int credit;
//    int time;
//
//    public Phone(int id, String surname, String name, String patronymic, String adres, int number_of_credit_card, int debet, int credit, int time) {
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.patronymic = patronymic;
//        this.adres = adres;
//        this.number_of_credit_card = number_of_credit_card;
//        this.debet = debet;
//        this.credit = credit;
//        this.time = time;
//    }
//
//    @Override
//    public String toString() {
//        return "Phone{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", adres='" + adres + '\'' +
//                ", number_of_credit_card=" + number_of_credit_card +
//                ", debet=" + debet +
//                ", credit=" + credit +
//                ", time=" + time +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPatronymic() {
//        return patronymic;
//    }
//
//    public void setPatronymic(String patronymic) {
//        this.patronymic = patronymic;
//    }
//
//    public String getAdres() {
//        return adres;
//    }
//
//    public void setAdres(String adres) {
//        this.adres = adres;
//    }
//
//    public int getNumber_of_credit_card() {
//        return number_of_credit_card;
//    }
//
//    public void setNumber_of_credit_card(int number_of_credit_card) {
//        this.number_of_credit_card = number_of_credit_card;
//    }
//
//    public int getDebet() {
//        return debet;
//    }
//
//    public void setDebet(int debet) {
//        this.debet = debet;
//    }
//
//    public int getCredit() {
//        return credit;
//    }
//
//    public void setCredit(int credit) {
//        this.credit = credit;
//    }
//
//    public int getTime() {
//        return time;
//    }
//
//}








//Problem8
//import java.util.ArrayList;
//
//public class Problem {
//    public static void main(String [] args){
//        ArrayList<Car> carArrayList = new ArrayList<>();
//        Car car1 = new Car(1, "BMW", "70", 2000, "blue", 1000000, "505");
//        Car car2 = new Car(2, "Bugatti", "70", 2001, "green", 1050000, "909");
//        Car car3 = new Car(3, "Toyota", "75", 2020, "grey", 5000000, "707");
//        Car car4 = new Car(4, "Chevrolet", "70", 2015, "yellow", 2000000, "808");
//        Car car5 = new Car(5, "Ferrari", "70", 2002, "black", 8000000, "101");
//
//        carArrayList.add(car1);
//        carArrayList.add(car2);
//        carArrayList.add(car3);
//        carArrayList.add(car4);
//        carArrayList.add(car5);
//
//        for (Car s : carArrayList){
//            if (s.brand.equals("Ferrari")){
//                System.out.println(s);
//            }
//        }
//
//        for (Car s : carArrayList){
//            if (s.brand.equals("Toyoto") && s.yearofissue < 2022){
//                System.out.println(s);
//            }
//        }
//
//        for (Car s : carArrayList){
//            if (s.yearofissue == 2002 && s.price > 6000000){
//                System.out.println(s);
//            }
//        }
//    }
//}
//
//class Car{
//    int id;
//    String brand;
//    String model;
//    int yearofissue;
//    String color;
//    int price;
//    String registrationNum;
//
//    public Car(int id, String brand, String model, int yearofissue, String color, int price, String registrationNum){
//        this.id = id;
//        this.brand = brand;
//        this.model = model;
//        this.yearofissue = yearofissue;
//        this.color = color;
//        this.price = price;
//        this.registrationNum = registrationNum;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "id=" + id +
//                ", brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", yearofissue=" + yearofissue +
//                ", color='" + color + '\'' +
//                ", price=" + price +
//                ", registrationNum='" + registrationNum + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getbrand() {
//        return brand;
//    }
//
//    public void setbrand(String stamp) {
//        this.brand = stamp;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getYearofissue() {
//        return yearofissue;
//    }
//
//    public void setYearofissue(int yearofissue) {
//        this.yearofissue = yearofissue;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getRegistrationNum() {
//        return registrationNum;
//    }
//
//    public void setRegistrationNum(String registrationNum) {
//        this.registrationNum = registrationNum;
//    }
//}








////Problem9
//import java.util.ArrayList;
//import java.util.concurrent.atomic.AtomicReferenceArray;
//
//public class Problem{
// public static void main(String[] args) {
// Product product1 = new Product(1,"BMW","123456 ","Defunct",1000000,21,11);
// Product product2= new Product(2,"Bugatti","789101","China",5000000,8,99);
// Product product3 = new Product(3,"Chevrolet","111213 ","Austria",1050000,10,50);
// Product product4 = new Product(4,"Ferrari","141516 ","Current",2000000,55,73);
// Product product5 = new Product(5,"Toyota","171819","Canada",8000000,75,120);
// Product product6 = new Product(6,"Volkswagen","202122","Belarus",3000000,18,33);
// ArrayList<Product> productArrayList = new ArrayList<>();
// productArrayList.add(product1);
// productArrayList.add(product2);
// productArrayList.add(product3);
// productArrayList.add(product4);
// productArrayList.add(product5);
// productArrayList.add(product6);
//
//
//
// String name_kerek = "Toyota";
// ArrayList<Product> names = new ArrayList<>();
// for(Product s:productArrayList){
// if(s.getName()==name_kerek){
// names.add(s);
//            }
//        }
// System.out.println(names);
//
//
// String names_kerek = "Toyota";
// int baga_needed = 2000000;
// ArrayList<Product> name = new ArrayList<>();
// for(Product s:productArrayList){
// if(s.getName()==name_kerek && s.getPrice()<2500){
// names.add(s);
//            }
//        }
// System.out.println(names);
//
//
// int merzim = 2;
// ArrayList<Product> id = new ArrayList<>();
// for(Product s:productArrayList){
// if(s.shelflife>merzim){
// names.add(s);
//            }
//        }
// System.out.println(names);
//    }
//}
//
//class Product{
//    int id;
//    String name;
//    String UPC;
//    String manufacturer;
//    int price;
//    int shelflife;
//    int quantity;
//
//    public Product(int id, String name, String UPC, String manufacturer, int price, int shelflife, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.UPC = UPC;
//        this.manufacturer = manufacturer;
//        this.price = price;
//        this.shelflife = shelflife;
//        this.quantity = quantity;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", UPC='" + UPC + '\'' +
//                ", manufacturer='" + manufacturer + '\'' +
//                ", price=" + price +
//                ", shelflife=" + shelflife +
//                ", quantity =" + quantity  +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getUPC() {
//        return UPC;
//    }
//
//    public void setUPC(String UPC) {
//        this.UPC = UPC;
//    }
//
//    public String getManufacturer() {
//        return manufacturer;
//    }
//
//    public void setManufacturer(String manufacturer) {
//        this.manufacturer = manufacturer;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public int getShelflife() {
//        return shelflife;
//    }
//
//    public void setShelflife(int shelflife) {
//        this.shelflife = shelflife;
//    }
//
//    public int getQuantity () {
//        return quantity ;
//    }
//
//    public void setQuantity (int quantity ) {
//        this.quantity  = quantity ;
//    }
//}



//Problem10
//import java.util.ArrayList;
//
//public class Problem {
//    public static void main(String [] args){
//        ArrayList<Train> trainsArrayList = new ArrayList<>();
//        Train train1 = new Train("Turkey", 12, "14:48", 75);
//        Train train2 = new Train("Kyrgyzstan", 10, "14:50", 30);
//        Train train3 = new Train("Kazakhstan", 24, "14:49", 93);
//        Train train4 = new Train("Uzbekistan", 48, "14:52", 80);
//        Train train5 = new Train("China", 6, "14:45", 45);
//
//        trainsArrayList.add(train1);
//        trainsArrayList.add(train2);
//        trainsArrayList.add(train3);
//        trainsArrayList.add(train4);
//        trainsArrayList.add(train5);
//
//
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("Uzbekistan")){
//                System.out.println(s);
//            }
//        }
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("Uzbekistan")){
//                if (s.departure_time.equals("14:52")){
//                    System.out.println(s);
//                }
//            }
//        }
//
//        for (Train s : trainsArrayList){
//            if (s.destination.equals("Uzbekistan")){
//                if (s.seats == 95){
//                    System.out.println(s);
//                }
//            }
//        }
//    }
//}
//
//class Train{
//    String destination;
//    int train_number;
//    String departure_time;
//    int seats;
//
//    public Train(String destination, int train_number, String departure_time, int seats){
//        this.destination = destination;
//        this.train_number = train_number;
//        this.departure_time = departure_time;
//        this.seats = seats;
//    }
//
//    @Override
//    public String toString() {
//        return "Train{" +
//                "destination='" + destination + '\'' +
//                ", train_number=" + train_number +
//                ", departure_time='" + departure_time + '\'' +
//                ", quantityOfPlaces=" + seats +
//                '}';
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public int getTrain_number() {
//        return train_number;
//    }
//
//    public void setTrain_number(int train_number) {
//        this.train_number = train_number;
//    }
//
//    public String getDeparture_time() {
//        return departure_time;
//    }
//
//    public void setDeparture_time(String departure_time) {
//        this.departure_time = departure_time;
//    }
//
//    public int getseats() {
//        return seats;
//    }
//
//    public void setseats(int seats) {
//        this.seats = seats;
//    }
//}