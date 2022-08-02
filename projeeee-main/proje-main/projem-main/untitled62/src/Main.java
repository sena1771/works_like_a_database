import java.io.*;

import java.util.ArrayList;

import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int id;
        String name;
        String branch;
        String current;
        ArrayList<Shipment> all5 = new ArrayList<>();
        File f7 = null;

        //List<String> current_place = Files.readAllLines(new File("C:\\Users\\Administrator\\Desktop\\projem-main\\untitled62\\src\\CurrentPlaceList.txt").toPath(), Charset.defaultCharset() );
        //current_place.add("Gebze");
        //current_place.add("Kocaeli");
        //current_place.add("Canakkale");
/* Scanner s = new Scanner(new File("filepath"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();*/
        FileInputStream fis7 = null;
        ObjectInputStream ois7 = null;
        FileOutputStream fos7 = null;
        ObjectOutputStream oos7 = null;
        // Shipment shipment1 = new Shipment(1, "Sena Engin", "Fatma Dogan");
        //Shipment shipment2 = new Shipment(2, "Feyza Engin", "Ayse Dogan");
        //List all=new ArrayList<Customer>();
        ArrayList<Customer> all = new ArrayList<Customer>();
        File f4 = null;
        FileInputStream fis4 = null;
        ObjectInputStream ois4 = null;
        FileOutputStream fos4 = null;
        ObjectOutputStream oos4 = null;
        //Scanner scannn=new Scanner(System.in);

        ArrayList<Transportation> al2 = new ArrayList<Transportation>();
        File f1 = null;
        FileInputStream fis1 = null;
        ObjectInputStream ois1 = null;
        FileOutputStream fos1 = null;
        ObjectOutputStream oos1 = null;
        Scanner scan = new Scanner(System.in);
        //List al=new ArrayList<Employee>();
        //

        ArrayList<Employee> al = new ArrayList<Employee>();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner1=new Scanner(System.in);

        ArrayList<Branch> al3 = new ArrayList<Branch>();
        File f2 = null;
        FileInputStream fis2 = null;
        ObjectInputStream ois2 = null;
        FileOutputStream fos2 = null;
        ObjectOutputStream oos2 = null;
        try {

            f7 = new File("C:\\Users\\Administrator\\Desktop\\projeeee-main\\proje-main\\projem-main\\untitled62\\src\\ShipmentList3.txt ");
            //boolean result;
            //result = f4.createNewFile();
            if (f7.exists()) {

                fis7 = new FileInputStream(f7);
                ois7 = new ObjectInputStream(fis7);
                all5 = (ArrayList<Shipment>) ois7.readObject();
            }

        } catch (Exception exp) {
            System.out.println(exp);
        }
        // Scanner scanner2=new Scanner(System.in);
