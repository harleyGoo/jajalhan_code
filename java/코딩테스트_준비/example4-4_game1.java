import java.util.Scanner;

public class Main {

    static int n, m;
    static int x, y, direction;

    // 북, 동, 남, 서
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int[][] map;

    // 왼쪽으로 회전
    static void turnLeft() {
        direction--;
        if (direction == -1) {
            direction = 3;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 맵 크기 입력
        n = sc.nextInt();
        m = sc.nextInt();

        // 현재 위치와 방향
        x = sc.nextInt();
        y = sc.nextInt();
        direction = sc.nextInt();

        map = new int[n][m];

        // 맵 정보 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        // 현재 위치 방문 처리
        map[x][y] = 1;
        int count = 1;
        int turnTime = 0;

        while (true) {

            // 왼쪽 회전
            turnLeft();

            int nx = x + dx[direction];
            int ny = y + dy[direction];

            // 아직 방문하지 않았고 육지인 경우
            if (map[nx][ny] == 0) {
                map[nx][ny] = 1;
                x = nx;
                y = ny;
                count++;
                turnTime = 0;
                continue;
            }

            // 이미 방문했거나 바다인 경우
            else {
                turnTime++;
            }

            // 네 방향 모두 갈 수 없는 경우
            if (turnTime == 4) {

                nx = x - dx[direction];
                ny = y - dy[direction];

                // 뒤로 갈 수 있으면 이동
                if (map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }
                // 뒤가 바다이면 종료
                else {
                    break;
                }

                turnTime = 0;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
