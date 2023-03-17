import javax.swing.*;
public class frame extends JFrame  {
    frame(){
        //add panel to show score of snake game
        this.add(new panel());
        //naming the frame window
        this.setTitle("SnakeGame");
        //to fix the size of frame
        this.setResizable(false);
        this.setVisible(true); //if false then not visible,bydefault false hota h
        this.pack();
    }
}
