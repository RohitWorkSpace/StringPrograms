//print each word in separate line
package StringPract;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "In the box";
		String w = "";
		s += " ";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c != ' ') {
				w += c;
			} else {
				System.out.print(w+" ");
				//System.out.print(w.charAt(0));
				w = "";
			}
		}

	}

}
//result
//
//In the box 