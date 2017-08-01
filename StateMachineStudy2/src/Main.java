import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

/**
 * Created by VicMini on 10/11/15.
 */
public class Main extends JComponent implements ActionListener, MouseListener
{
    public Main main = new Main();
    private JFrame jf = new JFrame();
    private int nsVector = 0;
    private boolean isChangeState = false;
    private Timer ticker = new Timer(2000, this);
    private int presentState = 0;
    private int stateVector = 0;
    private int nextState = 0;
    private int[][] stateTable = new int[][]{{0, 1, 2, 0}, {1, 2, 3, 1}, {2, 4, 5, 2}, {4, 0, 0, 4}, {5, 6, 7, 5}, {4, 0, 0, 4}, {7, 0, 0, 7}, {3, 0, 0, 3}};
    private long keyDownTime = 0;
    private long keyUpTime = 0;
    private boolean isDot = false;
    private boolean isDash = false;
    private boolean isNewCharacter = false;
    private long keyDuraton = 0;
    private String code = "";
    private ArrayList<Object> methods = new ArrayList<Object>();

    public static void main(String[] args)
    {
        new Main().getGoing();
    }

    private void getGoing()
    {
        //Object o;
        jf.setSize(100, 100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        //jf.addMouseListener(this);
        //ticker.start();
        //methods.set(0, main);
        //o =methods.get(0);

//        presentState = 0;
//        stateVector = 1;
    }

    private void stateZero()
    {
        System.out.println("Hi");
    }

    private void e()
    {
        System.out.println("E");
    }

    private void t()
    {
        System.out.println("T");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource().equals(ticker))
        {
            if (!code.equals(""))
            {
               // System.out.println(code);
            }
           code = "";
        }
//        nextState = stateTable[presentState][stateVector];
//        System.out.println("PS = " + presentState + " stateVector = " + stateVector + " NS = " + nextState);
//        presentState = nextState;
        //look at current state
        //get vector
        //set next state
        //do next state action
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent)
    {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent)
    {
        keyDownTime = System.currentTimeMillis();
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent)
    {
        keyUpTime = System.currentTimeMillis();
        keyDuraton = keyUpTime - keyDownTime;
        if (keyDuraton < 300)
        {
            isDot = true;
        }
        if (keyDuraton > 400)
        {
            isDash = true;
        }
        if (isDot)
        {
            code += " dot ";
            isDot = false;
            System.out.println(code);
        }
        if (isDash)
        {
            code += " dash ";
            isDash = false;
            System.out.println(code);
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent)
    {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent)
    {

    }
}
