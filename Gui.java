/**
 * Created by Montrell on 2/19/2017.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Gui extends JFrame {

    private JTextField answerField;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mult, div, equals, clear,decimal, neg, back;
    private String sTemp1, sTemp2, sAnswer;
    private double answer = 0.0;
    private JPanel contentPanel;
    private boolean equalsClick = false, opChosen = false;
    private char operation = ' ';

    public Gui() {
        super("calculator");

        answerField = new JTextField(null, 20);
        answerField.setEditable(false);

        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        add = new JButton("+");
        sub = new JButton("-");
        mult = new JButton("*");
        div = new JButton("/");
        equals = new JButton("=");
        clear = new JButton("C");
        decimal = new JButton(".");
        neg = new JButton("+/-");
        back = new JButton("Back");

        Dimension dim = new Dimension(65, 25);

        one.setPreferredSize(dim);
        two.setPreferredSize(dim);
        three.setPreferredSize(dim);
        four.setPreferredSize(dim);
        five.setPreferredSize(dim);
        six.setPreferredSize(dim);
        seven.setPreferredSize(dim);
        eight.setPreferredSize(dim);
        nine.setPreferredSize(dim);
        zero.setPreferredSize(new Dimension(225, 25));
        add.setPreferredSize(new Dimension(100, 25));
        sub.setPreferredSize(new Dimension(100, 25));
        mult.setPreferredSize(new Dimension(100, 25));
        div.setPreferredSize(new Dimension(100, 25));
        equals.setPreferredSize(new Dimension(100, 25));
        clear.setPreferredSize(new Dimension(100,25));
        decimal.setPreferredSize(new Dimension(100,25));
        neg.setPreferredSize(new Dimension(100,25));
        back.setPreferredSize(new Dimension(225,25));

        Numbers n = new Numbers();
        Calc c = new Calc();

        one.addActionListener(n); two.addActionListener(n); three.addActionListener(n); four.addActionListener(n);
        five.addActionListener(n); six.addActionListener(n); seven.addActionListener(n); eight.addActionListener(n);
        nine.addActionListener(n); zero.addActionListener(n); decimal.addActionListener(n); neg.addActionListener(n);
        back.addActionListener(n);

        add.addActionListener(c); sub.addActionListener(c); mult.addActionListener(c);
        div.addActionListener(c); equals.addActionListener(c); clear.addActionListener(c);

        contentPanel = new JPanel();
        contentPanel.setBackground(Color.orange);
        contentPanel.setLayout(new FlowLayout());

        contentPanel.add(answerField, BorderLayout.NORTH);
        contentPanel.add(one); contentPanel.add(two); contentPanel.add(three); contentPanel.add(four);
        contentPanel.add(five); contentPanel.add(six); contentPanel.add(seven); contentPanel.add(eight);
        contentPanel.add(nine); contentPanel.add(zero); contentPanel.add(add); contentPanel.add(sub);
        contentPanel.add(mult); contentPanel.add(div); contentPanel.add(equals); contentPanel.add(clear);
        contentPanel.add(decimal); contentPanel.add(neg); contentPanel.add(back);

        this.setContentPane(contentPanel);
    }

    private class Numbers implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            JButton src = (JButton) event.getSource();

            if (src.equals(one)) {
                if (opChosen == false) {
                    if (sTemp1 == null) {
                        sTemp1 = "1";
                    } else {
                        sTemp1 += "1";
                    }

                } else {
                    if (sTemp2 == null) {
                        sTemp2 = "1";
                    } else {
                        sTemp2 += "1";
                    }
                }
            }

            if (src.equals(two)) {
                if (opChosen == false) {
                    if (sTemp1 == null) {
                        sTemp1 = "2";
                    } else {
                        sTemp1 += "2";
                    }

                } else {
                    if (sTemp2 == null) {
                        sTemp2 = "2";
                    } else {
                        sTemp2 += "2";
                    }
                }
            }

            if (src.equals(three)) {
                if (opChosen == false) {
                    if (sTemp1 == null) {
                        sTemp1 = "3";
                    } else {
                        sTemp1 += "3";
                    }

                } else {
                    if (sTemp2 == null) {
                        sTemp2 = "3";
                    } else {
                        sTemp2 += "3";
                    }
                }
            }

            if (src.equals(four)) {
                if (opChosen == false) {
                    if (sTemp1 == null) {
                        sTemp1 = "4";
                    } else {
                        sTemp1 += "4";
                    }

                } else {
                    if (sTemp2 == null) {
                        sTemp2 = "4";
                    } else {
                        sTemp2 += "4";
                    }
                }
            }

            if (src.equals(five)) {
                if (opChosen == false) {
                    if (sTemp1 == null) {
                        sTemp1 = "5";
                    } else {
                        sTemp1 += "5";
                    }

                } else {
                    if (sTemp2 == null) {
                        sTemp2 = "5";
                    } else {
                        sTemp2 += "5";
                    }
                }
            }

            if (src.equals(six)) {
                if (opChosen == false) {
                    if (sTemp1 == null) {
                        sTemp1 = "6";
                    } else {
                        sTemp1 += "6";
                    }

                } else {
                    if (sTemp2 == null) {
                        sTemp2 = "6";
                    } else {
                        sTemp2 += "6";
                    }
                }
            }

            if (src.equals(seven)) {
                if (opChosen == false) {
                    if (sTemp1 == null) {
                        sTemp1 = "7";
                    } else {
                        sTemp1 += "7";
                    }

                } else {
                    if (sTemp2 == null) {
                        sTemp2 = "7";
                    } else {
                        sTemp2 += "7";
                    }
                }
            }

            if (src.equals(eight)) {
                if (opChosen == false) {
                    if (sTemp1 == null) {
                        sTemp1 = "8";
                    } else {
                        sTemp1 += "8";
                    }

                } else {
                    if (sTemp2 == null) {
                        sTemp2 = "8";
                    } else {
                        sTemp2 += "8";
                    }
                }
            }

            if (src.equals(nine)) {
                if (opChosen == false) {
                    if (sTemp1 == null) {
                        sTemp1 = "9";
                    } else {
                        sTemp1 += "9";
                    }

                } else {
                    if (sTemp2 == null) {
                        sTemp2 = "9";
                    } else {
                        sTemp2 += "9";
                    }
                }
            }

            if (src.equals(zero)) {
                if (opChosen == false) {
                    if (sTemp1 == null) {
                        sTemp1 = "0";
                    } else {
                        sTemp1 += "0";
                    }

                } else {
                    if (sTemp2 == null) {
                        sTemp2 = "0";
                    } else {
                        sTemp2 += "0";
                    }
                }
            }

            if (src.equals(decimal)) {
                if (opChosen == false) {
                    if (sTemp1 == null) {
                        sTemp1 = "0.";
                    } else {
                        if (sTemp1 != null) {
                            if (sTemp1.contains(".")) {
                                System.out.println("Already have a decimal");
                            } else
                                sTemp1 += '.';
                        }
                    }

                } else {
                    if (sTemp2 == null) {
                        sTemp2 = "0.";
                    } else {
                        if (sTemp2 != null) {
                            if (sTemp2.contains(".")) {
                                System.out.println("Already have a decimal");
                            } else
                                sTemp2 += '.';
                        }
                    }
                }
            }

            if (src.equals(neg)) {
                if (opChosen == false) {
                    if (sTemp1 == null) {
                        sTemp1 = "-";
                    } else if (sTemp1 != null && sTemp1.startsWith("-")) {
                        sTemp1 = sTemp1.substring(1);
                    } else {
                        sTemp1 = "-" + sTemp1;
                    }
                }
                else
                    {
                        if(sTemp2 == null)
                        {
                            sTemp2 = "-";
                        }
                        if (sTemp2 != null && sTemp2.startsWith("-"))
                        {
                            sTemp2 = sTemp2.substring(1);
                        }
                        else {
                            sTemp2 = "-" + sTemp2;
                        }
                    }
                }

            if(src.equals(back))
            {
                if(opChosen == false)
                {
                    if(sTemp1 == null)
                    {
                        System.out.println("Can't delete nothing");
                    }

                    else
                    {
                      sTemp1 = sTemp1.substring(0,sTemp1.length()-1);
                    }
                }
                else
                {
                    if(sTemp2 == null)
                    {
                        System.out.println("Can't delete nothing");
                    }

                    else
                    {
                        sTemp2 = sTemp2.substring(0,sTemp2.length()-1);
                    }
                }
            }

            if(opChosen == false)
            {
                answerField.setText(sTemp1);
            }
            else
            {
                answerField.setText(sTemp2);
            }

            if(equalsClick == false)
            {
                if(opChosen == false)
                {
                    answerField.setText(sTemp1);
                }

                else
                {
                    answerField.setText(sTemp2);
                }
            }
        }
    }

        private class Calc implements ActionListener {

            public void actionPerformed(ActionEvent event) {
                JButton src = (JButton) event.getSource();

                if(src.equals(add))
                {
                    if(sTemp1 == null)
                    {
                        System.out.println("Choose your number first");
                    }
                    else
                    {
                        if(sTemp1 != null && sTemp2 == null )
                        {
                            opChosen = true;
                            operation = '+';
                        }
                        else
                        {
                          if(sTemp1 != null && sTemp2 != null)
                          {
                              System.out.println("Two operations only");
                          }
                        }
                    }
                }

                if(src.equals(sub))
                {
                    if(sTemp1 == null)
                    {
                        System.out.println("Choose your number first");
                    }
                    else
                    {
                        if(sTemp1 != null && sTemp2 == null )
                        {
                            opChosen = true;
                            operation = '-';
                        }
                        else
                        {
                            if(sTemp1 != null && sTemp2 != null)
                            {
                                System.out.println("Two operations only");
                            }
                        }
                    }
                }

                if(src.equals(mult))
                {
                    if(sTemp1 == null)
                    {
                        System.out.println("Choose your number first");
                    }
                    else
                    {
                        if(sTemp1 != null && sTemp2 == null )
                        {
                            opChosen = true;
                            operation = '*';
                        }
                        else
                        {
                            if(sTemp1 != null && sTemp2 != null)
                            {
                                System.out.println("Two operations only");
                            }
                        }
                    }
                }

                if(src.equals(div))
                {
                    if(sTemp1 == null)
                    {
                        System.out.println("Choose your number first");
                    }
                    else
                    {
                        if(sTemp1 != null && sTemp2 == null )
                        {
                            opChosen = true;
                            operation = '/';
                        }
                        else
                        {
                            if(sTemp1 != null && sTemp2 != null)
                            {
                                System.out.println("Two operations only");
                            }
                        }
                    }
                }

                if(src.equals(equals))
                {
                    if(sTemp1 == null)
                    {
                        System.out.println("Choose your number first");
                    }
                    else
                    {
                        if(sTemp1 != null && sTemp2 == null )
                        {
                            System.out.println("Choose BOTH number's first");
                        }

                        if(sTemp1 != null && sTemp2 != null)
                        {
                            double d1 = 0.0,d2 = 0.0;

                            d1 = Double.parseDouble(sTemp1);
                            d2 = Double.parseDouble(sTemp2);

                            switch(operation)
                            {
                                case '+':
                                    answer = d1 + d2;
                                    break;
                                case '-':
                                    answer = d1 - d2;
                                    break;
                                case '*':
                                    answer = d1 * d2;
                                    break;
                                case '/':
                                    answer = d1 / d2;
                                    break;
                            }

                            sAnswer = Double.toString(answer);
                            answerField.setText(sAnswer);

                            if(operation == '/' && d2 == 0.0)
                            {
                                answerField.setText("DIVIDE BY 0 ERROR");
                            }
                        }
                    }
                }

                if(src.equals(clear))
                {
                    sTemp1 = null;
                    sTemp2 = null;
                    equalsClick = false;
                    operation = ' ';
                    answerField.setText(null);
                    sAnswer = null;
                }


            }
        }
    }