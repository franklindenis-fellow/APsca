public class StringManip {
    private String text1;
    private String text2;

    public StringManip(String x, String y){
        text1=x;
        text2=y;
    }
    public String combineStrings(){
        return text1 + text2;
    }
    public int getCombinedLength(){
        return text1.length() + text2.length();
    }
    public String stringFirstHalf(){
        return text1.substring(0,text1.length()/2);
    }
    public int indexOfFirstLetter(){
        return text1.indexOf("l");
    }
    public String swapFirstAndSecondHalf(){
        return text1.substring(text1.length()/2) + text1.substring(0,text1.length()/2);
    }

}
