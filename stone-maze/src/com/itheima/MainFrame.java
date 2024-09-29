package com.itheima;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame {
    private final static String imagePath = "stone-maze/src/image/";
    private int row;
    private int hol;
    //  创建一个数组，存储数字色块的行列位置
    private int[][] imageData = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    private int[][] winData = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    public MainFrame() {
        initFrame();
        //  4、打乱二维数组的顺序，再展示图片
        initRandomArray();
        //  2、初始化界面，展示数字色块。
        initImage();
        //  3、初始化系统菜单：点击弹出菜单信息是系统退出，重启游戏
        initMenu();
        //  5、给当前窗口绑定上下左右按键事件
        initKeyPressEvent();


        this.setVisible(true);
    }

    private void initKeyPressEvent() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        switchAndMove(Direction.UP);
                        break;
                    case KeyEvent.VK_DOWN:
                        switchAndMove(Direction.DOWN);
                        break;
                    case KeyEvent.VK_LEFT:
                        switchAndMove(Direction.LEFT);
                        break;
                    case KeyEvent.VK_RIGHT:
                        switchAndMove(Direction.RIGHT);
                        break;
                }
            }
        });


    }

    private void switchAndMove(Direction r) {
        switch(r) {
            case UP:
//                System.out.println("上")
                if (row < 3){
                    int temp = imageData[row][hol];
                    imageData[row][hol] = imageData[row + 1][hol];
                    imageData[row + 1][hol] = temp;
                    row++;
                }
                break;
            case DOWN:
                if (row > 0){
                    int temp = imageData[row][hol];
                    imageData[row][hol] = imageData[row - 1][hol];
                    imageData[row - 1][hol] = temp;
                    row--;
                }
                break;
            case LEFT:
                if (hol < 3){
                    int temp = imageData[row][hol];
                    imageData[row][hol] = imageData[row][hol + 1];
                    imageData[row][hol + 1] = temp;
                    hol++;
                }
                break;
            case RIGHT:
                if (hol > 0){
                    int temp = imageData[row][hol];
                    imageData[row][hol] = imageData[row][hol - 1];
                    imageData[row][hol - 1] = temp;
                    hol--;
                }
                break;
        }

        initImage();

    }


    private void initRandomArray() {
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                int i1 = (int) (Math.random() * 4);
                int j1 = (int) (Math.random() * 4);
                int i2 = (int) (Math.random() * 4);
                int j2 = (int) (Math.random() * 4);

                int temp = imageData[i1][j1];
                imageData[i1][j1] = imageData[i2][j2];
                imageData[i2][j2] = temp;
            }
        }
        OUT:
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j] == 0) {
                    row = i;
                    hol = j;
                    break OUT;
                }
            }
        }
    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("系统");
        JMenuItem exitJi = new JMenuItem("退出");
        menu.add(exitJi);
        exitJi.addActionListener(e -> {
            dispose();
        });
        JMenuItem restartJi = new JMenuItem("重启");
        menu.add(restartJi);
        restartJi.addActionListener(e -> {

        });
        menuBar.add(menu);
        this.setJMenuBar(menuBar);
    }

    private void initImage() {
        this.getContentPane().removeAll();

        if(isWin()) {
            JLabel label = new JLabel(new ImageIcon(imagePath + "win.png"));
            label.setBounds(124, 230, 266, 88);
            this.add(label);
        }

        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                String imageName = imageData[i][j] + ".png";
                JLabel label = new JLabel();
                label.setIcon(new ImageIcon(imagePath + imageName));
                label.setBounds(20 + j * 100, 60 + i * 100, 100, 100);
                this.add(label);
            }
        }

        //  设置窗口的背景图片
        JLabel background = new JLabel(new ImageIcon(imagePath + "background.png"));
        background.setBounds(0, 0, 450, 484);
        this.add(background);

        this.repaint();// 刷新界面

    }

    private boolean isWin() {
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j] != winData[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public void initFrame() {
        this.setTitle("石子迷宫 V 1.0 dlei");
        this.setSize(465, 575);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }
}
