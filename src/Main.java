import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Railway Booking System ");

        Font font = new Font("Arial Black", Font.BOLD, 20);

        JLabel personal_label = new JLabel("Personal Detail");
        personal_label.setFont(font);
        personal_label.setBounds(25, 20, 200, 30);
        frame.add(personal_label);


        JLabel ticket_detail_label = new JLabel("Ticket Detail");
        ticket_detail_label.setFont(font);
        ticket_detail_label.setBounds(340, 20, 160, 30);
        frame.add(ticket_detail_label);

        JLabel username_label = new JLabel("username");
        username_label.setBounds(10, 80, 120, 30);
        frame.add(username_label);

        JTextField username_field = new JTextField();
        username_field.setBounds(130, 80, 100, 30);
        frame.add(username_field);

        JLabel date_of_journey = new JLabel("Date Of Journey");
        date_of_journey.setBounds(310, 80, 100, 30);
        frame.add(date_of_journey);

        JTextField date_of_journey_field = new JTextField();
        date_of_journey_field.setBounds(430, 80, 100, 30);
        frame.add(date_of_journey_field);

        JLabel age_label = new JLabel("Age");
        age_label.setBounds(10, 130, 120, 30);
        frame.add(age_label);

        JTextField age_field = new JTextField();
        age_field.setBounds(130, 130, 100, 30);
        frame.add(age_field);

        JLabel source_label = new JLabel("Source");
        source_label.setBounds(310, 130, 100, 30);
        frame.add(source_label);

        JTextField source_label_field = new JTextField();
        source_label_field.setBounds(430, 130, 100, 30);
        frame.add(source_label_field);

        JLabel gender_label = new JLabel("Gender");
        gender_label.setBounds(10, 180, 120, 30);
        frame.add(gender_label);

        JTextField gender_field = new JTextField();
        gender_field.setBounds(130, 180, 100, 30);
        frame.add(gender_field);

        JLabel destination_label = new JLabel("Destination");
        destination_label.setBounds(310, 180, 100, 30);
        frame.add(destination_label);

        JTextField mobile_no_field = new JTextField();
        mobile_no_field.setBounds(130, 230, 100, 30);
        frame.add(mobile_no_field);

        JLabel mobile_no = new JLabel("Mobile No.");
        mobile_no.setBounds(10, 230, 120, 30);
        frame.add(mobile_no);

        JTextField destination_field = new JTextField();
        destination_field.setBounds(430, 180, 100, 30);
        frame.add(destination_field);

        JLabel email_label = new JLabel("Email");
        email_label.setBounds(310, 230, 100, 30);
        frame.add(email_label);

        JTextField email_textfield = new JTextField();
        email_textfield.setBounds(430, 230, 100, 30);
        frame.add(email_textfield);

        JLabel seat_preference = new JLabel("Seat Preference");
        seat_preference.setBounds(10, 280, 120, 30);
        frame.add(seat_preference);

        JTextField seat_preference_field = new JTextField();
        seat_preference_field.setBounds(130, 280, 100, 30);
        frame.add(seat_preference_field);

        JLabel ticket_price_label = new JLabel("Ticket Price");
        ticket_price_label.setBounds(310, 280, 100, 30);
        frame.add(ticket_price_label);

        JTextField seat_price_textfield = new JTextField();
        seat_price_textfield.setBounds(430, 280, 100, 30);
        frame.add(seat_price_textfield);


        JButton add_btn = new JButton("ADD");
        add_btn.setBounds(20, 370, 120, 25);
        frame.add(add_btn);

        JButton update_btn = new JButton("UPDATE");
        update_btn.setBounds(160, 370, 120, 25);
        frame.add(update_btn);

        JButton delete_btn = new JButton("Delete");
        delete_btn.setBounds(310, 370, 120, 25);
        frame.add(delete_btn);

        JButton fetch_btn = new JButton("Fetch");
        fetch_btn.setBounds(450, 370, 120, 25);
        frame.add(fetch_btn);

        jdbc_curd operation = new jdbc_curd();

        add_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation.add_data(username_field.getText(), Integer.parseInt(age_field.getText()), gender_field.getText(), mobile_no_field.getText(),
                        email_textfield.getText(), date_of_journey_field.getText(), source_label_field.getText(), destination_field.getText(),
                        seat_price_textfield.getText(), seat_preference_field.getText());
            }
        });

        delete_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String booking=JOptionPane.showInputDialog("Enter Your Id ");
                operation.delete_data(Integer.parseInt(booking));

            }
        });

        fetch_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String booking=JOptionPane.showInputDialog("Enter Your Id to fetch data");
                operation.fetch_data(Integer.parseInt(booking));
            }
        });

        update_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String booking=JOptionPane.showInputDialog("Enter Your Id to update");
                operation.update_data(username_field.getText(), Integer.parseInt(age_field.getText()), gender_field.getText(), mobile_no_field.getText(),
                        email_textfield.getText(), date_of_journey_field.getText(), source_label_field.getText(), destination_field.getText(),
                        seat_price_textfield.getText(), seat_preference_field.getText(), Integer.parseInt(booking));
            }
        });

        frame.setSize(600, 500);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}