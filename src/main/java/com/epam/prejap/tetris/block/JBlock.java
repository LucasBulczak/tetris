package com.epam.prejap.tetris.block;

/**
 * The JBlock class represents "J" shaped block in tetris game.
 *
 * @author Łukasz Bulczak
 */
final class JBlock extends Block {

    private static final byte[][] IMAGE = {
            {0, 1},
            {0, 1},
            {1, 1},
    };

    JBlock() {
        super(IMAGE);
    }
}
