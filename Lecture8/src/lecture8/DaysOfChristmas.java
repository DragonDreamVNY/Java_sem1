package lecture8;

class DaysOfChristmas {

    public static void main(String[] args) {

        //String to hold the lyrics for a given verse
        String verse = "";
        
        int day =1; //set the current day to 1 (i.e. the first day of Christmas)
                    //we will increase this variable by 1 through each iteration of the loop
        
        //we will loop 12 times as there are 12 days of Christmas
        while (day <= 12) {
           
            //start building the first line of the current verse
            verse = "\nOn the " + day;

            //add the suffix to the line
            switch (day) {
                case 1:
                    verse += "st";
                    break;
                case 2:
                    verse += "nd";
                    break;
                case 3:
                    verse += "rd";
                    break;
                default:
                    verse += "th";
            }

            //continue to build the first line of the current verse
            verse += " day of Christmas my true love gave to me: ";

            //add the lines to the verse
            switch (day) {
                case 12:
                    verse += "\nTwelve Drummers drumming, ";
                case 11:
                    verse += "\nEleven Pipers piping, ";
                case 10:
                    verse += "\nTen Lords a-leaping, ";
                case 9:
                    verse += "\nNine Dancing Ladies, ";
                case 8:
                    verse += "\nEight Maids a-milking, ";
                case 7:
                    verse += "\nSeven Swans a-swimming, ";
                case 6:
                    verse += "\nSix Geese a-laying, ";
                case 5:
                    verse += "\nFive Golden Rings, ";
                case 4:
                    verse += "\nFour Calling Birds, ";
                case 3:
                    verse += "\nThree French Hens, ";
                case 2:
                    verse += "\nTwo Turtle Doves and, ";
                case 1:
                    verse += "\nA partridge in a pear tree, ";
            }//end switch
         
            System.out.println(verse); //print a verse
            
          
            day++;//increment day
        }//end while
    }//end main
}//end class
