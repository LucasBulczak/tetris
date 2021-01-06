package com.epam.prejap.tetris.block;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

@Test(groups = "Block")
public class JBlockTest {
    @Test
    public void shallCreateJBlockWithCorrectDimensions() {
        //given
        SoftAssert softAssert = new SoftAssert();
        Block jBlock = new JBlock();
        byte[][] expectedImage = new byte[3][2];

        //when
        int actualRows = jBlock.rows;
        int actualCols = jBlock.cols;

        //then
        softAssert.assertTrue(actualRows == expectedImage.length);
        softAssert.assertTrue(actualCols == expectedImage[0].length);
        softAssert.assertAll("Shall create J block with correct dimensions, but did not");
    }
}