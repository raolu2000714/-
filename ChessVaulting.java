import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ChessVaulting {
    public static void main(String satr[]){
        int x=0;
        int y=0;
        int z=0;
        int m=0;
        int n=0;
        int quantity=0;
        System.out.println("-------------象棋跳马-----构造n*m的棋盘---");
        Scanner input=new Scanner(System.in);
        System.out.print("请输入n：");
        n=input.nextInt();
        System.out.print("请输入m：");
        m=input.nextInt();

        ArrayList<Integer> listX=new ArrayList<>();
        ArrayList<Integer> listY=new ArrayList<>();
        ArrayList<Integer> listZ=new ArrayList<>();
        listX.add(x);
        listY.add(y);
        listZ.add(z);

        do {
            int location=listX.size()-1;
            x=(int)listX.get(location);
            y=(int)listY.get(location);
            z=(int)listZ.get(location);
            if(z==0) {
                z++;
                listZ.set(location, z);
                if ((x + 2 <= n - 1) ) {
                    if (y + 1 <= m - 1) {
                        if (x + 2 == n - 1) {
                            if (y + 1 == 0) {
                                System.out.println("---------------");
                                quantity++;
                                for (int i = 0; i < listX.size(); i++) {
                                    System.out.print("(" + listX.get(i) + "," + listY.get(i) + ")->");
                                }
                                System.out.println("(" + (n-1) + "," + 0 + ")");
                            }

                        } else {
                            listX.add(x + 2);
                            listY.add(y + 1);
                            listZ.add(0);
                            continue;
                        }
                    }
                }
            }//第一个方向便利
            if(z==1) {
                z++;
                listZ.set(location, z);
                if ((x + 1 <= n - 1)) {
                    if (y + 2 <= m - 1) {
                        if (x + 1 == n - 1) {
                            if (y + 2 == 0) {
                                System.out.println("---------------");
                                quantity++;
                                for (int i = 0; i < listX.size(); i++) {
                                    System.out.print("(" + listX.get(i) + "," + listY.get(i) + ")->");
                                }
                                System.out.println("(" + (n-1) + "," + 0 + ")");
                            }

                        } else {
                            listX.add(x + 1);
                            listY.add(y + 2);
                            listZ.add(0);
                            continue;
                        }
                    }
                }
            }//第二个方向便利
            if(z==2) {
                z++;
                listZ.set(location, z);
                if ((x + 2 <= n - 1) ) {
                    if ((y - 1 <= m - 1)&&(y-1>=0)) {
                        if (x + 2 == n - 1) {
                            if (y - 1 == 0) {
                                System.out.println("---------------");
                                quantity++;
                                for (int i = 0; i < listX.size(); i++) {
                                    System.out.print("(" + listX.get(i) + "," + listY.get(i) + ")->");
                                }
                                System.out.println("(" + (n-1) + "," + 0 + ")");
                            }

                        } else {
                            listX.add(x + 2);
                            listY.add(y - 1);
                            listZ.add(0);
                            continue;
                        }
                    }
                }
            }//第三个方向便利
            if(z==3) {
                z++;
                listZ.set(location, z);
                if ((x + 1 <= n - 1)) {
                    if ((y - 2 <= m - 1)&&(y-2>=0)) {
                        if (x + 1 == n - 1) {
                            if (y - 2 == 0) {
                                System.out.println("---------------");
                                quantity++;
                                for (int i = 0; i < listX.size(); i++) {
                                    System.out.print("(" + listX.get(i) + "," + listY.get(i) + ")->");
                                }
                                System.out.println("(" + (n-1) + "," + 0 + ")");
                            }
                        } else {
                            listX.add(x + 1);
                            listY.add(y - 2);
                            listZ.add(0);
                            continue;
                        }
                    }
                }
            }//第四个方向便利
            listX.remove(location);
            listY.remove(location);
            listZ.remove(location);
        }while (listX.size()!=0);
        System.out.println(n+"*"+m+"总共有"+quantity+"条路径从左上角到右上角");
    }
}
