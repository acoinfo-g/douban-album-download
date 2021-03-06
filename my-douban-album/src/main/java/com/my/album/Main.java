package com.my.album;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.my.album.ui.MainFrame;

public class Main {
	public static void main(String[] args) {
		// 可用链接
		// https://movie.douban.com/celebrity/1052297/photos/
		// https://movie.douban.com/subject/30353357/photos?type=S
		// 不可用
		// https://www.douban.com/photos/album/1638511432/

		Display display = new Display();
		Shell shell = new Shell(display);

		MainFrame mainFrame = new MainFrame(shell);
		mainFrame.createContent();

		shell.pack();
		int x = (display.getClientArea().width - shell.getSize().x) / 2;
		int y = (display.getClientArea().height - shell.getSize().y) / 2;
		shell.setLocation(x, y);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
