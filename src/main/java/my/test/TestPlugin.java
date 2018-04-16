package my.test;

import net.imagej.Dataset;
import net.imagej.ops.OpService;
import net.imglib2.img.Img;
import org.scijava.ItemIO;
import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

@Plugin( type = Command.class, menuPath = "Plugins>Debug>TestPlugin", headless = true)
public class TestPlugin implements Command {

	@Parameter( type = ItemIO.INPUT )
	private Img input;

	@Parameter( type = ItemIO.OUTPUT )
	private Img output;

	@Parameter
	private OpService op;

	@Override
	public void run() {
		System.out.println("LOGTEST");
		output = input.copy();
		op.image().invert(output, input);
		System.out.println(output);
	}
}