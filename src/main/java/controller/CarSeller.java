package controller;

import bean.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarSeller {

    private JPanel mypanel;
    private JRadioButton skodaOctaviaRadioButton;
    private JRadioButton audiA3RadioButton;
    private JCheckBox skiRackCheckBox;
    private JCheckBox airConditionCheckBox;
    private JTextField priceField;
    private JTextArea textArea_description;
    private JButton button_reset;
    private JFrame frame = new JFrame("Friendly car dealer");
    ICar car1;

    public static void main (String[] args){
        CarSeller cs = new CarSeller();
        cs.createWindow();
    }

    public void createWindow(){
        frame.setContentPane(new CarSeller().mypanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setVisible(true);
    }

    public CarSeller() {
        skodaOctaviaRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ICar car = new SkodaOctavia();
                showPrice(car);
                showDes(car);
                car1 = car;
                audiA3RadioButton.setEnabled(false);
                skodaOctaviaRadioButton.setEnabled(false);
            }
        });

        audiA3RadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ICar car = new AudiA3();
                showPrice(car);
                showDes(car);
                car1 = car;
                skodaOctaviaRadioButton.setEnabled(false);
                audiA3RadioButton.setEnabled(false);
            }
        });

        skiRackCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            if(skodaOctaviaRadioButton.isSelected() || audiA3RadioButton.isSelected()){
                if (skiRackCheckBox.isSelected()){
                    Accessory acc = new SkiRack(car1);
                    showPrice(acc);
                    showDes(acc);
                    car1 = acc;
                    skiRackCheckBox.setEnabled(false);
                } else {
                    // HERE THE REMOVING METHOD CALL
                }
            }
            }
        });

        airConditionCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(skodaOctaviaRadioButton.isSelected() || audiA3RadioButton.isSelected()){
                    if (airConditionCheckBox.isSelected()){
                        Accessory acc = new AirCondition(car1);
                        showPrice(acc);
                        showDes(acc);
                        car1 = acc;
                        airConditionCheckBox.setEnabled(false);
                    } else {
                        // HERE THE REMOVING METHOD CALL
                    }
                }
            }
        });
        button_reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                priceField.setText("");
                textArea_description.setText("");
                car1 = null;
                audiA3RadioButton.setEnabled(true);
                skodaOctaviaRadioButton.setEnabled(true);
                skiRackCheckBox.setSelected(false);
                skiRackCheckBox.setEnabled(true);
                airConditionCheckBox.setSelected(false);
                airConditionCheckBox.setEnabled(true);
            }
        });
    }

    public void showPrice(ICar car){
        priceField.setText(Double.toString(car.getPrice()) + "e");
    }

    public void showDes(ICar car){ textArea_description.setText(car.descriptionOfCar()); }
}
