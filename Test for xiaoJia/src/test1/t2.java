package test1;

public class t2 {
	public static void main(String[] args) {
		String str = "whosMyLove:520520:111";
		int flag1 = str.indexOf(":")+1;
		int flag2 = str.indexOf(":", flag1)+1;

		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(str.substring(flag2));
		System.out.println(str.substring(flag1,flag2-1));

	}
}
