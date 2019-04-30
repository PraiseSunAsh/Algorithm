package String;

import java.util.Scanner;

public class StringCompare {
    static int res = 0;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("输入母串");
        StringBuffer longString = new StringBuffer(in.nextLine());
        System.out.println("输入子串");
        StringBuffer ShortString = new StringBuffer(in.nextLine());
        while (true){
            for(int i = 0;i<longString.length();i++){
                for(int j = 0;j<ShortString.length();j++){
                    if(ShortString.charAt(j)==longString.charAt(j)){
                        //比较成功的条件判断
                        if(j==ShortString.length()-1&&ShortString.charAt(ShortString.length()-1)==longString.charAt(ShortString.length()-1)) {
                            res++;//如果子串比较到最后了，并且相等了，说明匹配成功一个
                        }
                    }else break;
                }
                //比较成功后把长串给砍了
                longString.delete(0,ShortString.length()-1);
                //当子串为1时是个特殊情况,只需要砍掉第一个字符
                if(ShortString.length()==1){
                    longString.deleteCharAt(0);
                }
                break;
            }
            if(longString.length()<ShortString.length()){
                break;
            }
        }
        System.out.println(res);
    }
}
