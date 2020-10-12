package efdUtil;

public class RegistroAtivo {

	boolean rR0000IsActive;

	boolean rC001IsActive;
	boolean rC100IsActive;
	boolean rC300IsActive;
	boolean rC350IsActive;
	boolean rC400IsActive;
	boolean rC495IsActive;
	boolean rC500IsActive;
	boolean rC600IsActive;
	boolean rC700IsActive;
	boolean rC800IsActive;
	boolean rC860IsActive;

	boolean rD001IsActive;

	boolean rE001IsActive;

	boolean rG001IsActive;

	boolean rH001IsActive;

	

	public boolean isrR0000IsActive() {
		return rR0000IsActive;
	}

	public void setrR0000IsActive(boolean rR0000IsActive) {
		this.rR0000IsActive = rR0000IsActive;
	}

	public boolean isrC001IsActive() {
		return rC001IsActive;
	}

	public void setrC001IsActive(boolean rC001IsActive) {
		this.rC001IsActive = rC001IsActive;
	}

	public boolean isrC100IsActive() {
		return rC100IsActive;
	}

	public void setrC100IsActive(boolean rC100IsActive) {
		this.rC100IsActive = rC100IsActive;
	}

	public boolean isrC300IsActive() {
		return rC300IsActive;
	}

	public void setrC300IsActive(boolean rC300IsActive) {
		this.rC300IsActive = rC300IsActive;
	}

	public boolean isrC350IsActive() {
		return rC350IsActive;
	}

	public void setrC350IsActive(boolean rC350IsActive) {
		this.rC350IsActive = rC350IsActive;
	}

	public boolean isrC400IsActive() {
		return rC400IsActive;
	}

	public void setrC400IsActive(boolean rC400IsActive) {
		this.rC400IsActive = rC400IsActive;
	}

	public boolean isrC495IsActive() {
		return rC495IsActive;
	}

	public void setrC495IsActive(boolean rC495IsActive) {
		this.rC495IsActive = rC495IsActive;
	}

	public boolean isrC500IsActive() {
		return rC500IsActive;
	}

	public void setrC500IsActive(boolean rC500IsActive) {
		this.rC500IsActive = rC500IsActive;
	}

	public boolean isrC600IsActive() {
		return rC600IsActive;
	}

	public void setrC600IsActive(boolean rC600IsActive) {
		this.rC600IsActive = rC600IsActive;
	}

	public boolean isrC700IsActive() {
		return rC700IsActive;
	}

	public void setrC700IsActive(boolean rC700IsActive) {
		this.rC700IsActive = rC700IsActive;
	}

	public boolean isrC800IsActive() {
		return rC800IsActive;
	}

	public void setrC800IsActive(boolean rC800IsActive) {
		this.rC800IsActive = rC800IsActive;
	}

	public boolean isrC860IsActive() {
		return rC860IsActive;
	}

	public void setrC860IsActive(boolean rC860IsActive) {
		this.rC860IsActive = rC860IsActive;
	}

	public boolean isrD001IsActive() {
		return rD001IsActive;
	}

	public void setrD001IsActive(boolean rD001IsActive) {
		this.rD001IsActive = rD001IsActive;
	}

	public boolean isrE001IsActive() {
		return rE001IsActive;
	}

	public void setrE001IsActive(boolean rE001IsActive) {
		this.rE001IsActive = rE001IsActive;
	}

	public boolean isrG001IsActive() {
		return rG001IsActive;
	}

	public void setrG001IsActive(boolean rG001IsActive) {
		this.rG001IsActive = rG001IsActive;
	}

	public boolean isrH001IsActive() {
		return rH001IsActive;
	}

	public void setrH001IsActive(boolean rH001IsActive) {
		this.rH001IsActive = rH001IsActive;
	}

	public RegistroAtivo() {

		this.rR0000IsActive = false;
		this.rC001IsActive = false;
		this.rC100IsActive = false;
		this.rC300IsActive = false;
		this.rC350IsActive = false;
		this.rC400IsActive = false;
		this.rC495IsActive = false;
		this.rC500IsActive = false;
		this.rC600IsActive = false;
		this.rC700IsActive = false;
		this.rC800IsActive = false;
		this.rC860IsActive = false;
		this.rD001IsActive = false;
		this.rE001IsActive = false;
		this.rG001IsActive = false;
		this.rH001IsActive = false;
	}

	public void registroAtivo(String regActive) {

		if (regActive.equals("0000")) {
			// r0000 = new R0000(strs1);
			this.rR0000IsActive = true;

		}
		/*if (regActive.equals("0990")) {

			this.rR0000IsActive = false;
		}*/

		if (regActive.equals("C001")) {

			this.rC001IsActive = true;
			this.rR0000IsActive = false;

		}

		if (regActive.equals("C100")) {
			this.rC100IsActive = true;

		}

		if (regActive.equals("C300")) {
			this.rC300IsActive = true;
			this.rC100IsActive = false;

		}

		if (regActive.equals("C350")) {
			this.rC350IsActive = true;
			this.rC100IsActive = false;
			this.rC300IsActive = false;

		}
		if (regActive.equals("C400")) {
			this.rC400IsActive = true;
			this.rC100IsActive = false;
			this.rC300IsActive = false;
			this.rC350IsActive = false;

		}

		/*if (regActive.equals("C990")) {
			this.rC001IsActive = false;
			this.rR0000IsActive = false;
		}*/

		if (regActive.equals("D001")) {
			this.rD001IsActive = true;
			this.rR0000IsActive = false;
			this.rC001IsActive = false;

		}

		/*if (regActive.equals("D990")) {
			this.rR0000IsActive = false;
			this.rC001IsActive = false;
			this.rD001IsActive = false;
		}*/

		if (regActive.equals("E001")) {
			this.rE001IsActive = true;
			this.rR0000IsActive = false;
			this.rC001IsActive = false;
			this.rD001IsActive = false;

		}

		/*if (regActive.equals("E990")) {
			this.rR0000IsActive = false;
			this.rC001IsActive = false;
			this.rD001IsActive = false;
			this.rE001IsActive = false;

		}*/

		if (regActive.equals("G001")) {
			this.rG001IsActive = true;
			this.rR0000IsActive = false;
			this.rC001IsActive = false;
			this.rD001IsActive = false;
			this.rE001IsActive = false;

		}

		/*if (regActive.equals("G990")) {
			this.rR0000IsActive = false;
			this.rC001IsActive = false;
			this.rD001IsActive = false;
			this.rE001IsActive = false;
			this.rG001IsActive = false;
		}*/

		if (regActive.equals("H001")) {
			this.rH001IsActive = true;
			this.rR0000IsActive = false;
			this.rC001IsActive = false;
			this.rD001IsActive = false;
			this.rE001IsActive = false;
			this.rG001IsActive = false;

		}

		/*if (regActive.equals("H990")) {
			this.rR0000IsActive = false;
			this.rC001IsActive = false;
			this.rD001IsActive = false;
			this.rE001IsActive = false;
			this.rG001IsActive = false;
			this.rH001IsActive = false;
		}*/

	}
}
