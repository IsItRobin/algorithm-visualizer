import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        myframe frame = new myframe();

        Font font = new Font("Arial", Font.PLAIN, 30);
        Font Helpfont = new Font("Arial", Font.BOLD, 15);

        Color fade = new Color(0, 0, 0, 70);

        // Set frame layout to null first
        frame.setLayout(null);





        // ------------------------ J-panel User_area -------------------------------------
        JPanel userarea = new JPanel();
        userarea.setBounds(0, 0, 720, 86);
        userarea.setBackground(new Color(228, 228, 228));
        userarea.setLayout(null);  // Manual positioning for its components
        frame.add(userarea);




        // ------------------------ Algo_viz Label ------------------------
        JLabel Algo = new JLabel("Algo_viz");
        Algo.setBounds(70, 0, 170, 55);
        userarea.add(Algo);  // Add Dashboard label to userarea


        // ------------------------ Dashboard Label ------------------------
        JLabel dash = new JLabel("Dashboard");
        dash.setBounds(70, 10, 170, 55);
        userarea.add(dash);  // Add Dashboard label to userarea



        // ------------------------ User Name Label ------------------------
        JLabel user_name = new JLabel("User name");
        user_name.setHorizontalTextPosition(JLabel.CENTER);
        user_name.setVerticalAlignment(JLabel.CENTER);
        user_name.setBounds(400, 0, 170, 55); // Adjust position to avoid overlap with dash
        userarea.add(user_name);  // Add user_name label to userarea

        // ------------------------ Student ------------------------
        JLabel student = new JLabel("student");
        student.setHorizontalTextPosition(JLabel.CENTER);
        student.setVerticalAlignment(JLabel.CENTER);
        student.setBounds(400, 10, 170, 55); // Adjust position to avoid overlap with dash
        userarea.add(student);  // Add user_name label to userarea





        // ------------------------ J-panel today date side -------------------------------------
        JPanel top = new JPanel();
        top.setBounds(0, 85, 360, 86);
        top.setBackground(new Color(202, 0, 255, 255));
        top.setLayout(null);  // Manual positioning within top
        frame.add(top);

        //        ------------------------Today date------------------------

        JLabel date = new JLabel("Today date");
        date.setBounds(70, 20, 180, 43);
        top.add(date);  // Add date label to top






//        JLabel date = new JLabel();
////        calling date function
//        SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        Date todaydate = new Date();
////        showing date
//        String d =formatter.format(date);
//
//
//        System.out.println();
//        date.setText(" "+ d);
////        alignment of text hori and vertically
//        date.setHorizontalTextPosition(JLabel.CENTER);
//        date.setVerticalAlignment(JLabel.TOP);
////        as we have set frame layout null so we need to adjust the layout
//        date.setBounds(40,130,167,55);
//        date.setFont(font);
//



//        ------------------------Today day-----------------------


//
//        JLabel day = new JLabel();
//
//        //      calling date formater
//
//        DateTimeFormatter formater1 = DateTimeFormatter.ofPattern("MM");
//        String todayday = today.format(formater1);
//
//        day.setText(" "+ todayday);
//        day.setHorizontalTextPosition(JLabel.CENTER);
//        day.setVerticalAlignment(JLabel.BOTTOM);
//        day.setBounds(80,80,70,70);



//       ------------------------Today  months------------------------


//        JLabel Month = new JLabel();
//
//        LocalDate  month= LocalDate.now();
//        DateTimeFormatter formater2= DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String monthofweek = today.format(formater2);
//        Month.setText(" " + monthofweek);
//        Month.setHorizontalTextPosition(JLabel.CENTER);
//        Month.setVerticalAlignment(JLabel.BOTTOM);
//        Month.setBounds(80,90,70, 70);






        // ---------------------------- j-panel right side default text ----------------------------
        JPanel top_left = new JPanel();
        top_left.setBounds(360, 85, 360, 86);
        top_left.setBackground(new Color(144, 248, 6));
        top_left.setLayout(null);  // Manual positioning
        frame.add(top_left);




        JLabel Helptext = new JLabel("HEY, NEED ANY HELP ?");
        Helptext.setBounds(40, 20, 180, 43);
        Helptext.setFont(Helpfont);
        top_left.add(Helptext);  // Add Helptext to top_left

        JLabel Helpfade = new JLabel(" | Just ask me Anything !");
        Helpfade.setBounds(40, 40, 180, 43);
        Helpfade.setForeground(fade);
        top_left.add(Helpfade);  // Add Helpfade to top_left





        // ---------------------------- j-panel end left and right ----------------------------
        JPanel end_right = new JPanel();
        end_right.setBounds(0, 169, 360, 392);
        end_right.setBackground(new Color(49, 8, 228));
        frame.add(end_right);  // Add end_right panel to frame

        JPanel end_left = new JPanel();
        end_left.setBounds(360, 169, 600, 392);
        end_left.setBackground(new Color(197, 9, 9));
        frame.add(end_left);  // Add end_left panel to frame


    }
}




