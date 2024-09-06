import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
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
        top.setBackground(new Color(195, 0, 248, 255));
        top.setLayout(null);  // Manual positioning within top
        frame.add(top);

// ------------------------ Circular Button with Date ------------------------
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        String day = currentDate.format(formatter);

        // Create the circular button with today's day
        CircleButton dateButton = new CircleButton(day);
        dateButton.setBounds(10, 15, 50, 50);  // Set button size and position
        top.add(dateButton);  // Add circular button to top panel


        // ------------------------ Day_of_month ------------------------
        JLabel day_of_month = new JLabel("Mon,");
        day_of_month.setBounds(70, 10, 170, 55);
        top.add(day_of_month);  // Add Dashboard label to userarea


        // ------------------------ Month_of_year ------------------------
        JLabel Month_of_yearr = new JLabel("September");
        Month_of_yearr.setBounds(70, 20, 170, 55);
        top.add(Month_of_yearr);  // Add Dashboard label to userarea

        // ------------------------ Button to open new window ------------------------



        MyButton openWindowButton = new MyButton("show my task", 10);
        // 10 is the radius for the corners
        openWindowButton.setBounds(200, 30, 120, 30);
        // Set button size and position
        openWindowButton.setBackground(new Color(255, 100, 73, 255));
        // Set background color
        openWindowButton.setFocusable(false);
        openWindowButton.setForeground(Color.WHITE); // Set text color
        top.add(openWindowButton);



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




