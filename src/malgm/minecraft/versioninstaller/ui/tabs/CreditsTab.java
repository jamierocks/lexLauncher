package malgm.minecraft.versioninstaller.ui.tabs;

import java.awt.Color;
import java.io.IOException;

import javax.swing.*;

public class CreditsTab {
	
	private JLabel text;
	
	private JPanel panel = new JPanel();
	private JPanel textpanel = new JPanel();
	
	public void render(JFrame frame) throws IOException {
		
		// MVI logo
		BaseTab basetab = new BaseTab();
		basetab.render(panel);
		
		// Welcome text
		text = new JLabel("<html>Hello my name is Jamie, I am the creator of Minecraft Version Installer.<br />"
				+ "My aim with Minecraft Version Installer is to make installing mods and etc easy.<br /><br />"
				+ "Hopefully you as the consumer will enjoy using Minecraft Version Installer as<br />"
				+ "much as I did creating it. :)<br /><br />"
				+ "- Jamie</html>");
		textpanel.add(text);
		
		textpanel.setBackground(Color.cyan);
		
		frame.add(panel);
		frame.add(textpanel);
		
	}
	
	public void setVisible(boolean visible) {
		panel.setVisible(visible);
		textpanel.setVisible(visible);
	}

}