/*System.out.println("Give the shipment ID:");
int d=scan.nextInt();
System.out.println("Shipment Receiver: ");
String y=scan.next();
System.out.println("Shipment Sender :");
String o=scan.next();
System.out.println("Current place: ");
String x=scan.next();
        all5.add(new Shipment(d,y,o,x));
        Admin.display4(all5);*/


        try {

            //String s = oos1.toString();
            //String s2 = String.valueOf(oos1);
            fos7 = new FileOutputStream(f7);
            oos7 = new ObjectOutputStream(fos7);
            oos7.writeObject(all5);
            //fos4 = new FileOutputStream(f4);
            //oos4 = new ObjectOutputStream(fos4);
            //oos4.writeObject(all);
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            try {


                ois7.close();
                fos7.close();
                oos7.close();

            } catch (Exception e1) {
                e1.printStackTrace();
            }

        }
        //System.out.println("\nFiles are saved");
        //scan.close();
        //System.exit(0);
                    /*System.out.println("Enter the system as a:  \n 1-Administrator \n " +
                            "2-Branch employee \n " +
                            "3-Transportation personnel \n" +
                            "4-Customer\n"+
                            "5-Exit");
                    int enter2 = scanner.nextInt();*/

        System.out.println("Enter the system as a:  \n 1-Administrator \n " +
                "2-Branch employee \n " +
                "3-Transportation personnel \n" +
                "4-Customer\n" +
                "5-Exit");

        int enter = scanner.nextInt();

        try {

            f4 = new File("C:\\Users\\Administrator\\Desktop\\projeeee-main\\proje-main\\projem-main\\untitled62\\src\\CustomerList.txt ");
            //boolean result;
            //result = f4.createNewFile();
            if (f4.exists()) {
                fis4 = new FileInputStream(f4);
                ois4 = new ObjectInputStream(fis4);
                all = (ArrayList<Customer>) ois4.readObject();
            }

        } catch (Exception exp) {
            System.out.println(exp);
        }
        try {
            //Path fi = Paths.get("C:\\Users\\DELL\\IdeaProjects\\untitled62\\src\\EmployeeDataList1.txt");
           /*try {
               Files.write(fi, al);
               System.out.println(fi.toFile().getAbsolutePath());
           } catch (Exception e) {
               e.printStackTrace();
           } */
            f = new File("C:\\Users\\Administrator\\Desktop\\projeeee-main\\proje-main\\projem-main\\untitled62\\src\\EmployeeDataList1.txt");
            /*BufferedWriter writer = new BufferedWriter(new FileWriter(f, true));
            writer.write(al.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } */
            if (f.exists()) {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                al = (ArrayList<Employee>) ois.readObject();
            }

        }
        //ois.close();
        //f.mkdirs();
        //f.createNewFile();
          /* try {
               Files.write(f, al);
               System.out.println(
                       f.toFile().getAbsolutePath()
               );
           } catch (Exception e) {
               e.printStackTrace();
           } */
        //boolean result;
        //try
        //{
        //result = f.createNewFile();
           /* if(result)
            {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                al = (ArrayList<Employee>)ois.readObject(); */


               /* try {
                    path(output, arrList);
                    System.out.println(
                            output.toFile().getAbsolutePath()
                    );
                } catch (Exception e) {
                    e.printStackTrace();
                }
*}
           /* else {
                System.out.println("ddff"); }*/ catch (Exception exp) {
            System.out.println(exp);
        }
        //all5.add(new Shipment(1,"Ayse Dogan","Kamil Yuce","Gebze"));
        //all5.add(new Shipment(2,"Merve Gunes","Sefa Gun","Canakkale"));

        //Admin.display4(all5);
        try {
            f2 = new File("C:\\Users\\Administrator\\Desktop\\projeeee-main\\proje-main\\projem-main\\untitled62\\src\\BranchList.txt");
            //f2 = new File("EmployeeDataList2.txt");
            //boolean result;
            //result = f2.createNewFile();
            if (f2.exists()) {

                fis2 = new FileInputStream(f2);
                ois2 = new ObjectInputStream(fis2);
                al3 = (ArrayList<Branch>) ois2.readObject();
            }


        } catch (Exception exp1) {
            System.out.println(exp1);
        }
        try {
            f1 = new File("C:\\Users\\Administrator\\Desktop\\projeeee-main\\proje-main\\projem-main\\untitled62\\src\\TransportPersonel.txt");
            // boolean result;
            // result = f1.createNewFile();
            if (f1.exists()) {
                fis1 = new FileInputStream(f1);
                ois1 = new ObjectInputStream(fis1);
                al2 = (ArrayList<Transportation>) ois1.readObject();
            }


        } catch (Exception exp2) {
            System.out.println(exp2);
        }


        switch (enter) {
            case 1:
                do {
                    System.out.println("\n---------Welcome the X Cargo Company------\n");
                    System.out.println("1). Add Employee to the DataBase\n" +
                            "2). Search for Employee\n" +
                            "3). Delete Employee \n" +
                            "4). List All Employees \n" +
                            "5). EXIT\n" +
                            "6). Add Transportation Personnel \n " +
                            "7). Search for Transportation Personnel \n" +
                            "8). Remove Transportation Personnel \n " +
                            "9). List All Transportation Personnel \n" +
                            "10) . Add Branch \n " +
                            "11) . Remove Branch \n" +
                            "12). List All Branches");
                    System.out.println("Enter your choice : ");
                    int ch = scan.nextInt();
                    switch (ch) {
                        case 1:

                            System.out.println("\nAdd Employee to the list:\n");
                            System.out.println("Enter ID :");
                            id = scan.nextInt();
                            System.out.println("Enter Name :");
                            name = scan.next();
                            System.out.println("Enter Branch Name: ");
                            branch = scan.next();
                            // boolean ans = al3.contains(scan.nextLine());
                            boolean a = false;
                            for (int i = 0; i < al3.size(); i++) {

                                if (al3.get(i).name2.equals(branch)) {
                                    al.add(new Employee(id, name, branch));
                                    Admin.display(al);
                                    a = true;
                                    break;
                                }

                            }
                            if (!a) {
                                System.out.println("This branch does not exist.TRY AGAIN!");
                            }


                            break;
                        case 2:
                            System.out.println("Enter the Employee ID to search :");
                            id = scan.nextInt();
                            int i = 0;
                            for (Employee e : al) {
                                if (id == e.id) {
                                    System.out.println(e + "\n");
                                    i++;
                                }
                            }
                            if (i == 0) {
                                System.out.println("\nEmployee is not available, Please enter a valid ID!!");
                            }
                            break;

                        case 3:
                            System.out.println("\nEmployee ID:");
                            id = scan.nextInt();
                            int k = 0;
                            try {
                                for (Employee e : al) {
                                    if (id == e.id) {
                                        al.remove(e);
                                        Admin.display(al);
                                        k++;
                                    }
                                }
                                if (k == 0) {
                                    System.out.println("\nEmployee is not available, Please enter a valid ID!!");
                                }
                            } catch (Exception ex) {
                                System.out.println(ex);
                            }
                            break;
                        case 4:
                            try {
                                al = (ArrayList<Employee>) ois.readObject();

                            } catch (ClassNotFoundException e2) {

                                System.out.println(e2);
                            } catch (Exception e2) {

                                System.out.println(e2);
                            }
                            Admin.display(al);
                            break;

                        case 5:
                            try {
                                fos = new FileOutputStream(f);
                                oos = new ObjectOutputStream(fos);
                                oos.writeObject(al);
                                fos1 = new FileOutputStream(f1);
                                oos1 = new ObjectOutputStream(fos1);
                                oos1.writeObject(al2);

                                //String s = oos1.toString();
                                //String s2 = String.valueOf(oos1);
                                fos2 = new FileOutputStream(f2);
                                oos2 = new ObjectOutputStream(fos2);
                                oos2.writeObject(al3);
                                //fos4 = new FileOutputStream(f4);
                                //oos4 = new ObjectOutputStream(fos4);
                                //oos4.writeObject(all);
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            } finally {
                                try {

                                    ois.close();
                                    fos.close();
                                    oos.close();
                                    ois1.close();
                                    fos1.close();
                                    oos1.close();
                                    ois2.close();
                                    fos2.close();
                                    oos2.close();
                                    //ois4.close();
                                    // fos4.close();
                                    //oos4.close();

                                } catch (Exception e1) {
                                    e1.printStackTrace();
                                }

                            }
                            System.out.println("\nFiles are saved");
                            scan.close();
                            System.exit(0);
                    /*System.out.println("Enter the system as a:  \n 1-Administrator \n " +
                            "2-Branch employee \n " +
                            "3-Transportation personnel \n" +
                            "4-Customer\n"+
                            "5-Exit");
                    int enter2 = scanner.nextInt();*/
                            break;


                        case 6:

                            System.out.println("Enter Transportation Personel ID :");
                            id = scan.nextInt();
                            System.out.println("Enter Name :");
                            name = scan.next();
                            System.out.println("Enter Branch: ");
                            branch = scan.next();
                            al2.add(new Transportation(id, name, branch));
                            Admin.display2(al2);
                            break;
                        case 7:
                            System.out.println("Enter the Transport Personel ID to search :");
                            id = scanner.nextInt();
                            int i1 = 0;
                            for (Transportation e : al2) {
                                if (id == e.id1) {
                                    System.out.println(e + "\n");
                                    i1++;
                                }
                            }
                            if (i1 == 0) {
                                System.out.println("\nEmployee is not available, Please enter a valid ID!!");
                            }
                            break;
                        case 8:
                            System.out.println("\nPersonnel ID :");
                            id = scan.nextInt();
                            int k1 = 0;
                            try {
                                for (Transportation e : al2) {
                                    if (id == e.id1) {
                                        al2.remove(e);
                                        Admin.display2(al2);
                                        k1++;
                                    }
                                }
                                if (k1 == 0) {
                                    System.out.println("\nEmployee is not available, Please enter a valid ID!!");
                                }
                            } catch (Exception ex) {
                                System.out.println(ex);
                            }
                            break;
                        case 9:

                            try {
                                al2 = (ArrayList<Transportation>) ois1.readObject();

                            } catch (ClassNotFoundException e2) {

                                System.out.println(e2);
                            } catch (Exception e2) {

                                System.out.println(e2);
                            }
                            Admin.display2(al2);
                            break;

                        case 10:

                            System.out.println("Enter Branch ID :");
                            id = scan.nextInt();
                            System.out.println("Enter Branch Name :");
                            name = scan.next();

                            al3.add(new Branch(id, name));
                            Admin.display3(al3);
                            break;
                        case 11:
                            System.out.println("\nBranch ID :");
                            id = scan.nextInt();
                            int g = 0;
                            try {
                                for (Branch e : al3) {
                                    if (id == e.id2) {
                                        al3.remove(e);
                                        Admin.display3(al3);
                                        g++;
                                    }
                                }
                                if (g == 0) {
                                    System.out.println("\nEmployee is not available, Please enter a valid ID!!");
                                }
                            } catch (Exception ex) {
                                System.out.println(ex);
                            }
                            break;
                        case 12:
                            try {
                                al3 = (ArrayList<Branch>) ois2.readObject();

                            } catch (ClassNotFoundException e3) {

                                System.out.println(e3);
                            } catch (Exception e3) {

                                System.out.println(e3);
                            }
                            Admin.display3(al3);
                            break;

                        default:
                            System.out.println("\nEnter a correct choice from the List :");
                            break;

                    }
                }
                while (true);
            case 2:

                Scanner sca = new Scanner(System.in);
                System.out.println("Employee ID: ");
                int id4 = sca.nextInt();
                boolean b = false;
                for (int i = 0; i < al.size(); i++) {

                    if (al.get(i).id == id4) {
                        System.out.println("Succesfully entered the system");
                        b = true;

                    }

                }

                if (!b) {
                    System.out.println("This employee ID does not exist.TRY AGAIN!");
                    break;
                }


                //for(Employee e : al)

//if(id4==e.id){
                //System.out.println("Your branch is: "+e.branch );
//}

                do {
                    System.out.println("1). Add Customer \n" +
                            "2). Remove the Customer\n" +
                            "3). Add Cargo Status: \n" +
                            "4). EXIT\n" +
                            "5). List all Customers\n" +
                            "6).List all Shipment Informations");
                    System.out.println("Enter your choice : ");
                    int chf = scan.nextInt();

                    switch (chf) {
                        case 1:
                            System.out.println("\n Enter a ID for customer:\n");

                            id = scan.nextInt();
                            System.out.println("Enter Name :");
                            name = scan.next();

                            all.add(new Customer(id, name));
                            Employee.display4(all);
                            break;
                        case 2:
                            System.out.println("\nDelete Customer :");
                            id = scanner.nextInt();
                            int j = 0;
                            try {
                                for (Customer a : all) {
                                    if (id == a.id) {
                                        all.remove(a);
                                        Employee.display4(all);
                                        j++;
                                    }
                                }
                                if (j == 0) {
                                    System.out.println("\nCustomer is not available, Please enter a valid ID!!");
                                }
                            } catch (Exception ex3) {
                                System.out.println(ex3);
                            }
                            break;
                        case 3:
                            System.out.println("Shipment ID: ");
                            int idm = scan.nextInt();
                            boolean c = false;
                            for (int i = 0; i < all5.size(); i++) {

                                if (all5.get(i).id == (idm)) {
                                    System.out.println("Succesfully has been entered the system");
                                    System.out.println("Enter a delete process 2 then for add process 1: ");
                                    int swc1 = scan.nextInt();

                                    switch (swc1) {
                                        case 2:
                                            System.out.println("\nDelete Shipment :");
                                            id = scanner.nextInt();
                                            int p = 0;
                                            try {
                                                for (Shipment e : all5) {
                                                    if (id == e.id) {
                                                        all5.remove(e);
                                                        Admin.display4(all5);
                                                        p++;
                                                    }
                                                }
                                                if (p == 0) {
                                                    System.out.println("\nShipment is not available, Please enter a valid ID!!");
                                                }
                                            } catch (Exception ex3) {
                                                System.out.println(ex3);
                                            }

                                        case 1:
                                            System.out.println("\n Enter a new ID for Shipment:\n");

                                            id = scan.nextInt();
                                            System.out.println("Enter Sender Name :");
                                            name = scan.next();
                                            System.out.println("Enter Receiver Name: ");
                                            branch = scan.next();
                                            System.out.println("Update the Current Place ");
                                            current = scan.next();

                                            all5.add(new Shipment(id, name, branch, current));
                                            Admin.display4(all5);
                                            break;

                                    }

                                    //System.out.println(" ------ Write the Current Status of Shipment :" );
                                    //String kf=scanner.next();
                                    //System.out.println("\nDelete Customer :");


                                    //all5.set(0,all5.get(i).id);
                                    //int rl=all5.indexOf("hasan");
                                    //System.out.println(rl);
                                    //change the current status in the shipmentlist3.txt completely.


                                    // if(kf.equals(al3.get(i).name2)) {
                                    //   for (int b= 0; b < all5.size(); b++) {

                                    // System.out.println("Current status has been updated-----"+al3.get(b).name2);

                                    // }
                                }

                                // for (int b= 0; b < al3.size(); b++) {

                                //System.out.println(al3.get(b).name2);
                                //}
                                c = true;
                                break;
                            }


                            if (!c) {
                                System.out.println("This shipment ID does not exist.TRY AGAIN!");
                            }


                            break;

                        // if(idm==Shipment.id){

                        // System.out.println("Shipment status changed ------Current Status: ");
                        // }
                        case 5:

                            try {
                                all = (ArrayList<Customer>) ois4.readObject();

                            } catch (ClassNotFoundException e2) {

                                System.out.println(e2);
                            } catch (Exception e2) {

                                System.out.println(e2);
                            }
                            Employee.display4(all);
                            break;
                        case 4:
                            try {


                                fos4 = new FileOutputStream(f4);
                                oos4 = new ObjectOutputStream(fos4);
                                oos4.writeObject(all);
                                fos7 = new FileOutputStream(f7);
                                oos7 = new ObjectOutputStream(fos7);
                                oos7.writeObject(all5);
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            } finally {
                                try {

                                    ois4.close();
                                    fos4.close();
                                    oos4.close();
                                    ois7.close();
                                    fos7.close();
                                    oos7.close();

                                } catch (Exception e1) {
                                    e1.printStackTrace();
                                }

                            }
                            System.out.println("\nFiles are saved");
                            scan.close();
                            System.exit(0);

                            break;
                        case 6:
                            try {
                                all5 = (ArrayList<Shipment>) ois7.readObject();

                            } catch (ClassNotFoundException e2) {

                                System.out.println(e2);
                            } catch (Exception e2) {

                                System.out.println(e2);
                            }
                            Admin.display4(all5);
                            break;
                    }


                } while (true);
            case 4:

                System.out.println("Enter the shipment ID to show the Cargo Status: ");
                int sc = scan.nextInt();


                boolean u = false;
                for (int i = 0; i < all5.size(); i++) {

                    if (all5.get(i).id == (sc)) {
                        System.out.println("Succesfully has been entered the system\n");
                        System.out.println("Cargo Information: \n");
                        System.out.println("Sender-----" + all5.get(i).sender);
                        System.out.println("Receiver----" + all5.get(i).receiver);
                        System.out.println("Current Place-----" + all5.get(i).current_place);

                        break;
                    }

                }
                    break;
                case 3:
                    System.out.println("1).Update the Shipment : \n"+
                            "2). EXIT");
                    int ff=scanner.nextInt();
                    switch (ff) {
                        case 1:

                            System.out.println("Enter the personnel ID: ");
                            id = scan.nextInt();
                            for (int i = 0; i < al2.size(); i++) {

                                if (id == al2.get(i).id1) {
                                    System.out.println("Succesfully has been entered the system ");

                                System.out.println("Firstly Enter 2 to delete   ");
                                Scanner scanner1 = new Scanner(System.in);
                                int id5 = scanner1.nextInt();

                                    switch (id5) {
                                        case 2:
                                            System.out.println("\nDelete Shipment ID :");
                                            int id2 = scanner.nextInt();
                                            int p = 0;
                                            try {

                                                for (Shipment e : all5) {
                                                    System.out.println(id2);
                                                    if (id2 == e.id) {
                                                        all5.remove(e);
                                                        Admin.display4(all5);
                                                        p++;
                                                    }
                                                }
                                                if (p == 0) {
                                                    System.out.println("\nShipment is not available, Please enter a valid ID!!");
                                                }

                                            } catch (Exception ex3) {
                                                System.out.println(ex3);
                                            }
                                            // System.out.println("Enter 1 to add new shipment information");
                                        case 1:
                                            System.out.println("\n Enter a new ID for Shipment:\n");

                                            id = scan.nextInt();
                                            System.out.println("Enter Sender Name :");
                                            name = scan.next();
                                            System.out.println("Enter Receiver Name: ");
                                            branch = scan.next();
                                            System.out.println("Update the Current Place ");
                                            current = scan.next();

                                            all5.add(new Shipment(id, name, branch, current));
                                            Admin.display4(all5);
                                            break;

                                    }

                                    //System.out.println(" ------ Write the Current Status of Shipment :" );
                                    //String kf=scanner.next();
                                    //System.out.println("\nDelete Customer :");


                                    //all5.set(0,all5.get(i).id);
                                    //int rl=all5.indexOf("hasan");
                                    //System.out.println(rl);
                                    //change the current status in the shipmentlist3.txt completely.


                                    // if(kf.equals(al3.get(i).name2)) {
                                    //   for (int b= 0; b < all5.size(); b++) {

                                    // System.out.println("Current status has been updated-----"+al3.get(b).name2);

                                    // }
                                    break;

                                }

                            }
                            u = true;


                            if (!u) {
                                System.out.println("Personnel ID does not exist.TRY AGAIN!");
                                break;
                            }

            case 2:

                try {




                    fos7 = new FileOutputStream(f7);
                    oos7 = new ObjectOutputStream(fos7);
                    oos7.writeObject(all5);
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (Exception e2) {
                    e2.printStackTrace();
                } finally {
                    try {


                        ois7.close();
                        fos7.close();
                        oos7.close();

                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }

                }
                System.out.println("\nFiles are saved");
                scan.close();
                System.exit(0);

                break;
                    }

            default:
                //why this returns too???
                System.out.println("\nEnter a correct choice from the List :");
        }

    }

}