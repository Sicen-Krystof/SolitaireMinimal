package GUI;

import javax.swing.*;

public class MainMenu
{
    private JPanel Menu;
    private JTextField Back;
    private JButton spideretteButton;
    private JButton spiderButton;
    private JButton exitButton;

    public MainMenu()
    {
        JFrame frame = new JFrame();
        frame.setContentPane(Menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}