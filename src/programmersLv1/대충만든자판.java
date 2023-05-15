package programmersLv1;

public class 대충만든자판 {
    public int[] solution(String[] keymap, String[] targets) {

        int[] result = new int[targets.length];

        for(int i = 0; i < targets.length; i++){
            int count = 0;
            String target = targets[i];
            for(int j = 0; j < target.length(); j++){
                char targetChar = target.charAt(j);
                int keyLocation = Integer.MAX_VALUE;
                for(String key : keymap){
                    int idx = key.indexOf(targetChar);
                    if(idx != -1 && idx < keyLocation) keyLocation = idx;
                }
                if(keyLocation == Integer.MAX_VALUE){
                    count = -1;
                    break;
                }
                count += keyLocation + 1;
            }
            result[i] = count;
        }

        return result;
    }
}
