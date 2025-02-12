package study0212;

import java.util.Scanner;

public class JavaArray7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] board = new int[][]
		{
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,2,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
			
		}; // [13][15]
		
		int x=0, y=0;
		while(true) {
		for(int i=0; i<board.length; i++) {
			for(int k=0; k<board[i].length; k++) {
				if(board[i][k] == 1)
					System.out.printf("■");
				if(board[i][k] == 0)
					System.out.printf(" ");
				if(board[i][k] == 2) {
					System.out.printf("@");
					x=k; y=i;
				}
			}
			System.out.println();
			} // 화면 그리기 반복문 끝
		
			// 이동 시키기 w,a,s,d
			System.out.print("방향 입력 : ");
			char key = input.nextLine().charAt(0);
			
			board[y][x]=0;
			switch(key) { // if(board[y][x]==1)
				case 'w':
					y--;
					if(board[y][x]==1) return; // if(board[y-1][x] != 1)
					break;
				case 's':
					y++;
					if(board[y][x]==1) return; // if(board[y+1][x] != 1)
					break;
				case 'a':
					x--;
					if(board[y][x]==1) return; // if(board[y][x-1] != 1)
					break;
				case 'd':
					x++;
					if(board[y][x]==1) return; // if(board[y][x+1] != 1)
					break;
				default:
					System.out.println("잘못입력");
			}
			board[y][x]=2;
			
			
		}
		
	}

}
