package com.example.trufflevim.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class AddNode extends VimNode {
    @Child private VimNode left;
    @Child private VimNode right;

    @Override
    public Object execute(VirtualFrame frame) {
        int leftValue = (int) left.execute(frame);
        int rightValue = (int) right.execute(frame);
        return leftValue + rightValue;
    }
}