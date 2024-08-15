import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        myframe frame = new myframe();

        Font font = new Font("Arial", Font.PLAIN, 30);
        Font Helpfont = new Font("Arial", Font.BOLD, 15);

        Color fade = new Color(0,0,0,70);


        JLabel label = new JLabel();

        label.setText("Robin puri");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(90,40,167,55);


        JLabel dash = new JLabel();
        dash.setText("Dashborad");
        dash.setHorizontalTextPosition(JLabel.CENTER);
        dash.setVerticalAlignment(JLabel.TOP);
        dash.setBounds(90,52,167,55);


        JLabel date = new JLabel();
//        calling date function
        LocalDate today = LocalDate.now();

//        calling date formater
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd");
        String todaydate = today.format(formater);
        date.setText(" "+ todaydate);
        date.setHorizontalTextPosition(JLabel.CENTER);
        date.setVerticalAlignment(JLabel.TOP);
        date.setBounds(40,130,167,55);
        date.setFont(font);







        JLabel day = new JLabel();
//        calling date function
        LocalDate todayday = LocalDate.now();

//        calling date formater
        DateTimeFormatter formater1 = DateTimeFormatter.ofPattern("MM");

        String today_date = today.format(formater1);
        day.setText(" "+ todayday);
        day.setHorizontalTextPosition(JLabel.CENTER);
        day.setVerticalAlignment(JLabel.BOTTOM);
        day.setBounds(80,80,70,70);



        JLabel Month = new JLabel();

        LocalDate  month= LocalDate.now();
        DateTimeFormatter formater2= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String monthofweek = today.format(formater2);
        Month.setText(" " + monthofweek);
        Month.setHorizontalTextPosition(JLabel.CENTER);
        Month.setVerticalAlignment(JLabel.BOTTOM);
        Month.setBounds(80,90,70, 70);


        JLabel Help = new JLabel();
        Help.setText("HEY, NEED ANY HELP ?");
        Help.setHorizontalTextPosition(JLabel.RIGHT);
        Help.setVerticalAlignment(JLabel.BOTTOM);
        Help.setBounds(490,70,180,70);
        Help.setFont(Helpfont);




//        ------------------------faded text------------------------
        JLabel Helpfade = new JLabel();
        Helpfade.setText("| Just ask me Anything !");
        Helpfade.setHorizontalTextPosition(JLabel.RIGHT);
        Helpfade.setVerticalAlignment(JLabel.BOTTOM);
        Helpfade.setBounds(490,90,180,70);
        Helpfade.setFont(Helpfont);
        Helpfade.setForeground(fade);




        frame.add(label);
        frame.add(dash);
        frame.add(date);
        frame.add(day);
        frame.add(Month);
        frame.add(Help);
        frame.add(Helpfade);



        frame.setLayout(null);




    }
}