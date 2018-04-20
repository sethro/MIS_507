
public class ShoppingTest {
	
	double discountRate;
	String vipLevel = "gold";
	
	public void setVipLevel(int vip){
		if (vip == 1){
			vipLevel = "Gold";
		}
		if (vip == 2){
			vipLevel = "Silver";
		}
	}
	
	public String getVipLevel(){
		return vipLevel;
	}
	
	public void setDiscountRate(int vip){
		if (vipLevel == "Gold"){
			discountRate = .1;
		}
	}
	
	public double getDiscountRate(){
		return discountRate;
	}

	public void main(String[] args) {
		System.out.print(vipLevel);

	}
		// TODO Auto-generated method stub
	}

