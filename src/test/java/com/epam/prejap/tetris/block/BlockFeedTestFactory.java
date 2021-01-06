package com.epam.prejap.tetris.block;

import org.testng.annotations.Factory;

public class BlockFeedTestFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[] {
                new BlockFeedTest(LBlock.class.getSimpleName()),
                new BlockFeedTest(OBlock.class.getSimpleName()),
                new BlockFeedTest(JBlock.class.getSimpleName()),
        };
    }
}
