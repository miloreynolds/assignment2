package assignment2;

// necessary packages:

import java.awt.Graphics;
import java.lang.Object;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class SpeedReader {

  // main program
  public static void main(String[] args) throws InterruptedException, IOException {
    // variable declaration
    PrintWriter pen = new PrintWriter(System.out, true);
    WordGenerator WG = new WordGenerator(args[0]);
    int width = Integer.parseInt(args[1]);
    int height = Integer.parseInt(args[2]);
    DrawingPanel panel = new DrawingPanel(width, height);
    Graphics g = panel.getGraphics();
    int fontSize = Integer.parseInt(args[3]);
    Font f = new Font("Courier", Font.BOLD, fontSize);
    g.setFont(f);
    int wpm = Integer.parseInt(args[4]);

    // Loop for showing words on the drawing panel
    while (WG.hasNext()) {
      g.drawString(WG.next(), 100, 100);
      Thread.sleep(60000 / wpm);
      panel.clear();
    }

    // print statement
    pen.println("The number of words is " + WG.getWordCount());
    pen.println("The number of sentences is " + WG.getSentenceCount());
  }

}
