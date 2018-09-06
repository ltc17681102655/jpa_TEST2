package collection.loop;

import org.junit.jupiter.api.Test;

public class dowhile {

    public static void main(String[] args) {


    }

    @Test
    /**
     * do---while
     */
    public void demo() {
        int i = 10;
        do {
            i--;
            if (i == 5) {
                /**
                 * 5.break 关键字
                 * break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。
                 * break 跳出最里层的循环，并且继续执行该循环下面的语句。
                 */
//                break;

                /**
                 * 6.continue 关键字
                 *     continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。
                 *     在 for 循环中，continue 语句使程序立即跳转到更新语句。
                 *     在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。
                 */
                continue;
            }
            System.out.println(i);
        } while (i > 0);
    }

}
