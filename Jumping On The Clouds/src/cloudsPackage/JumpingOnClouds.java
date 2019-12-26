package cloudsPackage;

public class JumpingOnClouds {
	public static void main(String[] args) {
		int[] c = { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0,
				1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0 };
		// 0 0 1 0 0 0 0 1 0 0 0 0 1 0 0 0 0 0 1 0 1 0 0 0 1 0 0 1 0 0 0 1 0 1 0 0 0 0 0
		// 0 0 0 1 0 0 1 0 1 0 0
		int jump = 0;
		for (int i = 0; i < c.length - 1;) {
			if (i < c.length - 2 && c[i + 2] == 0) {
				jump++;
				i = i + 2;
			} 
			else {
				if (c[i + 1] == 0) {
					jump++;
					i = i + 1;
				}
			}
		}
		System.out.print(jump);
	}
}
