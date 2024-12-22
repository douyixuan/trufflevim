package com.example.trufflevim.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

public abstract class VimNode extends Node {
    public abstract Object execute(VirtualFrame frame);
}