/*
public class BookExercises {
    // Fig. 8.1: Time1.java
// Time1 class declaration maintains the time in 24-hour format.

         // set a new time value using universal time; throw an
          // exception if the hour, minute or second is invalid
         public void setTime(int hour, int minute, int second)
           {
                 // validate hour, minute and second
                if (hour < 0 || hour >= 24 || minute < 0 || minute >= [60 ||
                             second < 0 || second >= 60)
                 {
                     throw new IllegalArgumentException(
                             "hour,minute and/or second was out of range");

                     }

                  this.hour = hour;
                  this.minute = minute;
                this.second = second;// convert to String in universal-time format (HH:MM:SS)
          public String toUniversalString() {

               }

          // convert to String in standard-time format (H:MM:SS AM or PM)
         public String toString()
           {



               }
        } // end class Time1
}
*/