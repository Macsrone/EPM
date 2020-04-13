package day35_encapsulaiton;

public class RuolettePocket {

	private int pocketNumber;
	
		public RuolettePocket(int PocketNumber) {
			this.pocketNumber = PocketNumber;
		}

		public int getPocketNumber() {
			return pocketNumber;
		}

		public void setPocketNumber(int pocketNumber) {
			if (pocketNumber<0 ||pocketNumber>36) {
				this.pocketNumber =999;

			}else {
			this.pocketNumber = pocketNumber;
			}
		}

			
		public String getPocketColor() {
			if (pocketNumber==0) {
				return "green";
			} else if(pocketNumber>0 && pocketNumber<11) {
				if (pocketNumber%2==0) {
					return "black";
				}else {
					return "red";
				}
				
			}else if(pocketNumber>10 && pocketNumber<19) {
				if (pocketNumber%2==0) {
					return "red";
				}else {
					return "black";
		}
			}else if(pocketNumber>18 && pocketNumber<29) {
				if (pocketNumber%2==0) {
					return "black";
				}else {
					return "red";
		}
			
			}else if(pocketNumber>28 && pocketNumber<37) {
				if (pocketNumber%2==0) {
					return "red";
				}else {
					return "black";
				}
			}
			return "invalid";
		
		
	}
}