package programmersLv1;

public class 바탕화면정리 {

    public int[] solution(String[] wallpaper) {
        int top = 100;
        boolean isTop = false;
        int bottom = 0;
        int left = 100;
        int right = 0;

        for(int i = 0; i < wallpaper.length; i++){
            int idx = wallpaper[i].indexOf("#");
            int lastIdx = wallpaper[i].lastIndexOf("#");
            if(idx != -1){
                if(top > i) top = i;
                bottom = i + 1;
                if(left > idx) left = idx;
                if(right < lastIdx  + 1) right = lastIdx + 1;
            }
        }


        int[] result = new int[]{top, left, bottom, right};
        return result;
    }
}
