/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stan;

/**
 *
 * @author matie_000
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ButtonPanel extends JPanel {

    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    public JButton openButton;
    public JButton stopButton;
    public JButton closeButton;
    public JButton startButton;
    private JPanel buttonPanel;
    private Context stan;

    public ButtonPanel() {
        openButton = new OpenButton();
        stopButton = new StopButton();
        closeButton = new CloseButton();
        startButton = new StartButton();
        stan = new Context();
        stan.setState(new Closed());

        buttonPanel = this;

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        add(openButton);
        add(stopButton);
        add(closeButton);
        add(startButton);

    }

    class OpenButton extends JButton implements ActionListener {

        OpenButton() {
            super("Open");
            addActionListener(this);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(Color.GREEN);
            if (stan.getState() instanceof Closed) {
                try {
                    setVisible(false);
                    stopButton.setVisible(true);
                    stan.goNext();
                    Thread.sleep(5000);
                    if(stan.getState() instanceof Opening){
                        stan.goNext();
                        stopButton.setVisible(false);
                        openButton.setVisible(true);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(ButtonPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stan.getState() instanceof Closing) {
                try {
                    setVisible(false);
                    stopButton.setVisible(true);
                    closeButton.setVisible(false);
                    stan.goNext();
                    stan.goNext();
                    Thread.sleep(5000);
                    if(stan.getState() instanceof Closing){
                        stan.goNext();
                        stopButton.setVisible(false);
                        openButton.setVisible(true);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(ButtonPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    setVisible(false);
                    stopButton.setVisible(true);
                    closeButton.setVisible(false);
                    Thread.sleep(5000);
                    if(stan.getState() instanceof Closing){
                        stan.goNext();
                        stopButton.setVisible(false);
                        openButton.setVisible(true);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(ButtonPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    class StopButton extends JButton implements ActionListener {

        StopButton() {
            super("Stop");
            addActionListener(this);
            setVisible(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(Color.BLACK);

           
                setVisible(false);
                openButton.setVisible(true);
            
                setVisible(false);
                closeButton.setVisible(true);
            
        }
    }

    class CloseButton extends JButton implements ActionListener {

        CloseButton() {
            super("Close");
            addActionListener(this);
            setVisible(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(Color.RED);
            if (stan.getState() instanceof Open) {
                try {
                    setVisible(false);
                    stopButton.setVisible(true);
                    stan.goNext();
                    Thread.sleep(5000);
                    if(stan.getState() instanceof Closing){
                        stan.goNext();
                        stopButton.setVisible(false);
                        openButton.setVisible(true);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(ButtonPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (stan.getState() instanceof Opening) {
                try {
                    setVisible(false);
                    stopButton.setVisible(true);
                    openButton.setVisible(false);
                    stan.goNext();
                    stan.goNext();
                    Thread.sleep(5000);
                    if(stan.getState() instanceof Closing){
                        stan.goNext();
                        stopButton.setVisible(false);
                        openButton.setVisible(true);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(ButtonPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    setVisible(false);
                    stopButton.setVisible(true);
                    closeButton.setVisible(false);
                    Thread.sleep(5000);
                    if(stan.getState() instanceof Closing){
                        stan.goNext();
                        stopButton.setVisible(false);
                        openButton.setVisible(true);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(ButtonPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
    }

    class StartButton extends JButton implements ActionListener {

        StartButton() {
            super("Start");
            addActionListener(this);
            setVisible(false);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(Color.BLUE);
        }
    }
}
