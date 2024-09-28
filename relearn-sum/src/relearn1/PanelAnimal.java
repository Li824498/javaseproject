package relearn1;

import javax.swing.*;

public class PanelAnimal extends PA{

    {
        System.out.println("1");
    }

    private static PanelAnimal pa = new PanelAnimal();

    private PanelAnimal(){

    }

    public static PanelAnimal getInstance(){
        return pa;
    }

    @Override
    public void show(){
        JFrame jf = new JFrame("管理系统");
        jf.setSize(400, 300);

        JPanel jp = new JPanel();
        jf.add(jp);

        JButton jb = new JButton("登录");
        jp.add(jb);

        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    @Override
    public void showkill(){
        System.out.println("start");
    }

    public class gou{
        public void goujiao(){
            System.out.println("汪");
        }
    }
}
