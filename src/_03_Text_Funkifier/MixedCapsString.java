package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText){

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String ans2 = "";
        for (int i = 0; i < unfunkifiedText.length(); i+=1) {
        	
        	if (i % 2 == 1) {
        		ans2 += Character.toUpperCase(unfunkifiedText.charAt(i));
        	}
        	else {
        		ans2 += Character.toLowerCase(unfunkifiedText.charAt(i));
        	}
        }
        return ans2;
	}
}
