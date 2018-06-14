public class Bottles {

    public String verse(int verse){

        String temp = "";
        String line1 = "";
        if(verse == 1){
            temp += verse + " bottle of beer on the wall, " + verse + " bottle of beer.\n" +
                    "Take it down and pass it around, no more bottles of beer on the wall.\n";
        }
        else if(verse == 0)
            return "No more bottles of beer on the wall, no more bottles of beer.\n" +
            "Go to the store and buy some more, 99 bottles of beer on the wall.";
        else{
            temp += verse + " bottles of beer on the wall, " + verse + " bottles of beer.\n"
            + "Take one down and pass it around, " + (verse-1) + " ";
            if(verse - 1 == 1){
                temp += "bottle";
            }
            else{
                temp += "bottles";
            }
            temp += " of beer on the wall.\n";
        }



        if(verse != 0) {
            temp = temp.substring(0, temp.length() - 1);
        }

        return temp;

    }

    public String verse(int startVerse, int endVerse){

        String temp = "";

        while(startVerse >= endVerse){
            temp += verse(startVerse);
            if(startVerse != endVerse){
                temp += "\n\n";
            }
            startVerse--;
        }

        return temp;
    }

    public String song(){
        return verse(99, 0);
    }
}
