package ui;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.NumberFormat;

public class CalculatorUI {

    public JFrame window;
    public JPanel panel;
    public JTextField firstNumber;
    public JTextField secondNumber;
    public JComboBox<String> operation;
    public JTextField result;

    public CalculatorUI() {
        window = new JFrame("Calculator");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout());
        window.setSize(400,100);
        window.setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setLayout(new MigLayout("", "[grow]", "[grow]"));

        NumberFormatter formatter = new NumberFormatter(NumberFormat.getInstance());
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);
        firstNumber = new JTextField(10);
        secondNumber = new JTextField(10);
        operation = new JComboBox<>(new String[]{"+", "*"});
        result = new JTextField();
        result.setColumns(10);
        result.setEditable(false);

        panel.add(firstNumber);
        panel.add(operation);
        panel.add(secondNumber);
        panel.add(result);
        window.add(panel);
        window.setVisible(true);

        firstNumber.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        CalculatorUI calculator = new CalculatorUI();
    }

}
