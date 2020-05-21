package twoDArrays;

public class SpiralPrint {

	public static void main(String[] args) {
		int[][] arr = new int[5][2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 1) * 10 + j + 1;
			}
		}
		SpiralDisplay(arr);
	}

	public static void SpiralDisplay(int[][] arr) {
		int top = 0, bottom = arr.length - 1, left = 0, right = arr[top].length - 1,
				count = (bottom + 1) * (right + 1), dir = 1;
		while (count > 0) {
			if (dir == 1) {
				for (int i = left; i <= right; i++) {
					System.out.print(arr[top][i] + " ");
					count--;
				}
				dir = 2;
				top++;
			} else if (dir == 2) {
				for (int i = top; i <= bottom; i++) {
					System.out.print(arr[i][right] + " ");
					count--;
				}
				dir = 3;
				right--;
			} else if (dir == 3) {
				for (int i = right; i >= left; i--) {
					System.out.print(arr[bottom][i] + " ");
					count--;
				}
				dir = 4;
				bottom--;
			} else {
				for (int i = bottom; i >= top; i--) {
					System.out.print(arr[i][left] + " ");
					count--;
				}
				dir = 1;
				left++;
			}
		}

	}

}
