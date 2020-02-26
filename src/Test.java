import java.util.ArrayList;
import java.util.List;

/**
 * 获取 每个节点编号  父节点编号  子节点编号   层级(根节点为1)
 */
public class Test {

    private static ArrayList<UsageLink> usageLinks = null;

    public static void main(String[] args) {

        usageLinks = new ArrayList<>();
        UsageLink usageLink1 = new UsageLink();
        usageLink1.setParentNumber("");
        usageLink1.setCurrentNumber("001");
        usageLinks.add(usageLink1);

        UsageLink usageLink2 = new UsageLink();
        usageLink2.setParentNumber("001");
        usageLink2.setCurrentNumber("002");
        usageLinks.add(usageLink2);

        UsageLink usageLink3 = new UsageLink();
        usageLink3.setParentNumber("001");
        usageLink3.setCurrentNumber("003");
        usageLinks.add(usageLink3);

        UsageLink usageLink4 = new UsageLink();
        usageLink4.setParentNumber("001");
        usageLink4.setCurrentNumber("004");
        usageLinks.add(usageLink4);

        UsageLink usageLink5 = new UsageLink();
        usageLink5.setParentNumber("002");
        usageLink5.setCurrentNumber("005");
        usageLinks.add(usageLink5);

        UsageLink usageLink6 = new UsageLink();
        usageLink6.setParentNumber("002");
        usageLink6.setCurrentNumber("006");
        usageLinks.add(usageLink6);

        UsageLink usageLink7 = new UsageLink();
        usageLink7.setParentNumber("003");
        usageLink7.setCurrentNumber("007");
        usageLinks.add(usageLink7);

        UsageLink usageLink8 = new UsageLink();
        usageLink8.setParentNumber("004");
        usageLink8.setCurrentNumber("008");
        usageLinks.add(usageLink8);

        UsageLink usageLink9 = new UsageLink();
        usageLink9.setParentNumber("004");
        usageLink9.setCurrentNumber("009");
        usageLinks.add(usageLink9);

        //已经得到该集合
        for (UsageLink ul:usageLinks) {
            System.out.println("当前节点编号为："+ul.getCurrentNumber()+"父节点编号为："+ul.getParentNumber()+"当前节点所处层级为："+
                    getNum(ul.getCurrentNumber(),ul.getParentNumber())+"当前节点的子节点编号为："+getSonNodes(ul));
        }
    }

    //写一个方法  来求当前节点的所有子节点
    public static List<String> getSonNodes(UsageLink ul){
        ArrayList<String> nodes = new ArrayList<>();
        for (UsageLink uLink : usageLinks){
            if (uLink.getParentNumber().equals(ul.getCurrentNumber())){
                nodes.add(uLink.getCurrentNumber());
            }
        }
        return nodes;
    }

    //写一个递归方法  来求当前节点的层级
    public static int getNum(String current,String parent){
        int num = 0;
        if ("001".equals(current)){  //根节点 直接返回 层级为1
            return 1;
        }else {
            num++;
            current = parent;
            parent = "00"+num;
            return num+getNum(current,parent);
        }
    }


}
