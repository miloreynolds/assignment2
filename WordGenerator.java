package assignment2;

// necessary package

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WordGenerator {
  // Fields
  Scanner text;
  String word;
  int wordCounter;
  int sentenceCounter;

  // Constructor
  public WordGenerator(String filename) throws IOException {
    this.text = new Scanner(new File(filename));
    this.word = new String("");
    this.wordCounter = 0;
    this.sentenceCounter = 0;
  }

  // method hasNext()
  public boolean hasNext() {
    if (this.text.hasNext())
      return true;
    else
      return false;
  }

  // method next()
  public String next() {
    this.word = this.text.next();
    this.wordCounter++;
    if ((this.word.indexOf(".") > 0) || (this.word.indexOf("?") > 0)
        || ((this.word.indexOf("!") > 0)))
      sentenceCounter++;
    return this.word;
  }

  // method getWordCount()
  public int getWordCount() {
    return this.wordCounter;
  }

  // method getSentenceCount()
  public int getSentenceCount() {
    return this.sentenceCounter;
  }

}

