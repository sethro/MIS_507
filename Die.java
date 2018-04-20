//********************************************************************
//  Die.java       Author: Lewis/Loftus
//
//  Represents one die (singular of dice) with faces showing values
//  between 1 and 6.
//********************************************************************

//AF: 


public class Die
{
   private final int MAX = 6;  // maximum face value

   private static int  faceValue;  // current value showing on the die
   
   //type: Apparent
   //AF: “MAX” refers to the greatest possible value of faces (6)
   //“faceValue” refers to the number (value) on the face of the die when it’s rolled
   
   //RI: 
   // MAX is FINAL and will not exceed 6
   // faceValue will default to 1
   //

   public static boolean repOK()
   {
	   
	   if (faceValue > 6 || faceValue < 1){
		   return false;
	   }
	return true;
		   
   }

   //-----------------------------------------------------------------
   //  Constructor: Sets the initial face value.
   //-----------------------------------------------------------------
   public Die()
   {
      faceValue = 1;
   }

   //-----------------------------------------------------------------
   //  Rolls the die and returns the result.
   //-----------------------------------------------------------------
   public int roll()
   {
      faceValue = (int)(Math.random() * MAX) + 1;

      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Face value mutator.
   //-----------------------------------------------------------------
   public void setFaceValue (int value)
   {
      faceValue = value;
   }

   //-----------------------------------------------------------------
   //  Face value accessor.
   //-----------------------------------------------------------------
   public int getFaceValue()
   {
      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this die.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = Integer.toString(faceValue);

      return result;
   }
}
