package spiral;


class Solution {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];  // n x n의 2차원 배열 선언
        int num = 1;  // 기록할 숫자(1~25)
        int x = 0, y = 0;  // 기록할 좌표(x, y)
        int[] dx = {0, 1, 0, -1};  // 진행방향(세로)
        int[] dy = {1, 0, -1, 0};  // 진행방향(가로)
        int direction = 0;  // dx[], dy[] 중 해당 인덱스값

        while (num <= n * n) {  // 최대값을 넘기 전까지 계속
            answer[x][y] = num++;  // (x, y)에 num 넣고 num++

            int nx = x + dx[direction];  // 새로운 x좌표(예정)
            int ny = y + dy[direction];  // 새로운 y좌표(예정)

            // (x, y 각 좌표가 0보다 작거나 n보다 크거나, 이미 값이 있거나 하면)
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                direction = (direction + 1) % 4; // 다음 direction으로.
                nx = x + dx[direction];  // 새 x좌표 확정
                ny = y + dy[direction];  // 새 y좌표 확정
            }
            x = nx;  // x좌표 갱신
            y = ny;  // y좌표 갱신
        }
        return answer;
    }

    public static void main(String[] args) {  // 메인 메서드 생성

        int[][] answer = Solution.solution(5);  // 정적메서드 solution 호출

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                System.out.printf("%2s ", answer[i][j]);
            }
            System.out.println();
        }
    }
}
