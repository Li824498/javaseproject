package relearn1;

import javax.swing.*;

public class PanelAnimal2 extends PA{
    private static PanelAnimal2 pa2;

    private PanelAnimal2(){

    }

    public static PanelAnimal2 getInstance(){
        if(pa2 == null){
            pa2 = new PanelAnimal2();
        }
        return pa2;
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
        jf.setVisible(true);
    }


    @Override
    public void showkill(){
        System.out.println("start");
    }
}
