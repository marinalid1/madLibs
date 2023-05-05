public class MadLibs {
  /*
  Your description here
  This program generates a mad libbed story.
  Author: Matt
  Date: 5/5/2023
  */
  	public static void main(String[] args){
      String name1 = "Joe";
      String adjective1 = "funny";
      String adjective2 = "clean";
      String adjective3 = "busy";
      String verb1 = "washed";
      String noun1 = "banana";
      String noun2 = "beach";
      String noun3 = "rain";
      String noun4 = "house";
      String noun5 = "gold";
      String noun6 = "actor";
      String name2 = "sally";
      int number = 24;
      String place1 = "New York";

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
