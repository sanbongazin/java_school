
public class BubbleSort {
	
	int horizon1 = 0;
	int horizon2 = 0;

	public void Boubble(String []  ss) {

		String swap = "";
		for (int i = 0; i<ss.length; i++) {

			for (int c = 0; c< ss.length-1; c++) {
				if(Integer.parseInt(ss[c]) < Integer.parseInt(ss[c+1])){
					swap = ss[c];
					ss[c] = ss[c+1];
					ss[c+1] =  swap;
					}
				}
			}
//			int v = 0;
//			for (String string : ss) {
//				System.out.print(string + " ");
//				v++;
//				if (v ==4) {
//					System.out.println("\n");
//				}
//			}
		}
	
	public void Conform(String [] ss) {
		
		for(int i = 0; i<ss.length-2;i++) {
			if(i == 0) {
				if(Math.abs(Integer.parseInt(ss[i]) - Integer.parseInt(ss[i+1])) < Math.abs(Integer.parseInt(ss[i+1]) - Integer.parseInt(ss[i+2]))) {
					horizon1 = i;
					horizon2 = i+1;
				}else {
				horizon1 = i+1;
				horizon2 = i+2;
				}
			}
				if(Math.abs(Integer.parseInt(ss[i]) - Integer.parseInt(ss[i+1])) >Math.abs(Integer.parseInt(ss[horizon1]) - Integer.parseInt(ss[horizon2]))) {
				horizon1 = i;
				horizon2 = i+1;
					}else {
					horizon1 = i+1;
					horizon2 = i+2;
			
				}
			}
		System.out.println("������:" +ss[horizon1]+" "+ ss[horizon2]);
	}
	
}
