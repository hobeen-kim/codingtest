package programmersLv1;

public class 공원산책 {
    int[] result = new int[2];

    public int[] solution(String[] park, String[] routes) {

        int w = park.length;
        int h = park[0].length();

        String[][] map = new String[w][h];

        for(int i = 0; i < park.length; i++){
            map[i] = park[i].split("");
            int sIdx = park[i].indexOf("S");
            if(sIdx != -1) result = new int[]{i, sIdx};
        }

        for(String route : routes){
            String move = move(route, w, h);
            isBlocking(map, move);
        }

        return result;
    }

    String move(String route, int w, int h){
        String direction = route.substring(0, 1);
        int length = Integer.parseInt(route.substring(2));
        int dx = result[0];
        int dy = result[1];

        switch(direction){
            case "S":
                if(dx + length >= w) return direction + dx;
                dx += length;
                return direction + dx;
            case "N":
                if(dx - length < 0) return direction + dx;
                dx -= length;
                return direction + dx;
            case "W":
                if(dy - length < 0) return direction + dy;
                dy -= length;
                return direction + dy;
            case "E":
                if(dy + length >= h) return direction + dy;
                dy += length;
                return direction + dy;
        }
        return null;
    }

    void isBlocking(String[][] map, String move){
        String direction = move.substring(0, 1);
        int d = Integer.parseInt(move.substring(1));
        int dx = result[0];
        int dy = result[1];

        switch(direction){
            case "S":
                for(int i = dx; i <= d; i++){
                    if(map[i][dy].equals("X")) return;
                }
                result[0] = d;
                return;
            case "N":
                for(int i = d; i <= dx; i++){
                    if(map[i][dy].equals("X")) return;
                }
                result[0] = d;
                return;
            case "W":
                for(int i = d; i <= dy; i++){
                    if(map[dx][i].equals("X")) return;
                }
                result[1] = d;
                return;
            case "E":
                for(int i = dy; i <= d; i++){
                    if(map[dx][i].equals("X")) return;
                }
                result[1] = d;
        }
    }
}
