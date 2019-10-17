
public class Auto {
	public Auto (String modello, int anno, int cilindrata) {
		this.modello=modello;
		this.anno=anno;
		this.cilindrata=cilindrata;
	}
	public Auto(String modello, int cilindrata) {
		this.modello=modello;
		this.cilindrata=cilindrata;
	}
	
	protected String getModello() {
		return modello;
	}
	protected void setModello(String modello) {
		this.modello = modello;
	}
	protected int getAnno() {
		return anno;
	}
	protected void setAnno(int anno) {
		this.anno = anno;
	}
	protected int getCilindrata() {
		return cilindrata;
	}
	protected void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	private String modello;
	private int anno;
	private int cilindrata;
}
