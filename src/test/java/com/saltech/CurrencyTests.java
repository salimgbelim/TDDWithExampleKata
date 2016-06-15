package com.saltech;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CurrencyTests {

    @Test
    public void testMultiplication() {

        // Arrange
        Dollar five = new Dollar(5);

        // Act
        Dollar timesTwo = five.times(2);
        Dollar timesThree = five.times(3);

        // Assert
        assertThat(timesTwo.getAmount()).isEqualTo(10);
        assertThat(timesThree.getAmount()).isEqualTo(15);

    }

    @Test
    public void testEquality() {

        // Arrange
        Dollar dollar1 = new Dollar(5);
        Dollar dollar2 = new Dollar(5);

        Dollar dollar3 = new Dollar(6);

        // Act
        boolean isSameDollar = dollar1.equals(dollar2);
        boolean isDifferentDollar = dollar1.equals(dollar3);

        // Assert
        assertThat(isSameDollar).isTrue();
        assertThat(isDifferentDollar).isFalse();
    }
}
