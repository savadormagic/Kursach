package ViewModule;

import EntityC.Educator;
import EntityC.Group;
import EntityC.Kid;
import EntityC.Parent;
import logic.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class GUI extends JFrame {

    private JButton button1 = new JButton("add");
    private JButton button2 = new JButton("add group");
    private JButton button3 = new JButton("update");
    private JButton button4 = new JButton("delete");
    private JButton button5 = new JButton("update g");
    private JButton button6 = new JButton("show certain group");
    private JButton button7 = new JButton("delete");
    private JButton button8 = new JButton("show kid");
    private JButton button9 = new JButton("show group");
    private JButton button10 = new JButton("add");
    private JButton button11 = new JButton("update");
    private JButton button12 = new JButton("delete");
    private JButton button13 = new JButton("show educator");
    private JButton button14 = new JButton("Kids");
    private JButton button15 = new JButton("Groups");
    private JButton button16 = new JButton("Educators");
    private JTextField textField1 = new JTextField("", 15);
    private JTextField textField2 = new JTextField("", 15);
    private JTextField textField3 = new JTextField("", 15);
    private JTextField textField4 = new JTextField("", 15);
    private JTextField textField5 = new JTextField("", 15);
    private JTextField textField6 = new JTextField("", 15);
    private JTextField textField7 = new JTextField("", 15);
    private JTextField textField8 = new JTextField("", 15);
    private JTextField textField9 = new JTextField("", 15);
    private JTextField textField10 = new JTextField("", 15);
    private JTextField textField11 = new JTextField("", 15);
    private JTextField textField12 = new JTextField("", 15);
    private JTextField textField13 = new JTextField("", 15);
    private JTextField textField14 = new JTextField("", 15);
    private JTextField textField15 = new JTextField("", 15);
    private JTextField textField16 = new JTextField("", 15);
    private JTextField textField17 = new JTextField("", 15);
    private JTextField textField18 = new JTextField("", 15);


    private JLabel label1 = new JLabel();
    private JLabel label2 = new JLabel();
    private JLabel label3 = new JLabel();
    private JLabel label4 = new JLabel();
    private JLabel label5 = new JLabel();
    private JLabel label6 = new JLabel();
    private JLabel label7 = new JLabel();
    private JLabel label8 = new JLabel();
    private JLabel label9 = new JLabel();
    private JLabel label10 = new JLabel();
    private JLabel label11 = new JLabel();
    private JLabel label12 = new JLabel();
    private JLabel label13 = new JLabel();
    private JLabel label14 = new JLabel();
    private JLabel label15 = new JLabel();
    private JLabel label16 = new JLabel();
    private JLabel label17 = new JLabel();

    private JTextArea textArea1 = new JTextArea();
    private JScrollPane scroll = new JScrollPane(textArea1);

    public GUI(){
        super("proga");
        this.setBounds(100, 100, 800, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField1.setSize(90, 20);
        textField1.setLocation(120, 45);

        textField2.setSize(90, 20);
        textField2.setLocation(120, 70);

        textField3.setSize(90, 20);
        textField3.setLocation(120, 95);

        textField4.setSize(90, 20);
        textField4.setLocation(120, 120);

        textField5.setSize(90, 20);
        textField5.setLocation(120, 145);

        textField6.setSize(90, 20);
        textField6.setLocation(120, 170);

        textField7.setSize(90, 20);
        textField7.setLocation(120, 195);

        textField8.setSize(90, 20);
        textField8.setLocation(120, 220);

        textField9.setSize(90, 20);
        textField9.setLocation(120, 245);

        textField10.setSize(90, 20);
        textField10.setLocation(120, 270);

        textField11.setSize(90, 20);
        textField11.setLocation(250, 250);

        textField12.setSize(90, 20);
        textField12.setLocation(350, 250);

        textField13.setSize(40, 20);
        textField13.setLocation(440, 250);

        textField14.setSize(90, 20);
        textField14.setLocation(650, 45);

        textField15.setSize(90, 20);
        textField15.setLocation(650, 70);

        textField16.setSize(90, 20);
        textField16.setLocation(650, 95);

        textField17.setSize(90, 20);
        textField17.setLocation(650, 120);


        label1.setSize(90, 20);
        label1.setText("name");
        label1.setLocation(70, 45);

        label2.setSize(90, 20);
        label2.setText("surname");
        label2.setLocation(50, 70);

        label3.setSize(90, 20);
        label3.setText("patronymic");
        label3.setLocation(40, 95);

        label4.setSize(120, 20);
        label4.setText("certificate of born");
        label4.setLocation(3, 120);

        label5.setSize(90, 20);
        label5.setText("address");
        label5.setLocation(55, 145);

        label6.setSize(90, 20);
        label6.setText("age");
        label6.setLocation(80, 170);

        label8.setSize(90, 20);
        label8.setText("group id");
        label8.setLocation(55, 195);

        label7.setSize(90, 20);
        label7.setText("parent's name");
        label7.setLocation(20, 220);

        label9.setSize(120, 20);
        label9.setText("parent's surname");
        label9.setLocation(15, 245);

        label10.setSize(120, 20);
        label10.setText("parent's patronymic");
        label10.setLocation(3, 270);

        label11.setSize(120, 20);
        label11.setText("name of group");
        label11.setLocation(250, 270);

        label12.setSize(120, 20);
        label12.setText("id of educator");
        label12.setLocation(355, 270);

        label13.setSize(120, 20);
        label13.setText("num");
        label13.setLocation(445, 270);

        label14.setSize(120, 20);
        label14.setText("name");
        label14.setLocation(570, 45);

        label15.setSize(120, 20);
        label15.setText("surname");
        label15.setLocation(570, 70);

        label16.setSize(120, 20);
        label16.setText("patronymic");
        label16.setLocation(570, 95);

        label17.setSize(120, 20);
        label17.setText("age");
        label17.setLocation(570, 120);

        button1.setSize(90, 20);
        button1.setLocation(120, 300);

        button2.setSize(80, 20);
        button2.setLocation(480, 250);

        button3.setSize(90, 20);
        button3.setLocation(10, 300);

        button4.setSize(200, 30);
        button4.setLocation(10, 325);

        button5.setSize(80, 20);
        button5.setLocation(480, 275);

        button6.setSize(80, 20);
        button6.setLocation(480, 300);

        button7.setSize(80, 20);
        button7.setLocation(480, 325);

        button8.setSize(170, 30);
        button8.setLocation(570, 220);

        button9.setSize(170, 30);
        button9.setLocation(570, 260);

        button10.setSize(80, 20);
        button10.setLocation(570, 150);

        button11.setSize(80, 20);
        button11.setLocation(660, 150);

        button12.setSize(170, 30);
        button12.setLocation(570, 180);

        button13.setSize(170, 30);
        button13.setLocation(570, 300);

        button14.setSize(60, 50);
        button14.setLocation(250, 300);

        button15.setSize(80, 50);
        button15.setLocation(320, 300);

        button16.setSize(60, 50);
        button16.setLocation(410, 300);

        textArea1.setSize(310, 200);
        textArea1.setLocation(250, 45);

        scroll.setSize(310, 200);
        scroll.setLocation(250, 45);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        button1.addActionListener(actionListener());
        button2.addActionListener(actionListener2());
        button3.addActionListener(actionListener3());
        button4.addActionListener(actionListener4());
        button5.addActionListener(actionListener5());
        button6.addActionListener(actionListener6());
        button7.addActionListener(actionListener7());
        button8.addActionListener(actionListener8());
        button9.addActionListener(actionListener9());
        button10.addActionListener(actionListener10());
        button11.addActionListener(actionListener11());
        button12.addActionListener(actionListener12());
        button13.addActionListener(actionListener13());
        button14.addActionListener(actionListener14());
        button15.addActionListener(actionListener15());
        button16.addActionListener(actionListener16());

        setLayout(null);

        add(textField1);
        add(textField2);
        add(textField3);
        add(textField4);
        add(textField5);
        add(textField6);
        add(textField7);
        add(textField8);
        add(textField9);
        add(textField10);
        add(textField11);
        add(textField12);
        add(textField13);
        add(textField14);
        add(textField15);
        add(textField16);
        add(textField17);
        add(textField18);

        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
        add(label8);
        add(label9);
        add(label10);
        add(label11);
        add(label12);
        add(label13);
        add(label14);
        add(label15);
        add(label16);
        add(label16);
        add(label17);

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button10);
        add(button11);
        add(button12);
        add(button13);
        add(button14);
        add(button15);
        add(button16);

        /*add(textArea1);*/
        add(scroll);

    }


    private ActionListener actionListener() {
        return e -> {
           createKid();
        };
    }

    private ActionListener actionListener2() {
        return e -> {
           createGroup();
        };
    }

    private ActionListener actionListener3() {
        return e -> {
            updateKid();
        };
    }

    private ActionListener actionListener4() {
        return e -> {
            deleteKid();
        };
    }

    private ActionListener actionListener5() {
        return e -> {
            updateGroup();
        };
    }

    private ActionListener actionListener6() {
        return e -> {
            readGroup();
        };
    }

    private ActionListener actionListener7() {
        return e -> {
            deleteGroup();
        };
    }

    private ActionListener actionListener8() {
        return e -> {
            readKid();
        };
    }


    private ActionListener actionListener9() {
        return e -> {
            readGroup();
        };
    }

    private ActionListener actionListener10() {
        return e -> {
            createEducator();
        };
    }

    private ActionListener actionListener11() {
        return e -> {
            updateEducator();
        };
    }

    private ActionListener actionListener12() {
        return e -> {
            deleteEducator();
        };
    }

    private ActionListener actionListener13() {
        return e -> {
            readEducator();
        };
    }

    private ActionListener actionListener14() {
        return e -> {
            getAllKids();
        };
    }

    private ActionListener actionListener15() {
        return e -> {
            getAllGroups();
        };
    }


    private ActionListener actionListener16() {
        return e -> {
            getAllGroups();
        };
    }


    public void readKid(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Kid, Integer> kidStringDao = new KidDaoImpl(factory);
            Dao<Parent, Integer> parentIntegerDao = new ParentDaoImpl(factory);

            final Kid result = kidStringDao.read(Integer.parseInt(textField4.getText()));
            final Parent p = parentIntegerDao.read(result.getParentid1());


            textArea1.setText(result.toString() + "\n" + p.toString());
            //read
            System.out.println("Kid: " + result);
            System.out.println("Parent: " + p);

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }


    public void createKid(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Kid, Integer> kidStringDao = new KidDaoImpl(factory);
            Dao<Parent, Integer> parentIntegerDao = new ParentDaoImpl(factory);
            try {
                final Kid kid1 = new Kid();
                final Parent parent1 = new Parent();
                kid1.setName(textField1.getText());
                kid1.setSurname(textField2.getText());
                kid1.setPatronymic(textField3.getText());
                kid1.setCertificateOfBorn(Integer.parseInt(textField4.getText()));
                kid1.setAddress(textField5.getText());
                kid1.setAge(Integer.parseInt(textField6.getText()));
                kid1.setGroupid(Integer.parseInt(textField7.getText()));
                parent1.setName(textField8.getText());
                parent1.setSurname(textField9.getText());
                parent1.setPatronymic(textField10.getText());
                parentIntegerDao.create(parent1);
                kid1.setParentid1(parent1.getId());
                kidStringDao.create(kid1);
                textArea1.setText("Created: \n" + kid1.toString());
            } catch (Exception e) {
                textArea1.setText("kid with this certificate \nof born hsa already exists");
            }
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }


    public void updateKid(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Kid, Integer> kidStringDao = new KidDaoImpl(factory);
            Dao<Parent, Integer> parentIntegerDao = new ParentDaoImpl(factory);

            System.out.println("input kid's certificate of born");
            final Kid kid1 = kidStringDao.read(Integer.parseInt(textField4.getText()));
            final Parent parent1 = parentIntegerDao.read(kid1.getParentid1());

            kid1.setName(textField1.getText());
            kid1.setSurname(textField2.getText());
            kid1.setPatronymic(textField3.getText());
            kid1.setCertificateOfBorn(Integer.parseInt(textField4.getText()));
            kid1.setAddress(textField5.getText());
            kid1.setAge(Integer.parseInt(textField6.getText()));
            kid1.setGroupid(Integer.parseInt(textField7.getText()));
            /*parent1.setName(textField8.getText());
            parent1.setSurname(textField9.getText());
            parent1.setPatronymic(textField10.getText());*/
            kidStringDao.update(kid1);

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }


    public void deleteKid(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Kid, Integer> kidStringDao = new KidDaoImpl(factory);
            Dao<Parent, Integer> parentIntegerDao = new ParentDaoImpl(factory);

            final Kid kid1 = kidStringDao.read(Integer.parseInt(textField4.getText()));
            final Parent parent1 = parentIntegerDao.read(kid1.getParentid1());
            parentIntegerDao.delete(parent1);
            kidStringDao.delete(kid1);

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void getAllKids(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Kid, Integer> kidStringDao = new KidDaoImpl(factory);
            textArea1.setText(kidStringDao.getAll().toString());

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }


    public void createGroup(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Group, Integer> groupIntegerDao = new GroupsDaoImpl(factory);
            try {
                final Group group = new Group();
                group.setId(Integer.parseInt(textField13.getText()));
                group.setNameofgroup(textField11.getText());
                group.setEducatorid(Integer.parseInt(textField12.getText()));
                groupIntegerDao.create(group);
                textArea1.setText("Created new group\n" + group.toString());
            } catch (Exception e) {
                textArea1.setText("group with this number has already exist");
            }
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }


    public void updateGroup(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Group, Integer> groupIntegerDao = new GroupsDaoImpl(factory);
            final Group group1 = groupIntegerDao.read(Integer.parseInt(textField13.getText()));
            group1.setNameofgroup(textField11.getText());
            group1.setEducatorid(Integer.parseInt(textField12.getText()));
            groupIntegerDao.update(group1);
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void readGroup(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Group, Integer> groupIntegerDao = new GroupsDaoImpl(factory);

           final Group group1 = groupIntegerDao.read(Integer.parseInt(textField13.getText()));

           textArea1.setText(group1.toString());

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void deleteGroup(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Group, Integer> groupIntegerDao = new GroupsDaoImpl(factory);

            final Group group1 = groupIntegerDao.read(Integer.parseInt(textField13.getText()));
            groupIntegerDao.delete(group1);

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void getAllGroups(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Group, Integer> groupIntegerDao = new GroupsDaoImpl(factory);

            final Group group1 = new Group();
            textArea1.setText(groupIntegerDao.getAll().toString());

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }



    public void createEducator(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Educator, Integer> educatorIntegerDao = new EducatorDaoIml(factory);
            try {
                final Educator educator1 = new Educator();
                educator1.setName(textField14.getText());
                educator1.setSurname(textField15.getText());
                educator1.setPatronymic(textField16.getText());
                educator1.setAge(Integer.parseInt(textField17.getText()));
                educatorIntegerDao.create(educator1);
                textArea1.setText("created: \n" + educator1.toString());

            } catch (Exception e) {
                textArea1.setText("unknown");
            }
        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void deleteEducator(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Educator, Integer> educatorIntegerDao = new EducatorDaoIml(factory);

            final Educator educator = educatorIntegerDao.read(Integer.parseInt(textField13.getText()));
            educatorIntegerDao.delete(educator);
            textArea1.setText("fired");

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }


    public void updateEducator(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Educator, Integer> educatorIntegerDao = new EducatorDaoIml(factory);

            final Educator educator = educatorIntegerDao.read(Integer.parseInt(textField13.getText()));
            educator.setName(textField14.getText());
            educator.setSurname(textField15.getText());
            educator.setPatronymic(textField16.getText());
            educator.setAge(Integer.parseInt(textField17.getText()));
            educatorIntegerDao.update(educator);

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void readEducator(){
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Educator, Integer> educatorIntegerDao = new EducatorDaoIml(factory);
            final  Educator educator = educatorIntegerDao.read(Integer.parseInt(textField13.getText()));
            textArea1.setText(educator.toString());

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

    public void getAllEducators(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            Dao<Educator, Integer> educatorIntegerDao = new EducatorDaoIml(factory);

            textArea1.setText(educatorIntegerDao.getAll().toString());

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }

}
