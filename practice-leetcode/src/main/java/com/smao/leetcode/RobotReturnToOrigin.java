package com.smao.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在 (0, 0) 处结束。
 *
 * 移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有 R（右），L（左），U（上）和 D（下）。如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
 *
 * 注意：机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。此外，假设每次移动机器人的移动幅度相同。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: "UD"
 * 输出: true
 * 解释：机器人向上移动一次，然后向下移动一次。所有动作都具有相同的幅度，因此它最终回到它开始的原点。因此，我们返回 true。
 * 示例 2:
 *
 * 输入: "LL"
 * 输出: false
 * 解释：机器人向左移动两次。它最终位于原点的左侧，距原点有两次 “移动” 的距离。我们返回 false，因为它在移动结束时没有返回原点。
 *
 * 链接：https://leetcode-cn.com/problems/robot-return-to-origin
 */
public class RobotReturnToOrigin {
    public static boolean judgeCircle(String moves) {
        int l = 0;
        int r = 0;
        int u = 0;
        int d = 0;
        for(int i=0;i<moves.length();i++){
            char move = moves.charAt(i);
            if(move=='U'){
                u++;
            }else if(move=='D'){
                d++;
            }else if(move == 'L'){
                l++;
            }else if(move == 'R'){
                r++;
            }
        }
        return u==d&&l==r;
    }
    public static boolean judgeCircle2(String moves) {
        int x = 0;
        int y = 0;
        for(int i=0;i<moves.length();i++){
            char move = moves.charAt(i);
            if(move=='U'){
                y++;
            }else if(move=='D'){
                y--;
            }else if(move == 'L'){
                x++;
            }else if(move == 'R'){
                x--;
            }
        }
        return x==0&&y==0;
    }
    public static void main(String[] args) {
        System.out.println(judgeCircle2("UD"));
    }
}
