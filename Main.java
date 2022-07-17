import java.util.*;
import java.util.Map;
import java.util.Scanner;

// Main.java

class Main {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
    	System.out.print("Game cryption characters (R for right layup, L for Left Layup, J for Jump Shot!): ");
    	String sentence = s.nextLine();
    	s.close();
    	
      Map<Character, Integer> letterCount=new TreeMap<>();
    	for(int i=0; i<sentence.length(); i++){
    	  char letter=sentence.charAt(i);
    	  letter=Character.toLowerCase(letter);
    	  if(letter!=' '){
    	    if(letterCount.containsKey(letter)){
    	      letterCount.put(letter, letterCount.get(letter)+1);
    	    }
    	    else{
    	      letterCount.put(letter, 1);
    	    }
    	  }
    	}
    	System.out.println("Types of shots found in your gameplay:");
    	for(char letter : letterCount.keySet()){
    	  System.out.println(letter+": "+letterCount.get(letter)+"\n");
      }
      int mostCommonNumber=-1;
      char mostCommonLetter=' ';
      for(char letter : letterCount.keySet()){
        if(letterCount.get(letter)>mostCommonNumber){
          mostCommonNumber=letterCount.get(letter);
          mostCommonLetter=letter;
        }
      }
      
      System.out.println("The most frequent shot is: "+mostCommonLetter+". The shot "+mostCommonLetter+" was taken "+mostCommonNumber+" times.");
      
      /*
       int rightDrives=0;
    int leftDrives=0;
    private double layupDirection(int leftDrives, int rightDrives){
      int totalDrives=leftDrives+rightDrives;
      int rpd=rightDrives/totalDrives;
      int lpd=leftDrives/totalDrives;

      return rpd && lpd;
      */
      
    
    
    }
    }
