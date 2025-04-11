package friendarrayexample;

public class FriendApp {
	private String name;
	private String hp;
	private String school;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the hp
	 */
	public String getHp() {
		return hp;
	}
	/**
	 * @param hp the hp to set
	 */
	public void setHp(String hp) {
		this.hp = hp;
	}
	/**
	 * @return the school
	 */
	public String getSc() {
		return school;
	}
	/**
	 * @param sc the school to set
	 */
	public void setSc(String sc) {
		this.school = sc;
	}
	public FriendApp(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}
	@Override
	public String toString() {
		return "이름=" + name + ", 핸드폰=" + hp + ", 학교=" + school + "]";
	}
	
	
}
