package com.epam.prejap.tetris.block;

import org.testng.annotations.Test;

import java.util.function.Supplier;

import static org.testng.Assert.*;

@Test(groups = "Block")
public class BlockFeedTest {

    private final String blockClassName;

    public BlockFeedTest(String blockClassName) {
        this.blockClassName = blockClassName;
    }

    @Test
    public void shallContainLBlock() {
        //given
        BlockFeed feed = new BlockFeed();

        //when
        boolean containsLBlock = feed.blocks()
                .stream()
                .map(Supplier::get)
                .anyMatch(this::isInstanceOf);

        //then
        assertTrue(containsLBlock);
    }

    @Test(dependsOnMethods = "shallContainLBlock")
    public void shallContainOnlyOneLBlock() {
        //given
        BlockFeed feed = new BlockFeed();

        //when
        var numOfBlocks = feed.blocks()
                .stream()
                .map(Supplier::get)
                .filter(this::isInstanceOf)
                .count();

        //then
        assertEquals(numOfBlocks, 1);
    }

    private boolean isInstanceOf(Block e) {
        return e.getClass().getSimpleName().equals(blockClassName);
    }
}
