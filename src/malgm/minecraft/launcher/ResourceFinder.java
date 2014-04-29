package malgm.minecraft.launcher;

public class ResourceFinder {
	
	private String folder = "";
	
	private final String icon = "icon.png";
	private final String icon_title = "icon_title.png";
	private final String close = "close.png";
	private final String minimize = "minimize.png";
	private final String background = "background.png";
	
	public ResourceFinder() {
		changeFolder("res/");
	}

	public ResourceFinder(String folder) {
		changeFolder(folder);
	}
	
	public String icon() {
		return getValue(icon);
	}
	
	public String icon_title() {
		return getValue(icon_title);
	}
	
	public String close() {
		return getValue(close);
	}
	
	public String minimize() {
		return getValue(minimize);
	}
	
	public String background() {
		return getValue(background);
	}
	
	public String getResource(String value) {
		return getValue(value);
	}
	
	private String getValue(String value) {
		return folder + value;
	}
	
	public String getFolder() {
		return folder;
	}
	
	public void changeFolder(String folder) {
		this.folder = folder;
	}

}