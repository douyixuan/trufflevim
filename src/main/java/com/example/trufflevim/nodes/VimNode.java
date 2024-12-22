package com.example.trufflevim.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

public abstract class VimNode extends Node {
    public abstract Object execute(VirtualFrame frame);
}

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