package lc._0002_addTwoNumbers;

import lc.ListNode;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testAddTwoNumbers1(){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode expect = new ListNode(7);
        expect.next = new ListNode(0);
        expect.next.next = new ListNode(8);

        ListNode res = solution.addTwoNumbers(l1, l2);
        assertEquals(expect.val, res.val);
        assertEquals(expect.next.val, res.next.val);
        assertEquals(expect.next.next.val, res.next.next.val);
    }

    @Test
    public void testAddTwoNumbers2(){
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode expect = new ListNode(0);

        ListNode res = solution.addTwoNumbers(l1, l2);
        assertEquals(expect.val, res.val);
    }

    @Test
    public void testAddTwoNumbers3(){
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode expect = new ListNode(8);
        expect.next = new ListNode(9);
        expect.next.next = new ListNode(9);
        expect.next.next.next = new ListNode(9);
        expect.next.next.next.next = new ListNode(0);
        expect.next.next.next.next.next = new ListNode(0);
        expect.next.next.next.next.next.next = new ListNode(0);
        expect.next.next.next.next.next.next.next = new ListNode(1);

        ListNode res = solution.addTwoNumbers(l1, l2);
        assertEquals(expect.val, res.val);
        assertEquals(expect.next.val, res.next.val);
        assertEquals(expect.next.next.val, res.next.next.val);
        assertEquals(expect.next.next.next.val, res.next.next.next.val);
        assertEquals(expect.next.next.next.next.val, res.next.next.next.next.val);
        assertEquals(expect.next.next.next.next.next.val, res.next.next.next.next.next.val);
        assertEquals(expect.next.next.next.next.next.next.val, res.next.next.next.next.next.next.val);
        assertEquals(expect.next.next.next.next.next.next.next.val, res.next.next.next.next.next.next.next.val);

    }
}
