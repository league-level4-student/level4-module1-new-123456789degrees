package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;
    }

    @Override
    public String funkifyText() {
    	String ans = "";
        for (int i = unfunkifiedText.length()-1; i >= 0; i--) {
        	ans += unfunkifiedText.charAt(i);
        }
        return ans;
    }
}
