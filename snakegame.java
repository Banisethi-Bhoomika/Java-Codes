import javax.swing.*;
public class snakegame
{
    public static void main(String args[])
    {
        int boardwidth = 600;
        int boardHeigth = boardwidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardwidth,boardHeigth);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}