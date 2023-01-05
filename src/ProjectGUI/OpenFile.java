package ProjectGUI;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;

public class OpenFile implements Command {
	
	Functions function;
	
	public OpenFile(Functions function){
		this.function = function;
	}
	
	@Override
	public void execute() {
		function.open();
	}
	

}
