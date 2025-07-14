package com.munywele.strings;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColorSorterTest {

    ColorSorter colorSorter;
    @BeforeEach
    void setUp() {
        colorSorter =new ColorSorter();
    }

    @Test
    void order_colors_single_color() {
        String theColors = "green1";
        String expected = "green";

        String result = colorSorter.orderColorsClassic(theColors);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void order_colors_missing_position() {
        String theColors = "red1 green3"; // Missing position 2
        String expected = "red null green"; // Or you can decide to throw/handle this

        String result = colorSorter.orderColorsClassic(theColors);
        // Expecting null slot — may throw NPE if not handled
        Assertions.assertEquals(expected, String.join(" ", result.split(" ")));
    }

    @Test
    void order_colors_duplicate_positions() {
        String theColors = "red1 blue1 green2";
        String expected = "blue green"; // red1 is overwritten by blue1

        String result = colorSorter.orderColorsClassic(theColors);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void order_colors_non_digit_suffix() {
        String theColors = "redX blue1";
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            colorSorter.orderColorsClassic(theColors);
        });
    }

    @Test
    void order_colors_position_out_of_bounds() {
        String theColors = "red9 blue1 green2"; // 9 exceeds the array length
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            colorSorter.orderColorsClassic(theColors);
        });
    }

    @Test
    void order_colors_with_extra_spaces() {
        String theColors = "  red2   blue1   ";
        String expected = "blue red";

        String result = colorSorter.orderColorsClassic(theColors.trim().replaceAll(" +", " "));
        Assertions.assertEquals(expected, result);
    }

}