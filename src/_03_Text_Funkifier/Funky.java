package _03_Text_Funkifier;

public class Funky {
	private String unfunkifiedText;

    public Funky(String unfunkifiedText){

        this.unfunkifiedText = unfunkifiedText;

    }

	public String funkifyText() {
		// TODO Auto-generated method stub
		String ans = "";
		for (int i = 0; i < unfunkifiedText.length(); i++) {
			ans += unfunkifiedText.charAt(i) + ".";
		}
		return ans;
	}
}
