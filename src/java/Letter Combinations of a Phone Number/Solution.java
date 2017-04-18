public class Solution {
    private final char[] TWO = new char[]{'a','b','c'};
    private final char[] THREE = new char[]{'d','e','f'};
    private final char[] FOUR = new char[]{'g','h','i'};
    private final char[] FIVE = new char[]{'j','k','l'};
    private final char[] SIX = new char[]{'m','n','o'};
    private final char[] SEVEN = new char[]{'p','q','r','s'};
    private final char[] EIGHT = new char[]{'t','u','v'};
    private final char[] NINE = new char[]{'w','x','y','z'};
    List<String> output;
    public List<String> letterCombinations(String digits) {
        output = new ArrayList<String>();
        if(digits.length()>0){
            String temp="";
            generator(output,temp,digits,0);
        }
        return output;
    }
    private void generator(List<String> output, String temp, String digits,int index){
        //System.out.println("index="+index);
        if(index==digits.length()){
            output.add(temp);
           // System.out.println("adding");
        }
        else{
           // System.out.println("digit="+digits.charAt(index));
            if(digits.charAt(index)=='2'){
                for(int i=0;i<TWO.length;i++){
                   // System.out.println("here");
                    generator(output,temp.concat(String.valueOf(TWO[i])),digits,index+1);
                }
            }
            if(digits.charAt(index)=='3'){
                for(int i=0;i<THREE.length;i++){
                    generator(output,temp.concat(String.valueOf(THREE[i])),digits,index+1);
                }
            }
            if(digits.charAt(index)=='4'){
                for(int i=0;i<FOUR.length;i++){
                    generator(output,temp.concat(String.valueOf(FOUR[i])),digits,index+1);
                }
            }
            if(digits.charAt(index)=='5'){
                for(int i=0;i<FIVE.length;i++){
                    generator(output,temp.concat(String.valueOf(FIVE[i])),digits,index+1);
                }
            }
            if(digits.charAt(index)=='6'){
                for(int i=0;i<SIX.length;i++){
                    generator(output,temp.concat(String.valueOf(SIX[i])),digits,index+1);
                }
            }
            if(digits.charAt(index)=='7'){
                for(int i=0;i<SEVEN.length;i++){
                    generator(output,temp.concat(String.valueOf(SEVEN[i])),digits,index+1);
                }
            }
            if(digits.charAt(index)=='8'){
                for(int i=0;i<EIGHT.length;i++){
                    generator(output,temp.concat(String.valueOf(EIGHT[i])),digits,index+1);
                }
            }
            if(digits.charAt(index)=='9'){
                for(int i=0;i<NINE.length;i++){
                    generator(output,temp.concat(String.valueOf(NINE[i])),digits,index+1);
                }
            }
        }
    }
}