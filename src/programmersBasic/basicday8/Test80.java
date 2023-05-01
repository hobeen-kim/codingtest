package programmersBasic.basicday8;

public class Test80 {
    public int solution(String[] spell, String[] dic) {

        boolean isContain = false;

        for(String d : dic){
            int count = 0;
            for(String s : spell){
                if(d.contains(s)){
                    count++;
                }
                d = d.replaceAll(s, "");
            }
            if(d.equals("") && count == spell.length){
                isContain = true;
            }
        }
        return isContain? 1 : 2;
    }
}
