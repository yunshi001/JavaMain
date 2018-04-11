package Development.Information.Version;

public class SoftwareVersion {

	public static final SoftwareVersion INSTANCE = new SoftwareVersion();

	public static enum SoftwareBuildType {
		DEVELOPMENT, SPRINT, RELEASE;
	}

	private String softwareBuild = "REL-100.17.000.1017";
	private String softwareVersion = "100.17.000.1017";
	private String softwareTarget = "100.17.000.1017";
	private String softwareIteration = "0";
	private String moconVersion = "N/A";
	private String controlVersion = "N/A";
	private String fpgaInterfaceVersion = "N/A";
	private String linkDateStr = "N/A";
	private String manualHTMLVersion = "N/A";

	public static SoftwareVersion getInstance() {
		return INSTANCE;
	}

	public String getSoftwareVersion() {
		return this.softwareVersion;
	}

	public String getSoftwareBuild() {
		return this.softwareBuild;
	}

	public String getSoftwareTarget() {
		return this.softwareTarget;
	}

	public String getSoftwareIteration() {
		return this.softwareIteration;
	}

	public String getMoconVersion() {
		return this.moconVersion;
	}

	public String getControlVersion() {
		return this.controlVersion;
	}

	public String getFPGAVersion() {
		return this.fpgaInterfaceVersion;
	}

	public String getLinkDate() {
		return this.linkDateStr;
	}

	public String getManualHTMLVersion() {
		return this.manualHTMLVersion;
	}

	public void setControlVersion(String version) {
		this.controlVersion = version;
	}

	public void setMoconVersion(String version) {
		this.moconVersion = version;
	}

	public void setFPGAVersion(String version) {
		this.fpgaInterfaceVersion = version;
	}

}
