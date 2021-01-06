package com.epam.prejap.tetris.block;

/**
 * The JBlock class represents "J" shaped block in tetris game.
 * <p><br>
 *
 * @author Łukasz Bulczak
 */
final class JBlock extends Block {

    /**
     * Field storing the definition of the shape of the block.
     */
    private static final byte[][] IMAGE = {
            {0, 1},
            {0, 1},
            {1, 1},
    };

    /**
     * Constructor that delegates the creation of the object to the constructor of the superclass.
     */
    JBlock() {
        super(IMAGE);
    }
}
