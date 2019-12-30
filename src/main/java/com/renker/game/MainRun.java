package com.renker.game;

import java.awt.MenuItem;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MainRun {
	public static void main(String[] args) {
		JFrame jf = new JFrame("GAME-TOOLS");
		jf.setSize(600, 400);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        
        // 创建菜单栏
        JMenuBar menuBar = new JMenuBar();
        jf.setJMenuBar(menuBar);
        // 创建配置菜单
        JMenu configMenu = new JMenu("配置");
        // 创建关于菜单
        JMenu aboutMenu = new JMenu("关于");
        menuBar.add(configMenu);
        menuBar.add(aboutMenu);
        
        JPanel panel = new JPanel();
        
        JButton startButton = new JButton("开始");
        startButton.setSize(50, 50);
        panel.add(startButton);
        
        jf.add(panel);
        jf.setVisible(true);
	}
}
