import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

class xinlaunch {
	/* Name of your XINU directory (where "<XINU_DIRECTORY>/compile" exists with Makefile) */
	public static final String XINU_DIRECTORY = "xinu-fall2015";
	/* Name of the binary file XINU will compile to (sometimes called "xinu.xbin", sometimes "xinu") */
	public static final String XINU_BIN_NAME = "xinu.xbin";

	public static void say(Robot robot, String s) throws InterruptedException {
		for(char c: s.toCharArray()) {
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
			Thread.sleep(6);
			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
		}
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("java.awt.headless", "false");
		Robot robot = new Robot();
		say(robot,"cd ");
		Thread.sleep(6);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(6);
		robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(6);
		say(robot, "/"+XINU_DIRECTORY+"/compile");
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		say(robot,"cs-console");
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(200);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(700);
		say(robot,"d");
		Thread.sleep(700);
		say(robot,XINU_BIN_NAME);
		Thread.sleep(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(200);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		say(robot,"p");
		Thread.sleep(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		robot.keyRelease(KeyEvent.VK_ENTER);
		for(int i = 0; i < 30; i++) 
		{
			Thread.sleep(200);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(200);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}
}

