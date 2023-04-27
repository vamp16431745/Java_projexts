
package yes;

/**
 *
 * @author user
 */
public class battle {

    public static int attack;
    public static int defence;
    public static int dammage;
    public static double r1;
    public static double r2;

    static void 設定初值() {
        r1 = Math.random(); // 0.0<=r1<1
        r2 = Math.random(); // 0.0<=r2<1
        attack = (int)(r1 * 101);
        defence = (int)(r2 * 101);
        dammage = (attack - defence);
    }

    static void 顯示資料() {
        System.out.println("造成"+attack +"傷害");
        System.out.println("抵禦"+defence +"傷害");
        System.out.println(dammage);
    }

    static void 判斷() {

        if (dammage <= 0) {
            dammage = 0;
            System.out.println(attack);
            System.out.println(defence);
            System.out.print(dammage + "防禦成功");
        } else if (dammage > 0) {
            dammage = (attack - defence);
            System.out.print("造成" + dammage + "傷害");
        }

    }

    static void 跑流程() 
    {
        設定初值();
        顯示資料();
        判斷();
    }
}
