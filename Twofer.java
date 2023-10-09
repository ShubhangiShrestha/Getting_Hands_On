public class Twofer {
    public static String twofer(String name) {
        if(name==null){
            return ("One for you, one for me.");
        }
        else{
            String sentence="One for " +name +", one for me.";
            return sentence;
        }
    }
