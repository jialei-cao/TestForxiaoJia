package test1;

public class t1 {

	public static void main(String[] args) {
		int aNumber = 90;
		int i = 2;
		String str = "";
		while(true){
			if(aNumber%i == 0){
				aNumber = aNumber/i;
				str+=i;
				i=2;
				if(aNumber == 1){
					break;
				}
			}else{
				i++;
			}
			if(!str.endsWith("*")){
				str+="*";
			}
		}
		System.out.println(str);
		
	}

}
